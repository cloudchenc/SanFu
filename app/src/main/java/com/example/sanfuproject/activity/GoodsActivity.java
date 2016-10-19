package com.example.sanfuproject.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.GoodsLvAdapter;
import com.example.sanfuproject.activity.adapters.WinconGridAdapter;
import com.example.sanfuproject.activity.adapters.WinproLvAdapter;
import com.example.sanfuproject.activity.entity.Goods;
import com.example.sanfuproject.activity.utils.MyDbBase;
import com.example.sanfuproject.activity.entity.ShopCart;
import com.example.sanfuproject.activity.view.MyListView;
import com.example.sanfuproject.activity.view.ScrollViewContainer;
import com.squareup.picasso.Picasso;

import org.xutils.common.Callback;
import org.xutils.ex.DbException;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.sanfuproject.activity.MyApplication.db;

public class GoodsActivity extends AppCompatActivity {

    @ViewInject(R.id.goods_detail_new_txv_goods_name)
    TextView goods_name;
    @ViewInject(R.id.goods_detail_new_txv_sale_num)
    TextView sale_num;
    @ViewInject(R.id.goods_detial_new_buy_price)
    TextView buy_price;
    @ViewInject(R.id.goods_detial_new_see_price)
    TextView see_price;
    @ViewInject(R.id.goods_detial_new_webview)
    WebView webView;

    private String detailJson;
    private ArrayList<View> photoList = new ArrayList<View>();
    private PagerAdapter adapter;
    private Goods goods;
    private GoodsLvAdapter Lvadapter;
    private ArrayList<Map<String, String>> data = new ArrayList<Map<String, String>>();
    private ArrayList<View> vp_view;
    private ArrayList<Map<String, String>> pro_data = new ArrayList<Map<String, String>>();
    private WinproLvAdapter proAdapter;
    private ArrayList<Map<String, String>> con_data = new ArrayList<Map<String, String>>();
    private static int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        x.view().inject(this);
        initView();
    }

    private void initData() {
        String url = getIntent().getStringExtra("detail");
        System.out.println("--" + url);
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String s) {
                detailJson = s;
                getData();
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void getData() {
        goods = JSON.parseObject(detailJson, Goods.class);
        List<Goods.MsgBean.GoodsPhotolistBean> photolist = goods.getMsg().getGoodsPhotolist();
        for (Goods.MsgBean.GoodsPhotolistBean bean : photolist) {
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Picasso.with(this).load(bean.getBase_img()).into(imageView);
            photoList.add(imageView);
        }
        adapter.notifyDataSetChanged();

        String name = goods.getMsg().getGoods().getGoods_name() + goods.getMsg().getGoods().getGoods_sn();
        goods_name.setText(name);
        String num = "销售" + goods.getMsg().getGoods().getNum() + "件";
        sale_num.setText(num);
        String new_buy = "￥" + goods.getMsg().getGoods().getMb_price() + ".00";
        buy_price.setText(new_buy);
        String new_see = "VIP价：￥" + (double) goods.getMsg().getGoods().getMb_price() * 0.90 + "0";
        see_price.setText(new_see);
        //设置webview自适应
        WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        String url = "http://m.sanfu.com/html/txt/" + goods.getMsg().getGoods().getId() + ".html";
        webView.loadUrl(url);

        List<Goods.MsgBean.PromolistBean> promolist = goods.getMsg().getPromolist();
        for (Goods.MsgBean.PromolistBean bean : promolist) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("wayStr", bean.getWayStr());
            map.put("name", "【" + bean.getName() + "】");
            data.add(map);
        }
        Lvadapter.notifyDataSetChanged();

        //产品参数: 数据源混乱
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("class", "类型");
        map1.put("content", goods.getMsg().getGoodsProps().getPattern());
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("class", "季节");
        map2.put("content", goods.getMsg().getGoodsProps().getSeason());
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("class", "货号");
        map3.put("content", goods.getMsg().getGoodsProps().getGoods_sn() + "");
        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("class", "系列");
        map4.put("content", goods.getMsg().getGoodsProps().getNetcollection());
        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("class", "材质");
        map5.put("content", goods.getMsg().getGoodsProps().getMaterial());
        Map<String, String> map6 = new HashMap<String, String>();
        map6.put("class", "风格");
        map6.put("content", goods.getMsg().getGoodsProps().getGoostyle());
        Map<String, String> map7 = new HashMap<String, String>();
        map7.put("class", "温馨提示");
        map7.put("content", "");
        Map<String, String> map8 = new HashMap<String, String>();
        map8.put("class", "商品描述");
        map8.put("content", "");
        pro_data.add(map1);
        pro_data.add(map2);
        pro_data.add(map3);
        pro_data.add(map4);
        pro_data.add(map5);
        pro_data.add(map6);
        pro_data.add(map7);
        pro_data.add(map8);

        //购物车参数
        List<Goods.MsgBean.GoodsSpeciBean> speci = goods.getMsg().getGoodsSpeci();
        for (Goods.MsgBean.GoodsSpeciBean bean : speci) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("number", bean.getNumber() + "");
            map.put("size_name", bean.getSize_name());
            map.put("color_name", bean.getColor_name());
            con_data.add(map);
        }
