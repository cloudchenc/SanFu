package com.example.sanfuproject.activity;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.entity.Goods;
import com.example.sanfuproject.activity.entity.Search;
import com.squareup.picasso.Picasso;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.R.attr.data;
import static com.example.sanfuproject.R.id.image;
import static com.example.sanfuproject.R.id.search;
import static com.example.sanfuproject.activity.utils.Constants.goodsSearch;

public class GoodsActivity extends AppCompatActivity {

    private String detailJson;
    private ArrayList<View> photoList = new ArrayList<View>();
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
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
        Goods goods = JSON.parseObject(detailJson, Goods.class);
        List<Goods.MsgBean.GoodsPhotolistBean> photolist = goods.getMsg().getGoodsPhotolist();
        for (Goods.MsgBean.GoodsPhotolistBean bean : photolist) {
            ImageView imageView = new ImageView(this);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels / 2);
            imageView.setLayoutParams(params);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(this).load(bean.getBase_img()).into(imageView);
            photoList.add(imageView);
        }
        adapter.notifyDataSetChanged();
    }

    private void initView() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.goods_detail_new_vpg_image_scroll);
        viewPager.setAdapter(adapter = new PagerAdapter() {
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
    }
}
