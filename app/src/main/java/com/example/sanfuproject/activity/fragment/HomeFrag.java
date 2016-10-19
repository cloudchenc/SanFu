package com.example.sanfuproject.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.PlusActivity;
import com.example.sanfuproject.activity.SearchActivity;
import com.example.sanfuproject.activity.adapters.HomeGridView;
import com.example.sanfuproject.activity.adapters.HomeGridView1;
import com.example.sanfuproject.activity.entity.Classify;
import com.example.sanfuproject.activity.entity.Home;
import com.example.sanfuproject.activity.utils.JsonUtils;
import com.example.sanfuproject.activity.view.MyGridView;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.example.sanfuproject.activity.utils.Constants.category;
import static com.example.sanfuproject.activity.utils.Constants.classifyStr;
import static com.example.sanfuproject.activity.utils.Constants.datas;
import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;
import static com.example.sanfuproject.activity.utils.Constants.homeStr;
import static com.example.sanfuproject.activity.utils.Constants.keyword;


public class HomeFrag extends Fragment {
    Handler handler = new Handler();
    private MyGridView gridView1;
    private MyGridView gridView2;

    private View view;
    //图片id集合
    List<ImageView> list = new ArrayList<>();

    //图片url集合
    List<String> list2 = new ArrayList<>();

    //GridView的图片集合
    List<String> list4 = new ArrayList<>();
    List<String> list5 = new ArrayList<>();

    //WebView的图片集合
    List<String> list3 = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, null);
        initdata();

        return view;
    }

    //开始解析数据
    private void initdata() {

        if (datas != null) {
            for (int i = 0; i < 8; i++) {
                if (i == 2) {
                    for (int j = 0; j < datas.get(i).getList().size(); j++) {
                        list4.add(datas.get(i).getList().get(j).getImg());
                    }
                    System.out.println("==" + list4.size());

                    gridView1 = (MyGridView) view.findViewById(R.id.gridView1);
                    HomeGridView1 adapter1 = new HomeGridView1(getContext(), (ArrayList<String>) list4);
                    gridView1.setAdapter(adapter1);


                } else if (i == 4) {
                    for (int j = 1; j < datas.get(i).getList().size(); j++) {
                        list5.add(datas.get(i).getList().get(j).getImg());
                    }

                    gridView2 = (MyGridView) view.findViewById(R.id.gridView2);
                    HomeGridView adapter2 = new HomeGridView(getContext(), (ArrayList<String>) list5);
                    gridView2.setAdapter(adapter2);
                } else {
                    for (int j = 0; j < datas.get(i).getList().size(); j++) {
                        list2.add(datas.get(i).getList().get(j).getImg());
                    }
                }
            }
            init();
            data();
            //设置监听器
            initView();
        } else {
            //网络判断，重新连接
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayouy);
            TextView textView_no = new TextView(getActivity());
            textView_no.setSingleLine(false);
            textView_no.setText("请检查网络连接"+"\n"+"轻点重试");
            textView_no.setGravity(Gravity.CENTER_HORIZONTAL);
            ImageView imageView_no = new ImageView(getActivity());
            imageView_no.setImageResource(R.drawable.shop_content_error_logo);
            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            param.leftMargin = 0;
            param.topMargin = 300;
            param.gravity = Gravity.CENTER;  //必须要加上这句，setMargins才会起作用，而且此句还必须在setMargins下面
            imageView_no.setLayoutParams(param);
            linearLayout.addView(imageView_no);
            linearLayout.addView(textView_no);
            //点击重新请求数据
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new Thread() {
                        @Override
                        public void run() {
                            String homejson = JsonUtils.loadJson(homeStr);
                            Home h = JSON.parseObject(homejson, Home.class);
                            datas = h.getMsg().getIndex();
                            System.out.println("==$$$" + datas);
                            String classifyJson = JsonUtils.loadJson(classifyStr);
                            Classify classify = JsonUtils.parseJson(classifyJson);
                            category = classify.getMsg().getCategory();
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    lunhuan();
                                }
                            });
                        }
                    }.start();
                }
            });
        }
    }

    private void lunhuan() {
        System.out.println("===" + datas);
        initdata();
    }


    //添加id集合
    private void init() {
        int[] str = new int[]{R.id.image1, R.id.image2_1, R.id.image2_2, R.id.image2_3, R.id.image2_4,
                R.id.image5_0, R.id.image5_1, R.id.image5_2, R.id.image6, R.id.image7, R.id.image8, R.id.image9_1,
                R.id.image9_2, R.id.image9_3, R.id.image9_4, R.id.image10_1, R.id.image10_2};
        for (int i = 0; i < str.length; i++) {
            ImageView image = (ImageView) view.findViewById(str[i]);
            list.add(image);
        }
    }

    //设置图片数据
    private void data() {
        for (int i = 0; i < list.size(); i++) {
            Picasso.with(getContext()).load(list2.get(i))
                    .into(list.get(i));
        }
    }

    //设置监听器
    private void initView() {
        //左上角侧滑
        ImageButton image_menu = (ImageButton) view.findViewById(R.id.image_menu);
        image_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.LEFT);
            }
        });

        //搜索按钮监听
        Button bt = (Button) view.findViewById(R.id.search);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.RIGHT);
            }
        });

        //倒计时监听
        final TextView textViewh = (TextView) view.findViewById(R.id.text_h);
        final TextView textViewm = (TextView) view.findViewById(R.id.text_m);
        final TextView textViews = (TextView) view.findViewById(R.id.text_s);
        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        final String m;
                        final String h;
                        final String s;
                        Date date = new Date();
                        DateFormat format = new SimpleDateFormat("HHmmss");
                        String timeStr = format.format(date);

                        if ((24 - Integer.parseInt(timeStr.substring(0, 2))) > 10) {
                            m = Integer.toString(23 - Integer.parseInt(timeStr.substring(0, 2)));
                        } else {
                            m = 0 + Integer.toString(23 - Integer.parseInt(timeStr.substring(0, 2)));
                        }
                        if ((60 - Integer.parseInt(timeStr.substring(2, 4))) > 10) {
                            h = Integer.toString(59 - Integer.parseInt(timeStr.substring(2, 4)));
                        } else {
                            h = 0 + Integer.toString(59 - Integer.parseInt(timeStr.substring(2, 4)));
                        }
                        if ((60 - Integer.parseInt(timeStr.substring(4, 6))) > 10) {
                            s = Integer.toString(59 - Integer.parseInt(timeStr.substring(4, 6)));
                        } else {
                            s = 0 + Integer.toString(59 - Integer.parseInt(timeStr.substring(4, 6)));
                        }

