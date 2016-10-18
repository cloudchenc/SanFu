package com.example.sanfuproject.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.HomeGridView;
import com.example.sanfuproject.activity.adapters.HomeGridView1;
import com.example.sanfuproject.activity.view.MyGridView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static com.example.sanfuproject.activity.utils.Constants.datas;
import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;


public class HomeFrag extends Fragment {

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
//        System.out.println("--111111parsejson");
//            System.out.println("--111111" + datas);

            for (int i = 0; i < 8; i++) {
                if (i == 2) {
                    for (int j = 0; j < datas.get(i).getList().size(); j++) {
                        list4.add(datas.get(i).getList().get(j).getImg());
                    }
                    System.out.println("==" + list4.size());
                    MyGridView gridView1 = (MyGridView) view.findViewById(R.id.gridView1);
                    HomeGridView1 adapter1 = new HomeGridView1(getContext(), (ArrayList<String>) list4);
                    gridView1.setAdapter(adapter1);


                } else if (i == 4) {
                    for (int j = 1; j < datas.get(i).getList().size(); j++) {
                        list5.add(datas.get(i).getList().get(j).getImg());
                    }
                    MyGridView gridView2= (MyGridView) view.findViewById(R.id.gridView2);
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
        }
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
        ImageButton image_menu = (ImageButton) view.findViewById(R.id.image_menu);
        image_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.LEFT);
            }
        });

        Button bt = (Button) view.findViewById(R.id.search);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.RIGHT);
            }
        });
    }
}
