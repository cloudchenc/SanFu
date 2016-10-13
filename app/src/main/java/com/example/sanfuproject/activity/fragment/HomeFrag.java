package com.example.sanfuproject.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.ClassRoomActivity;
import com.example.sanfuproject.activity.FoundActivity;
import com.example.sanfuproject.activity.PlusActivity;
import com.example.sanfuproject.activity.utils.Constants;
import com.example.sanfuproject.activity.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;

/**
 * Created by Hello on 2016/10/11.
 */

public class HomeFrag extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, null);
        initView();
        initData();
        return view;
    }

    private void initData() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        //开启线程
        es.execute(new Runnable() {
            @Override
            public void run() {
                String path = Constants.discount;
                String json = JsonUtils.loadJson(path);
                parseJSON(json);
            }
        });

        //停止线程
    }

    private void parseJSON(String json) {
        //将普通string转化为json
        JSONObject a = JSON.parseObject(json);
        String root = a.getString("data");
        JSONObject b = JSON.parseObject(root);
        //获取所有值

    }

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

    public static class LeftFrag extends Fragment {
        private View view;
        private List<String> list;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            view = inflater.inflate(R.layout.fragment_left, null);
            initDate();
            init();
            return view;
        }

        private void initDate() {
            list = new ArrayList<>();
            list.add("男生   BOYS");
            list.add("女生   GIRLS");
            list.add("饰品   ACCESSORIES");
            list.add("折扣专区   SALL");
            list.add("时尚优选   PLUS");
            list.add("形象学堂   CLASSROOM");
            list.add("发现   FOUND");
        }

        private void init() {
            ListView listView = (ListView) view.findViewById(R.id.menu_listView);
            ArrayAdapter<String> ad = new ArrayAdapter<String>
                    (getActivity().getBaseContext(), android.R.layout.simple_expandable_list_item_1, list);
            listView.setAdapter(ad);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    //               Toast.makeText(getActivity().getBaseContext(), ""+position, Toast.LENGTH_SHORT).show();
                    Intent it = null;
                    switch (position) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            it = new Intent(getActivity(), PlusActivity.class);
                            startActivity(it);
                            break;
                        case 5:
                            it = new Intent(getActivity(), ClassRoomActivity.class);
                            startActivity(it);
                            break;
                        case 6:
                            it = new Intent(getActivity(), FoundActivity.class);
                            startActivity(it);
                            break;
                    }

                }
            });
        }

    }
}
