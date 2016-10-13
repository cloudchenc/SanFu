package com.example.sanfuproject.activity.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.LvAdapter;
import com.example.sanfuproject.activity.adapters.VpAdapter;
import com.example.sanfuproject.activity.entity.Classify;
import com.example.sanfuproject.activity.utils.Constants;
import com.example.sanfuproject.activity.utils.FragmentFactory;
import com.example.sanfuproject.activity.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

import static com.example.sanfuproject.activity.utils.Constants.category;
import static com.example.sanfuproject.activity.utils.Constants.classifyStr;
import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;

/**
 * Created by Hello on 2016/10/11.
 */


public class ClassifyFrag extends Fragment {

    private View view;
    private Handler handler = new Handler();
    private ArrayList<String> classList = new ArrayList<String>();
    private ArrayList<Fragment> vpList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_classify, null);
        init();
        //x.view().inject(view);
        return view;
    }

    private void init() {
        Button button = (Button) view.findViewById(R.id.open);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.RIGHT);
            }
        });

        new Thread() {
            @Override
            public void run() {
                String classifyJson = JsonUtils.loadJson();
                Classify classify = JsonUtils.parseJson(classifyJson);
                category = classify.getMsg().getCategory();
                for (int i = 0; i < category.size(); i++) {
                    classList.add(category.get(i).getName().replace(" ", ""));
                    System.out.println("--" + classList.toString());
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        ListView listView = (ListView) view.findViewById(R.id.listView);
                        LvAdapter adapter = new LvAdapter(getContext(), classList);
                        listView.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, new String[]{"男装", "女装", "家居内衣", "化妆鞋包"}));
                        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                //view.setBackgroundResource(R.color.class_choosed_bg);
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
                        vpList = new ArrayList<Fragment>();
                        for (int i = 0; i < 4; i++) {
                            vpList.add(FragmentFactory.createFragment(i));
                        }
                        viewPager.setAdapter(new A(getChildFragmentManager()));
                    }
                });
            }
        }.start();
    }

    //适配器
    class A extends FragmentPagerAdapter {

        public A(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return vpList.get(position);
        }

        @Override
        public int getCount() {
            return vpList.size();
        }
    }

    //按钮的点击事件必须用private进行修饰(使用失败)
//    @Event(value = R.id.open, type = View.OnClickListener.class)
//    private void search(View view) {
//        System.out.println("--456");
//        drawerLayout.openDrawer(Gravity.RIGHT);
//    }

}
