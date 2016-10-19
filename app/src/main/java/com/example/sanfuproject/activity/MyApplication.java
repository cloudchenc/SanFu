package com.example.sanfuproject.activity;

import android.app.Application;
import android.util.Log;

import org.xutils.DbManager;
import org.xutils.db.table.TableEntity;
import org.xutils.x;

/**
 * Created by Hello on 2016/10/11.
 */

public class MyApplication extends Application {

    public static DbManager.DaoConfig daoConfig;
    public static DbManager db;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化xutils库
        x.Ext.init(this);

        daoConfig = new DbManager.DaoConfig()
                .setDbName("shopCart.db")//设置数据库名称
                //设置表创建的监听
                .setTableCreateListener(new DbManager.TableCreateListener() {
                    @Override
                    public void onTableCreated(DbManager dbManager, TableEntity<?> tableEntity) {
                        Log.i("--", "onTableCreated：" + tableEntity.getName());
                    }
                })
                //设置是否允许事务，默认true
                //.setAllowTransaction(true)
                //设置数据库路径，默认安装程序路径下;不设置dbDir时, 默认存储在app的私有目录.
                //.setDbDir(new File("/mnt/sdcard/"))
                //设置数据库的版本号
                //.setDbVersion(1)
                //设置数据库更新的监听
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion,
                                          int newVersion) {
                    }
                })
                //设置数据库打开的监听
                .setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager db) {
                        //开启数据库支持多线程操作，提升性能
                        db.getDatabase().enableWriteAheadLogging();
                    }
                });

        //db还有其他的一些构造方法，比如含有更新表版本的监听器的
        db = x.getDb(daoConfig);//获取数据库单例
    }
}
