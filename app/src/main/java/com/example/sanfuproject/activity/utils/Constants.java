package com.example.sanfuproject.activity.utils;

import android.support.v4.widget.DrawerLayout;

import com.example.sanfuproject.activity.entity.Classify;

import java.util.List;

/**
 * Created by Hello on 2016/10/11.
 */

public class Constants {

    public static DrawerLayout drawerLayout;

    //分类String数据
    public static String classifyStr = "http://m.sanfu.com/app/goods/sort.htm?source=1&version=1";
    //折扣专区
    public  static String discount = "http://m.sanfu.com/app/goods/goodsList.htm?goods.class_id=481192&page=1&pageSize=40&goods.search_words=&goods.is_disc=0&goods.is_hot=0&goods.is_new=0&goods.is_best=0&sid=a9f809a7c00111dd3abc3d49a06da2e4&source=1&key=epkfyettftmnyds&sign=7C7983233E768FE95C40AD9A2B17FFAD";
    public static List<Classify.MsgBean.CategoryBean> category;

}
