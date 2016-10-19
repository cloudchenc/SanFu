package com.example.sanfuproject.activity;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Hello on 2016/10/11.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化xutils库
        x.Ext.init(this);
    }
}
