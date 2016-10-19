package com.example.sanfuproject.activity.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sanfuproject.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库管理类
 */
public class DataBaseManger {
    private SQLiteDatabase sqLiteDatabase;
    private Context context;
    public static DataBaseManger instance = null;
    private final String DATABASE_PATH = android.os.Environment
            .getExternalStorageDirectory().getAbsolutePath() + "/approval";
    private String DATABASE_FILENAME = "Approval.db";

    /**
     * 构造函数
     * 获取数据库读写权限
     *
     * @param context:上文对象
     */
    public DataBaseManger(Context context) {
        this.context = context;
        sqLiteDatabase = getSQLiteDatabaseInstance();
    }

    public SQLiteDatabase getSQLiteDatabaseInstance() {
        if (sqLiteDatabase == null) {
            sqLiteDatabase = getSQLiteDatabase();
        }
        return sqLiteDatabase;
    }

    public SQLiteDatabase getSQLiteDatabase() {
        try {
            String databaseFilename = DATABASE_PATH + "/" + DATABASE_FILENAME;
            File dir = new File(DATABASE_PATH);
            if (!dir.exists())
                dir.mkdir();
            if (!(new File(databaseFilename)).exists()) {
                InputStream is = context.getResources().openRawResource(R.raw.approval);
                FileOutputStream fos = new FileOutputStream(databaseFilename);
                byte[] buffer = new byte[1024];
                int count = 0;
                while ((count = is.read(buffer)) > 0) {
                    fos.write(buffer, 0, count);
                }
                fos.close();
                is.close();
            }
            SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(databaseFilename, null);
            return db;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取本类的实例对象(单例)
     *
     * @param context:上文对象
     * @return 数据库管理器对象
     */
    public static DataBaseManger getInstance(Context context) {
        if (instance == null) {
            if (context == null) {
                throw new RuntimeException("context is null");
            }
            instance = new DataBaseManger(context);
        }
        return instance;
    }

    /**
     * 查询插入数据的数量
     *
     * @param tab:表名
     * @throws Exception
     * @return：int
     */
    public int getDataCount(String tab) throws Exception {
        Cursor cursor = null;
        int count = 0;
        if (sqLiteDatabase.isOpen()) {
            cursor = query2Cursor("select * from " + tab, null);
            if (cursor != null && cursor.moveToFirst()) {
                count = cursor.getCount();
            }
        } else {
            throw new RuntimeException("数据库已关闭");
        }
        return count;
    }

    /**
     * 查询数据
     *
     * @param sql:SQL语句
     * @param selectArgs：键名字符串数组
     * @return cursor：游标
     * @throws Exception
     */
    public Cursor query2Cursor(String sql, String[] selectArgs) throws Exception {
        Cursor cursor = null;
        if (sqLiteDatabase.isOpen()) {
            cursor = sqLiteDatabase.rawQuery(sql, selectArgs);
        } else {
            throw new RuntimeException("数据库已关闭");
        }
        return cursor;
    }

    /**
     * 批量插入数据
     *
     * @param table:表名
     * @param list:插入的数据集合
     * @param strs:键名字符串数组
     * @return
     */
    public long insertBatchData2(String table, List<HashMap<String, Object>> list, String[] strs) {
        sqLiteDatabase.beginTransaction();
        long insertNum = 0;
        ContentValues values = new ContentValues();
        try {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < strs.length; j++) {
                    values.put(strs[j], list.get(i).get(strs[j]).toString());
                }
                long num = insertData(table, values);
                insertNum += num;
            }
            sqLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqLiteDatabase.endTransaction();
        }
        return insertNum;
    }

    /**
     * 插入数据
     *
     * @param tab:表名
     * @param v:参数
     * @return
     * @throws Exception
     */
    public Long insertData(String tab, ContentValues v) throws Exception {
        long result = 0;
        if (sqLiteDatabase.isOpen()) {
            result = sqLiteDatabase.insertOrThrow(tab, null, v);
        } else {
            throw new RuntimeException("数据库已关闭");
        }
        return result;
    }

    /**
     * 查询数据
     *
     * @param sql
     * @param strs
     * @param obj
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> query2ListMap(String sql, String[] strs, Object obj) throws Exception {
        List<Map<String, Object>> mapList = new ArrayList<>();
        if (sqLiteDatabase.isOpen()) {
            Cursor cursor = null;
            try {
                cursor = sqLiteDatabase.rawQuery(sql, strs);
                Field[] f;
                Map<String, Object> map;
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        map = new HashMap<>();
                        /**
                         * getFields()获得某个类的所有的公共（public）的字段，包括父类。
                         * getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，
                         * 但是不包括父类的申明字段。
                         * 同样类似的还有getConstructors()和getDeclaredConstructors()，getMethods()和getDeclaredMethods()。
                         */
                        f = obj.getClass().getDeclaredFields();
                        for (int i = 0; i < f.length - 1; i++) {
                            map.put(f[i].getName(), cursor.getString(cursor.getColumnIndex(f[i].getName())));
                        }
                        mapList.add(map);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                cursor.close();
            }
        } else {
            throw new RuntimeException("数据库已关闭");
        }
        return mapList;
    }

    public Map<String, Object> query2Map(String sql, String[] strs, Object obj) throws Exception {
        Map<String, Object> map = new HashMap<>();
        if (sqLiteDatabase.isOpen()) {
            Cursor cursor = null;
            try {
                cursor = sqLiteDatabase.rawQuery(sql, strs);
                Field[] f;
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        f = obj.getClass().getDeclaredFields();
                        for (int i = 0; i < f.length; i++) {
                            map.put(f[i].getName(), cursor.getString(cursor.getColumnIndex(f[i].getName())));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                cursor.close();
            }
        } else {
            throw new RuntimeException("数据库已关闭");
        }
        return map;
    }


}
