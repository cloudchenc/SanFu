package com.example.sanfuproject.activity;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.GoodsLvAdapter;
import com.example.sanfuproject.activity.entity.Goods;
import com.example.sanfuproject.activity.entity.Search;
import com.example.sanfuproject.activity.view.MyListView;
import com.squareup.picasso.Picasso;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.R.attr.data;
import static com.example.sanfuproject.R.id.image;
import static com.example.sanfuproject.R.id.search;
import static com.example.sanfuproject.R.id.textView;
import static com.example.sanfuproject.activity.utils.Constants.goodsSearch;

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
}
