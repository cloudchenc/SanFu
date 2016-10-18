package com.example.sanfuproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.FreshGridAdapter;
import com.example.sanfuproject.activity.entity.Search;
import com.example.sanfuproject.activity.utils.GetDataTask;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.example.sanfuproject.R.id.search;
import static com.example.sanfuproject.activity.utils.Constants.goodsSearch;
import static com.example.sanfuproject.activity.utils.Constants.keyword;

public class SearchActivity extends AppCompatActivity {

    private String searchJson;
    private LinkedList<Map<String, Object>> data = new LinkedList<Map<String, Object>>();
    private FreshGridAdapter adapter;
    private PullToRefreshGridView mPullRefreshGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
    }

    private void initData() {
        goodsSearch = "http://m.sanfu.com/app/goods/goodsList.htm?goods.class_id=&page=1&pageSize=40&goods.search_words=" + keyword + "&goods.is_disc=0&goods.is_hot=0&goods.is_new=2&goods.is_best=0&sid=a9f809a7c00111dd3abc3d49a06da2e4&source=1&key=lflrnhsahuogcuy&sign=E88688DE70D40C1B098A2BCABA4756C7";
//        System.out.println("--" + goodsSearch);
        RequestParams params = new RequestParams(goodsSearch);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String s) {
                searchJson = s;
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
        Search search = JSON.parseObject(searchJson, Search.class);
        List<Search.MsgBean.GoodsInfosBean> goodsInfos = search.getMsg().getGoodsInfos();
        for (Search.MsgBean.GoodsInfosBean bean : goodsInfos) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("l_img", bean.getL_img());
            map.put("goods_name", bean.getGoods_name());
            map.put("mb_price", bean.getMb_price());
            map.put("goods_sn", bean.getGoods_sn());
            data.add(map);
        }
        adapter.notifyDataSetChanged();
//        System.out.println("--data:" + data);
    }

    private void initView() {
        //初始化搜索框，设置关键字
        keyword = getIntent().getStringExtra("keyword");
//        System.out.println("--" + keyword);
        EditText editText = (EditText) findViewById(R.id.search_activity_edit);
        editText.setText(keyword);

        //初始化gridview，添加适配器加载数据
        mPullRefreshGridView = (PullToRefreshGridView) findViewById(R.id.goods_list_gridview);
        //设置空视图
        View view = findViewById(R.id.goods_list_linearlayout_no_data);
        mPullRefreshGridView.setEmptyView(view);
        // 设置监听器，这个监听器是可以监听双向滑动的，这样可以触发不同的事件
        mPullRefreshGridView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<GridView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<GridView> refreshView) {
                Toast.makeText(getApplicationContext(), "下拉", Toast.LENGTH_SHORT).show();
//                new GetDataTask(mPullRefreshGridView, adapter, data).execute();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<GridView> refreshView) {
                Toast.makeText(getApplicationContext(), "上拉", Toast.LENGTH_SHORT).show();
//                new GetDataTask(mPullRefreshGridView, adapter, data).execute();
            }
        });
        GridView mGridView = mPullRefreshGridView.getRefreshableView();
        //设置适配器
        adapter = new FreshGridAdapter(this, data);
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String detail = "http://m.sanfu.com/app/display.htm?goods.goods_sn=" + data.get(position).get("goods_sn") + "&sid=a9f809a7c00111dd3abc3d49a06da2e4&source=1&key=djxmgukqymnbosx&sign=DF721C9810AB86D1669B9B82DC152C42";
                Intent intent = new Intent(getBaseContext(), GoodsActivity.class);
                intent.putExtra("detail", detail);
                startActivity(intent);
            }
        });
    }
}