//        System.out.println("--con_data:" + con_data);

        //计算库存
        for (Map<String, String> item : con_data) {
            number += Integer.parseInt(item.get("number"));
        }
    }

    private void initView() {
        ViewPager vpg_image = (ViewPager) findViewById(R.id.goods_detail_new_vpg_image_scroll);
        vpg_image.setAdapter(adapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return photoList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(photoList.get(position));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(photoList.get(position));
                return photoList.get(position);
            }
        });
        MyListView listView = (MyListView) findViewById(R.id.goods_detial_new_lsv_active);
        Lvadapter = new GoodsLvAdapter(this, data);
        listView.setAdapter(Lvadapter);

        ViewPager vpg_pin_and_wen = (ViewPager) findViewById(R.id.goods_detail_new_vpg_pin_and_wen);
        vp_view = new ArrayList<View>();
        vp_view.add(getLayoutInflater().inflate(R.layout.evaluation, null));
        vp_view.add(getLayoutInflater().inflate(R.layout.advisory, null));
        vpg_pin_and_wen.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return vp_view.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(vp_view.get(position));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(vp_view.get(position));
                return vp_view.get(position);
            }
        });
    }

    @Event(R.id.goods_detail_new_liy_shopping_items)
    private void showPro(View view) {
        showProduct();
    }

    @Event(value = {R.id.goods_detail_new_liy_selected_size_and_color, R.id.goods_detail_new_txv_add_cart, R.id.goods_detail_new_txv_buy_first})
    private void showCart(View view) {
        showCartWindow();
    }

    boolean size_flag = false;
    boolean color_flag = false;
    String size_name;
    String color_name;

    private void showCartWindow() {
        // 利用layoutInflater获得View
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.window_cart, null);

        ImageView content_img = (ImageView) view.findViewById(R.id.content_img);
        Picasso.with(this).load(goods.getMsg().getGoodsPhotolist().get(0).getM_img()).into(content_img);

        TextView content_price = (TextView) view.findViewById(R.id.content_price);
        content_price.setText("￥" + goods.getMsg().getGoods().getMb_price() + ".00");

        TextView content_number = (TextView) view.findViewById(R.id.content_number);
        content_number.setText("库存(" + number + ")件");

        final GridView grid_size_name = (GridView) view.findViewById(R.id.grid_size_name);
        final WinconGridAdapter sizeAdapter = new WinconGridAdapter(this, con_data, "size_name");
        grid_size_name.setAdapter(sizeAdapter);

        grid_size_name.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                size_flag = true;
                View childAt = grid_size_name.getChildAt(position);
                TextView textView = (TextView) childAt.findViewById(R.id.win_cart_name);
                size_name = textView.getText().toString();
                sizeAdapter.changeSelected(position);
                sizeAdapter.notifyDataSetInvalidated();
            }
        });

        final GridView grid_color_name = (GridView) view.findViewById(R.id.grid_color_name);
        final WinconGridAdapter colorAdapter = new WinconGridAdapter(this, con_data, "color_name");
        grid_color_name.setAdapter(colorAdapter);
        grid_color_name.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                color_flag = true;
                View childAt = grid_color_name.getChildAt(position);
                TextView textView = (TextView) childAt.findViewById(R.id.win_cart_name);
                color_name = textView.getText().toString();
                colorAdapter.changeSelected(position);
                colorAdapter.notifyDataSetInvalidated();
            }
        });

        final TextView content_num = (TextView) view.findViewById(R.id.content_num);
        final Button del_num = (Button) view.findViewById(R.id.del_num);
        del_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt((String) content_num.getText());
                if (current > 1) {
                    current--;
                }
                //大坑！！！不转为字符串默认是资源id，所以报出Resources$NotFoundException
                content_num.setText(current + "");
            }
        });
        Button add_num = (Button) view.findViewById(R.id.add_num);
        add_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt((String) content_num.getText());
                current++;
                //大坑！！！不转为字符串默认是资源id，所以报出Resources$NotFoundException
                content_num.setText(current + "");
            }
        });

        // 下面是两种方法得到宽度和高度 getWindow().getDecorView().getWidth()

        final PopupWindow window = new PopupWindow(view,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT);

        // 设置popWindow弹出窗体可点击，这句话必须添加，并且是true
        window.setFocusable(true);

        // 设置popWindow的显示和消失动画
        window.setAnimationStyle(R.style.mypopwindow_anim_style);
        // 在底部显示
        window.showAtLocation(GoodsActivity.this.findViewById(R.id.goods_detail_new_txv_add_cart),
                Gravity.BOTTOM, 0, 0);

        // 这里检验popWindow里的button是否可以点击
        ImageView close_img = (ImageView) view.findViewById(R.id.close_content);
        close_img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                System.out.println("--closeWindow");
                window.dismiss();
            }
        });

        Button content_sure = (Button) view.findViewById(R.id.content_sure);
        content_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (size_flag) {
                    if (color_flag) {
                        ShopCart shopCart = new ShopCart(goods.getMsg().getGoodsPhotolist().get(0).getS_img(), goods.getMsg().getGoods().getGoods_name() + goods.getMsg().getGoods().getGoods_sn(), "尺码:" + size_name, "颜色:" + color_name, "￥" + goods.getMsg().getGoods().getMb_price() + ".00", "x" + content_num.getText());
                        try {
                            System.out.println("--db:" + shopCart.toString());
                            db.save(shopCart);

                            window.dismiss();
                            jump2cart();
                        } catch (DbException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "请选择颜色", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "请选择尺码", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //popWindow消失监听方法
        window.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
//                System.out.println("popWindow消失");
            }
        });
    }

    private void jump2cart() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("加入购物车");
        dialog.setMessage("加入购物车成功!");
        dialog.setNegativeButton("去购物车", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("cart", "购物车");
                startActivity(intent);
            }
        });
        dialog.setPositiveButton("继续购物", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("--" + which);
            }
        });
        dialog.create().show();
    }

    private void showProduct() {
        // 利用layoutInflater获得View
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.window_product, null);

        ListView listView = (ListView) view.findViewById(R.id.product_listView);
        proAdapter = new WinproLvAdapter(this, pro_data);
        listView.setAdapter(proAdapter);

        // 下面是两种方法得到宽度和高度 getWindow().getDecorView().getWidth()

        final PopupWindow window = new PopupWindow(view,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT);

        // 设置popWindow弹出窗体可点击，这句话必须添加，并且是true
        window.setFocusable(true);

        // 设置popWindow的显示和消失动画
        window.setAnimationStyle(R.style.mypopwindow_anim_style);
        // 在底部显示
        window.showAtLocation(GoodsActivity.this.findViewById(R.id.goods_detail_new_liy_shopping_items),
                Gravity.BOTTOM, 0, 0);

        // 这里检验popWindow里的button是否可以点击
        ImageView close_img = (ImageView) view.findViewById(R.id.close_product);
        close_img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                System.out.println("--closeWindow");
                window.dismiss();
            }
        });

        //popWindow消失监听方法
        window.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
//                System.out.println("popWindow消失");
            }
        });
    }

    //点击回到顶部
    @Event(R.id.goods_detail_new__back_top)
    private void back2Top(View view) {
        ScrollViewContainer container = (ScrollViewContainer) findViewById(R.id.goods_drtial_new_scrollviewcontainer);
        container.scrollToTop();
    }
}
