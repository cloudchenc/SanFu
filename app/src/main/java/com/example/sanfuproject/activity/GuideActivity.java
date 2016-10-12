package com.example.sanfuproject.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.sanfuproject.R;

import java.util.ArrayList;


public class GuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    ArrayList<View> datas = new ArrayList<View>();
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private ImageView mvs[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initData();
        initPoints();
        initView();
    }

    private void initPoints() {
        linearLayout = (LinearLayout) findViewById(R.id.points);
        int count = linearLayout.getChildCount();
        mvs = new ImageView[count];
        for (int i = 0; i < count; i++) {
            ImageView view = (ImageView) linearLayout.getChildAt(i);
            mvs[i] = view;
        }
    }

    private void initData() {
        ImageView a = new ImageView(this);
        a.setScaleType(ImageView.ScaleType.FIT_XY);
        a.setImageResource(R.drawable.image_page3);

        ImageView b = new ImageView(this);
        b.setScaleType(ImageView.ScaleType.FIT_XY);
        b.setImageResource(R.drawable.image_page4);

        View c = View.inflate(this, R.layout.lastimage, null);

        datas.add(a);
        datas.add(b);
        datas.add(c);

    }

    public void jump(View v) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.scale_in, R.anim.scala_out);
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.first_vp);
        viewPager.setOnPageChangeListener(this);
        viewPager.setAdapter(new A());
    }

    class A extends PagerAdapter {

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(datas.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(datas.get(position));
            return datas.get(position);
        }

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    int current = 0;

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        if (arg0 == current) {
            mvs[arg0].setImageResource(android.R.drawable.presence_online);
        } else {
            mvs[arg0].setImageResource(android.R.drawable.presence_online);

            mvs[current].setImageResource(android.R.drawable.presence_invisible);
            current = arg0;
        }
        //显示最后一页
        if (arg0 == datas.size() - 1) {
            //引导完成
            SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
            SharedPreferences.Editor ed = sp.edit();
            ed.putBoolean("isGuid", true).commit();
        }
    }

    @Override
    public void onPageSelected(int arg0) {

    }
}



