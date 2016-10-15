package com.example.sanfuproject.activity.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.LvAdapter;
import com.example.sanfuproject.activity.adapters.VpAdapter;
import com.example.sanfuproject.activity.utils.FragmentFactory;

import java.util.ArrayList;

import static com.example.sanfuproject.activity.utils.Constants.category;
import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;

/**
 * Created by Hello on 2016/10/11.
 */


public class ClassifyFrag extends Fragment {

    private View view;
    private Handler handler = new Handler();
    private ArrayList<String> classList = new ArrayList<String>();
    private ArrayList<Fragment> vpList;
    private LvAdapter adapter;
    private ViewPager viewPager;

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

            for (int i = 0; i < category.size(); i++) {
                classList.add(category.get(i).getName().replace(" ", ""));
                System.out.println("--" + classList.toString());
            }

        handler.post(new Runnable() {
            @Override
            public void run() {
                ListView listView = (ListView) view.findViewById(R.id.listView);
                adapter = new LvAdapter(getContext(), classList);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        System.out.println("--item");
                        change(position);

                    }
                });
                viewPager = (ViewPager) view.findViewById(R.id.viewpager);
                vpList = new ArrayList<Fragment>();
                for (int i = 0; i < 4; i++) {
                    vpList.add(FragmentFactory.createFragment(i));
                }
                viewPager.setAdapter(new VpAdapter(getChildFragmentManager(), vpList));
                viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        change(position);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
            }
        });
    }

    private void change(int position) {
        adapter.changeSelected(position);
        adapter.notifyDataSetInvalidated();
        viewPager.setCurrentItem(position);
    }

    //按钮的点击事件必须用private进行修饰(使用失败)
//    @Event(value = R.id.open, type = View.OnClickListener.class)
//    private void search(View view) {
//        System.out.println("--456");
//        drawerLayout.openDrawer(Gravity.RIGHT);
//    }

}
