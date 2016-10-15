package com.example.sanfuproject.activity.utils;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import com.example.sanfuproject.activity.adapters.FreshGridAdapter;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Hello on 2016/10/15.
 */

public class GetDataTask extends AsyncTask<Void, Void, Void> {

    private PullToRefreshGridView mPullRefreshGridView;
    private FreshGridAdapter adapter;
    private LinkedList<Map<String, Object>> data;

    public GetDataTask(PullToRefreshGridView mPullRefreshGridView, FreshGridAdapter adapter, LinkedList<Map<String, Object>> data) {
        this.mPullRefreshGridView = mPullRefreshGridView;
        this.adapter = adapter;
        this.data = data;
    }

    @Override
    protected Void doInBackground(Void... params) {
        //模拟请求，舒眠2秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        //得到当前的模式，来判断数据应该加载到哪个位置
        PullToRefreshBase.Mode mode = mPullRefreshGridView.getCurrentMode();

        if (mode == PullToRefreshBase.Mode.PULL_FROM_START) {
//            data.addFirst("这是刷新出来的数据");
        } else {
//            data.addLast("这是刷新出来的数据");
        }
        // 通知数据改变了
        adapter.notifyDataSetChanged();
        // 加载完成后停止刷新
        mPullRefreshGridView.onRefreshComplete();

    }
}