//                        System.out.println("==" + timeStr);
                        Thread.sleep(1000);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                textViewh.setText(m);
                                textViewm.setText(h);
                                textViews.setText(s);

                            }
                        });
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        //详情列表图片监听
        final String[] arr1 = getResources().getStringArray(R.array.arr1);
        ImageView[] arr2 = new ImageView[]{list.get(0), list.get(6), list.get(7), list.get(9)};
        for (int i = 0; i < arr1.length; i++) {
            final int finalI = i;
            arr2[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    keyword = arr1[finalI];
                    Intent intent = new Intent(getContext(), SearchActivity.class);
                    intent.putExtra("keyword", keyword);
                    startActivity(intent);
                }
            });
        }


        //第一个gridview的监听
        final String[] arr3 = getResources().getStringArray(R.array.arr3);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), SearchActivity.class);
                intent.putExtra("keyword", arr3[position]);
                startActivity(intent);
            }
        });

        list3.add(datas.get(1).getList().get(1).getType_value());
        list3.add(datas.get(1).getList().get(2).getType_value());
        list3.add(datas.get(1).getList().get(3).getType_value());
        list3.add(datas.get(3).getList().get(0).getType_value());
        list3.add(datas.get(5).getList().get(0).getType_value());
        list3.add(datas.get(6).getList().get(0).getType_value());
        list3.add(datas.get(6).getList().get(1).getType_value());
        list3.add(datas.get(6).getList().get(2).getType_value());
        list3.add(datas.get(6).getList().get(3).getType_value());
        list3.add(datas.get(6).getList().get(4).getType_value());
        list3.add(datas.get(7).getList().get(0).getType_value());
        list3.add(datas.get(7).getList().get(1).getType_value());

        //webview的监听
        ImageView[] arr4 = new ImageView[]{list.get(2), list.get(3), list.get(4), list.get(5), list.get(8), list.get(10), list.get(11), list.get(12), list.get(13), list.get(14), list.get(15), list.get(16)};
        for (int i = 0; i < arr4.length; i++) {
            final int finalI = i;
            arr4[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String path = list3.get(finalI);
                    Intent intent = new Intent(getContext(), PlusActivity.class);
                    intent.putExtra("path", path);
                    startActivity(intent);
                }
            });
        }

    }
}
