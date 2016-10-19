package com.example.sanfuproject.activity.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;

import com.example.sanfuproject.activity.MyApplication;

import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.db.Selector;
import org.xutils.db.sqlite.SqlInfo;
import org.xutils.db.sqlite.SqlInfoBuilder;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.ColumnEntity;
import org.xutils.db.table.DbBase;
import org.xutils.db.table.DbModel;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.xutils.x.app;

/**
 * Created by Hello on 2016/10/18.
 */

public class MyDbBase extends DbBase {

    public static MyDbBase myDbBase;

    public static MyDbBase getInstance() {
        if (myDbBase == null) {
            myDbBase = new MyDbBase(MyApplication.daoConfig);
        }
        return myDbBase;
    }

    /**
     * 创建一张表
     *
     * @param t
     * @param <T>
     * @throws DbException
     */
    public <T> void creatTable(T t) throws DbException {
        TableEntity<?> table = this.getTable(t.getClass());
        createTableIfNotExist(table);
    }

    /**
     * 按照字段checked_time降序将sign_user对象查询出来
     */
//    public List<Sign_User> orderBY(int status, String snid) throws DbException {
//        Cursor cursor = MyApplication.db.execQuery("SELECT * FROM sign_user WHERE status = '" + status + "' and snid = '" + snid + "'ORDER BY checked_time DESC");
//        List<Sign_User> list = new ArrayList<>();
//        while (cursor.moveToNext()) {
//            Sign_User sign_user = new Sign_User();
//            sign_user._id = cursor.getInt(cursor.getColumnIndex("_id"));
//            sign_user.snuid = cursor.getString(cursor.getColumnIndex("snuid"));
//            sign_user.snid = cursor.getString(cursor.getColumnIndex("snid"));
//            sign_user.mid = cursor.getInt(cursor.getColumnIndex("mid"));
//            sign_user.lid = cursor.getInt(cursor.getColumnIndex("lid"));
//            sign_user.userName = cursor.getString(cursor.getColumnIndex("userName"));
//            sign_user.company = cursor.getString(cursor.getColumnIndex("company"));
//            sign_user.phone = cursor.getString(cursor.getColumnIndex("phone"));
//            sign_user.sex = cursor.getString(cursor.getColumnIndex("sex"));
//            sign_user.email = cursor.getString(cursor.getColumnIndex("email"));
//            sign_user.ivcode = cursor.getString(cursor.getColumnIndex("ivcode"));
//            sign_user.checked = cursor.getString(cursor.getColumnIndex("checked"));
//            sign_user.reason = cursor.getString(cursor.getColumnIndex("reason"));
//            sign_user.checked_time = cursor.getString(cursor.getColumnIndex("checked_time"));
//            sign_user.signData = cursor.getString(cursor.getColumnIndex("signData"));
//            sign_user.delete_time = cursor.getString(cursor.getColumnIndex("delete_time"));
//            sign_user.status = cursor.getInt(cursor.getColumnIndex("status"));
//            sign_user.url = cursor.getString(cursor.getColumnIndex("url"));
//            sign_user.referer_url = cursor.getString(cursor.getColumnIndex("referer_url"));
//            sign_user.add_ip = cursor.getString(cursor.getColumnIndex("add_ip"));
//            sign_user.add_time = cursor.getString(cursor.getColumnIndex("add_time"));
//            sign_user.add_user_name = cursor.getString(cursor.getColumnIndex("add_user_name"));
//            sign_user.update_ip = cursor.getString(cursor.getColumnIndex("update_ip"));
//            sign_user.update_time = cursor.getString(cursor.getColumnIndex("update_time"));
//            sign_user.update_user_name = cursor.getString(cursor.getColumnIndex("update_user_name"));
//            sign_user.SIGN_KEY = cursor.getString(cursor.getColumnIndex("SIGN_KEY"));
//            sign_user.CAUSE = cursor.getString(cursor.getColumnIndex("CAUSE"));
//            sign_user.eating_habits = cursor.getString(cursor.getColumnIndex("eating_habits"));
//            sign_user.update = cursor.getInt(cursor.getColumnIndex("update"));
//            sign_user.longitude = cursor.getString(cursor.getColumnIndex("longitude"));
//            sign_user.latitude = cursor.getString(cursor.getColumnIndex("latitude"));
//            sign_user.deviceid = cursor.getString(cursor.getColumnIndex("deviceid"));
////            MLog.e("test","当前解析对象："+sign_user.toString());
//            list.add(sign_user);
//        }
//        if (cursor != null) {
//            cursor.close();
//        }
//        return list;
//    }

    /**
     * 按照字段checked_time降序将sign_user对象查询出来
     */
//    public List<Sign_User> orderBYDianM(int status, String snid) throws DbException {
//        Cursor cursor = MyApplication.db.execQuery("SELECT * FROM sign_user WHERE status = '" + status + "' and snid = '" + snid + "'ORDER BY checked DESC,checked_time DESC");
//        List<Sign_User> list = new ArrayList<>();
//        while (cursor.moveToNext()) {
//            Sign_User sign_user = new Sign_User();
//            sign_user._id = cursor.getInt(cursor.getColumnIndex("_id"));
//            sign_user.snuid = cursor.getString(cursor.getColumnIndex("snuid"));
//            sign_user.snid = cursor.getString(cursor.getColumnIndex("snid"));
//            sign_user.mid = cursor.getInt(cursor.getColumnIndex("mid"));
//            sign_user.lid = cursor.getInt(cursor.getColumnIndex("lid"));
//            sign_user.userName = cursor.getString(cursor.getColumnIndex("userName"));
//            sign_user.company = cursor.getString(cursor.getColumnIndex("company"));
//            sign_user.phone = cursor.getString(cursor.getColumnIndex("phone"));
//            sign_user.sex = cursor.getString(cursor.getColumnIndex("sex"));
//            sign_user.email = cursor.getString(cursor.getColumnIndex("email"));
//            sign_user.ivcode = cursor.getString(cursor.getColumnIndex("ivcode"));
//            sign_user.checked = cursor.getString(cursor.getColumnIndex("checked"));
//            sign_user.reason = cursor.getString(cursor.getColumnIndex("reason"));
//            sign_user.checked_time = cursor.getString(cursor.getColumnIndex("checked_time"));
//            sign_user.signData = cursor.getString(cursor.getColumnIndex("signData"));
//            sign_user.delete_time = cursor.getString(cursor.getColumnIndex("delete_time"));
//            sign_user.status = cursor.getInt(cursor.getColumnIndex("status"));
//            sign_user.url = cursor.getString(cursor.getColumnIndex("url"));
//            sign_user.referer_url = cursor.getString(cursor.getColumnIndex("referer_url"));
//            sign_user.add_ip = cursor.getString(cursor.getColumnIndex("add_ip"));
//            sign_user.add_time = cursor.getString(cursor.getColumnIndex("add_time"));
//            sign_user.add_user_name = cursor.getString(cursor.getColumnIndex("add_user_name"));
//            sign_user.update_ip = cursor.getString(cursor.getColumnIndex("update_ip"));
//            sign_user.update_time = cursor.getString(cursor.getColumnIndex("update_time"));
//            sign_user.update_user_name = cursor.getString(cursor.getColumnIndex("update_user_name"));
//            sign_user.SIGN_KEY = cursor.getString(cursor.getColumnIndex("SIGN_KEY"));
//            sign_user.CAUSE = cursor.getString(cursor.getColumnIndex("CAUSE"));
//            sign_user.eating_habits = cursor.getString(cursor.getColumnIndex("eating_habits"));
//            sign_user.update = cursor.getInt(cursor.getColumnIndex("update"));
//            sign_user.longitude = cursor.getString(cursor.getColumnIndex("longitude"));
//            sign_user.latitude = cursor.getString(cursor.getColumnIndex("latitude"));
//            sign_user.deviceid = cursor.getString(cursor.getColumnIndex("deviceid"));
////            MLog.e("test","当前解析对象："+sign_user.toString());
//            list.add(sign_user);
//        }
//        if (cursor != null) {
//            cursor.close();
//        }
//        return list;
//    }

    /**
     * 按照指定字段排序并解析出相应的任务列表
     */
//    public List<TeamTask> orderBYtask(int status, HashMap<String, String> map, String condition) throws DbException {
//        List<TeamTask> list = new ArrayList<>();
//        Cursor cursor;
//        StringBuilder sb = new StringBuilder();
//        sb.append("SELECT * FROM teamtask WHERE status = '" + status + "'");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            sb.append("and " + entry.getKey() + "='" + entry.getValue() + "'");
//        }
//        if (condition.equals("update_time")) {
//            sb.append("ORDER BY update_time DESC");
////            cursor = MyApplication.db.execQuery("SELECT * FROM teamtask WHERE status = '" + status + "' and mid = '" + mid + "' and tuid = '" + tuid + "'ORDER BY update_time DESC");
//        }
//        if (condition.equals("endtime")) {
//            sb.append("ORDER BY endtime DESC");
////            cursor = MyApplication.db.execQuery("SELECT * FROM teamtask WHERE status = '" + status + "' and mid = '" + mid + "' and tuid = '" + tuid + "'ORDER BY endtime DESC");
//        }
//        MLog.e("test", "MyDbBase log:当前sql语句-" + sb.toString());
//        cursor = MyApplication.db.execQuery(sb.toString());
//        if (cursor != null) {
//            while (cursor.moveToNext()) {//开始解析
//                TeamTask teamTask = new TeamTask();
//                teamTask._id = cursor.getInt(cursor.getColumnIndex("_id"));
//                teamTask.tid = cursor.getInt(cursor.getColumnIndex("tid"));
//                teamTask.mid = cursor.getInt(cursor.getColumnIndex("mid"));
//                teamTask.parentid = cursor.getInt(cursor.getColumnIndex("parentid"));
//                teamTask.tuid = cursor.getInt(cursor.getColumnIndex("tuid"));
//                teamTask.creattuid = cursor.getInt(cursor.getColumnIndex("creattuid"));
//                teamTask.typeid = cursor.getInt(cursor.getColumnIndex("typeid"));
//                teamTask.startask = cursor.getInt(cursor.getColumnIndex("startask"));
//
//                teamTask.title = cursor.getString(cursor.getColumnIndex("title"));
//                teamTask.content = cursor.getString(cursor.getColumnIndex("content"));
//                teamTask.attachment = cursor.getString(cursor.getColumnIndex("attachment"));
//                teamTask.nickname = cursor.getString(cursor.getColumnIndex("nickname"));
//                teamTask.creatnickname = cursor.getString(cursor.getColumnIndex("creatnickname"));
//                teamTask.typename = cursor.getString(cursor.getColumnIndex("typename"));
//                teamTask.starttime = cursor.getString(cursor.getColumnIndex("starttime"));
//                teamTask.endtime = cursor.getString(cursor.getColumnIndex("endtime"));
//                teamTask.mark = cursor.getString(cursor.getColumnIndex("mark"));
//                teamTask.situation = cursor.getString(cursor.getColumnIndex("situation"));
//
//                teamTask.delete_time = cursor.getString(cursor.getColumnIndex("delete_time"));
//                teamTask.status = cursor.getInt(cursor.getColumnIndex("status"));
//                teamTask.url = cursor.getString(cursor.getColumnIndex("url"));
//                teamTask.referer_url = cursor.getString(cursor.getColumnIndex("referer_url"));
//                teamTask.add_ip = cursor.getString(cursor.getColumnIndex("add_ip"));
//                teamTask.add_time = cursor.getString(cursor.getColumnIndex("add_time"));
//                teamTask.add_user_name = cursor.getString(cursor.getColumnIndex("add_user_name"));
//                teamTask.update_ip = cursor.getString(cursor.getColumnIndex("update_ip"));
//                teamTask.update_time = cursor.getString(cursor.getColumnIndex("update_time"));
//                teamTask.update_user_name = cursor.getString(cursor.getColumnIndex("update_user_name"));
//                teamTask.SIGN_KEY = cursor.getString(cursor.getColumnIndex("SIGN_KEY"));
//                teamTask.CAUSE = cursor.getString(cursor.getColumnIndex("CAUSE"));
//                list.add(teamTask);
//            }
//            cursor.close();
//        }
//        return list;
//    }

    /**
     * 按照指定字段排序并解析出相应的任务列表
     */
//    public List<TeamTask> orderBYtaskstar(int status, int mid, int tuid, String condition) throws DbException {
//        List<TeamTask> list = new ArrayList<>();
//        String strSql = "SELECT * FROM teamtask WHERE status = '" + status + "' and mid = '" + mid + "' and (tuid = '" + tuid + "' or ()ORDER BY update_time DESC";
//        Cursor cursor = MyApplication.db.execQuery(strSql);
//        MLog.e("test", "MyDbBase log:当前sql语句-" + strSql);
//        if (cursor != null) {
//            while (cursor.moveToNext()) {//开始解析
//                TeamTask teamTask = new TeamTask();
//                teamTask._id = cursor.getInt(cursor.getColumnIndex("_id"));
//                teamTask.tid = cursor.getInt(cursor.getColumnIndex("tid"));
//                teamTask.mid = cursor.getInt(cursor.getColumnIndex("mid"));
//                teamTask.parentid = cursor.getInt(cursor.getColumnIndex("parentid"));
//                teamTask.tuid = cursor.getInt(cursor.getColumnIndex("tuid"));
//                teamTask.creattuid = cursor.getInt(cursor.getColumnIndex("creattuid"));
//                teamTask.typeid = cursor.getInt(cursor.getColumnIndex("typeid"));
//                teamTask.startask = cursor.getInt(cursor.getColumnIndex("startask"));
//
//                teamTask.title = cursor.getString(cursor.getColumnIndex("title"));
//                teamTask.content = cursor.getString(cursor.getColumnIndex("content"));
//                teamTask.attachment = cursor.getString(cursor.getColumnIndex("attachment"));
//                teamTask.nickname = cursor.getString(cursor.getColumnIndex("nickname"));
//                teamTask.creatnickname = cursor.getString(cursor.getColumnIndex("creatnickname"));
//                teamTask.typename = cursor.getString(cursor.getColumnIndex("typename"));
//                teamTask.starttime = cursor.getString(cursor.getColumnIndex("starttime"));
//                teamTask.endtime = cursor.getString(cursor.getColumnIndex("endtime"));
//                teamTask.mark = cursor.getString(cursor.getColumnIndex("mark"));
//                teamTask.situation = cursor.getString(cursor.getColumnIndex("situation"));
//
//                teamTask.delete_time = cursor.getString(cursor.getColumnIndex("delete_time"));
//                teamTask.status = cursor.getInt(cursor.getColumnIndex("status"));
//                teamTask.url = cursor.getString(cursor.getColumnIndex("url"));
//                teamTask.referer_url = cursor.getString(cursor.getColumnIndex("referer_url"));
//                teamTask.add_ip = cursor.getString(cursor.getColumnIndex("add_ip"));
//                teamTask.add_time = cursor.getString(cursor.getColumnIndex("add_time"));
//                teamTask.add_user_name = cursor.getString(cursor.getColumnIndex("add_user_name"));
//                teamTask.update_ip = cursor.getString(cursor.getColumnIndex("update_ip"));
//                teamTask.update_time = cursor.getString(cursor.getColumnIndex("update_time"));
//                teamTask.update_user_name = cursor.getString(cursor.getColumnIndex("update_user_name"));
//                teamTask.SIGN_KEY = cursor.getString(cursor.getColumnIndex("SIGN_KEY"));
//                teamTask.CAUSE = cursor.getString(cursor.getColumnIndex("CAUSE"));
//                list.add(teamTask);
//            }
//            cursor.close();
//        }
//        return list;
//    }

    /**
     * 按时间降序排序推送消息
     */
//    public List<Message> orderBYMessage(String tuid) {
//        List<Message> list = new ArrayList<>();
//        String sql = "SELECT * FROM message WHERE tuid = '" + tuid + "' and _id != '0' ORDER BY time DESC";
//        MLog.e("test", "当前sql语句：" + sql);
//        try {
//            Cursor cursor = MyApplication.db.execQuery(sql);
//            if (cursor != null) {
//                while (cursor.moveToNext()) {
//                    Message msg = new Message();
//                    msg._id = cursor.getInt(cursor.getColumnIndex("_id"));
//                    msg.tuid = cursor.getString(cursor.getColumnIndex("tuid"));
//                    msg.time = cursor.getString(cursor.getColumnIndex("time"));
//                    msg.title = cursor.getString(cursor.getColumnIndex("title"));
//                    msg.content = cursor.getString(cursor.getColumnIndex("content"));
//                    msg.isRead = cursor.getInt(cursor.getColumnIndex("isRead"));
//                    list.add(msg);
//                }
//                cursor.close();
//            }
//        } catch (DbException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

    /**
     * key: dbName
     */
    private final static HashMap<DaoConfig, MyDbBase> DAO_MAP = new HashMap<DaoConfig, MyDbBase>();

    private SQLiteDatabase database;
    private DaoConfig daoConfig;
    private boolean allowTransaction;

    private MyDbBase(DaoConfig config) {
        if (config == null) {
            throw new IllegalArgumentException("daoConfig may not be null");
        }
        this.daoConfig = config;
        this.allowTransaction = config.isAllowTransaction();
        this.database = openOrCreateDatabase(config);
        DbOpenListener dbOpenListener = config.getDbOpenListener();
        if (dbOpenListener != null) {
            dbOpenListener.onDbOpened(this);
        }
    }

    public synchronized static DbManager getInstance(DaoConfig daoConfig) {

        if (daoConfig == null) {//使用默认配置
            daoConfig = new DaoConfig();
        }

        MyDbBase dao = DAO_MAP.get(daoConfig);
        if (dao == null) {
            dao = new MyDbBase(daoConfig);
            DAO_MAP.put(daoConfig, dao);
        } else {
            dao.daoConfig = daoConfig;
        }

        // update the database if needed
        SQLiteDatabase database = dao.database;
        int oldVersion = database.getVersion();
        int newVersion = daoConfig.getDbVersion();
        if (oldVersion != newVersion) {
            if (oldVersion != 0) {
                DbUpgradeListener upgradeListener = daoConfig.getDbUpgradeListener();
                if (upgradeListener != null) {
                    upgradeListener.onUpgrade(dao, oldVersion, newVersion);
                } else {
                    try {
                        dao.dropDb();
                    } catch (DbException e) {
                        LogUtil.e(e.getMessage(), e);
                    }
                }
            }
            database.setVersion(newVersion);
        }

        return dao;
    }

    @Override
    public SQLiteDatabase getDatabase() {
        return database;
    }

    @Override
    public DaoConfig getDaoConfig() {
        return daoConfig;
    }

    //*********************************************** operations ********************************************************

    @Override
    public void saveOrUpdate(Object entity) throws DbException {
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                createTableIfNotExist(table);
                for (Object item : entities) {
                    saveOrUpdateWithoutTransaction(table, item);
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                createTableIfNotExist(table);
                saveOrUpdateWithoutTransaction(table, entity);
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void replace(Object entity) throws DbException {
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                createTableIfNotExist(table);
                for (Object item : entities) {
                    execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table, item));
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                createTableIfNotExist(table);
                execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table, entity));
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void save(Object entity) throws DbException {
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                createTableIfNotExist(table);
                for (Object item : entities) {
                    execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, item));
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                createTableIfNotExist(table);
                execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, entity));
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public boolean saveBindingId(Object entity) throws DbException {
        boolean result = false;
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return false;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                createTableIfNotExist(table);
                for (Object item : entities) {
                    if (!saveBindingIdWithoutTransaction(table, item)) {
                        throw new DbException("saveBindingId error, transaction will not commit!");
                    }
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                createTableIfNotExist(table);
                result = saveBindingIdWithoutTransaction(table, entity);
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
        return result;
    }

    @Override
    public void deleteById(Class<?> entityType, Object idValue) throws DbException {
        TableEntity<?> table = this.getTable(entityType);
        if (!table.tableIsExist()) return;
        try {
            beginTransaction();

            execNonQuery(SqlInfoBuilder.buildDeleteSqlInfoById(table, idValue));

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void delete(Object entity) throws DbException {
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                if (!table.tableIsExist()) return;
                for (Object item : entities) {
                    execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo(table, item));
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                if (!table.tableIsExist()) return;
                execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo(table, entity));
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void delete(Class<?> entityType) throws DbException {
        delete(entityType, null);
    }

    @Override
    public int delete(Class<?> entityType, WhereBuilder whereBuilder) throws DbException {
        TableEntity<?> table = this.getTable(entityType);
        if (!table.tableIsExist()) return 0;
        int result = 0;
        try {
            beginTransaction();

            result = executeUpdateDelete(SqlInfoBuilder.buildDeleteSqlInfo(table, whereBuilder));

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
        return result;
    }

    @Override
    public void update(Object entity, String... updateColumnNames) throws DbException {
        try {
            beginTransaction();

            if (entity instanceof List) {
                List<?> entities = (List<?>) entity;
                if (entities.isEmpty()) return;
                TableEntity<?> table = this.getTable(entities.get(0).getClass());
                if (!table.tableIsExist()) return;
                for (Object item : entities) {
                    execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo(table, item, updateColumnNames));
                }
            } else {
                TableEntity<?> table = this.getTable(entity.getClass());
                if (!table.tableIsExist()) return;
                execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo(table, entity, updateColumnNames));
            }

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public int update(Class<?> entityType, WhereBuilder whereBuilder, KeyValue... nameValuePairs) throws DbException {
        TableEntity<?> table = this.getTable(entityType);
        if (!table.tableIsExist()) return 0;

        int result = 0;
        try {
            beginTransaction();

            result = executeUpdateDelete(SqlInfoBuilder.buildUpdateSqlInfo(table, whereBuilder, nameValuePairs));

            setTransactionSuccessful();
        } finally {
            endTransaction();
        }

        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T findById(Class<T> entityType, Object idValue) throws DbException {
        return null;
    }

    @Override
    public <T> T findFirst(Class<T> entityType) throws DbException {
        return this.selector(entityType).findFirst();
    }

    @Override
    public <T> List<T> findAll(Class<T> entityType) throws DbException {
        return this.selector(entityType).findAll();
    }

    @Override
    public <T> Selector<T> selector(Class<T> entityType) throws DbException {
        return null;
    }

    @Override
    public DbModel findDbModelFirst(SqlInfo sqlInfo) throws DbException {
        return null;
    }

    @Override
    public List<DbModel> findDbModelAll(SqlInfo sqlInfo) throws DbException {
        return null;
    }

    //******************************************** config ******************************************************

    private SQLiteDatabase openOrCreateDatabase(DaoConfig config) {
        SQLiteDatabase result = null;

        File dbDir = config.getDbDir();
        if (dbDir != null && (dbDir.exists() || dbDir.mkdirs())) {
            File dbFile = new File(dbDir, config.getDbName());
            result = SQLiteDatabase.openOrCreateDatabase(dbFile, null);
        } else {
            result = x.app().openOrCreateDatabase(config.getDbName(), 0, null);
        }
        return result;
    }

    //***************************** private operations with out transaction *****************************
    private void saveOrUpdateWithoutTransaction(TableEntity<?> table, Object entity) throws DbException {
        ColumnEntity id = table.getId();
        if (id.isAutoId()) {
            if (id.getColumnValue(entity) != null) {
                execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo(table, entity));
            } else {
                saveBindingIdWithoutTransaction(table, entity);
            }
        } else {
            execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table, entity));
        }
    }

    private boolean saveBindingIdWithoutTransaction(TableEntity<?> table, Object entity) throws DbException {
        ColumnEntity id = table.getId();
        if (id.isAutoId()) {
            execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, entity));
            long idValue = getLastAutoIncrementId(table.getName());
            if (idValue == -1) {
                return false;
            }
            id.setAutoIdValue(entity, idValue);
            return true;
        } else {
            execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, entity));
            return true;
        }
    }

    //************************************************ tools ***********************************

    private long getLastAutoIncrementId(String tableName) throws DbException {
        long id = -1;
        Cursor cursor = execQuery("SELECT seq FROM sqlite_sequence WHERE name='" + tableName + "' LIMIT 1");
        if (cursor != null) {
            try {
                if (cursor.moveToNext()) {
                    id = cursor.getLong(0);
                }
            } catch (Throwable e) {
                throw new DbException(e);
            } finally {
                IOUtil.closeQuietly(cursor);
            }
        }
        return id;
    }

    @Override
    public void close() throws IOException {
        if (DAO_MAP.containsKey(daoConfig)) {
            DAO_MAP.remove(daoConfig);
            this.database.close();
        }
    }

    ///////////////////////////////////// exec sql /////////////////////////////////////////////////////

    private void beginTransaction() {
        if (allowTransaction) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN && database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }
    }

    private void setTransactionSuccessful() {
        if (allowTransaction) {
            database.setTransactionSuccessful();
        }
    }

    private void endTransaction() {
        if (allowTransaction) {
            database.endTransaction();
        }
    }


    @Override
    public int executeUpdateDelete(SqlInfo sqlInfo) throws DbException {
        SQLiteStatement statement = null;
        try {
            statement = sqlInfo.buildStatement(database);
            return statement.executeUpdateDelete();
        } catch (Throwable e) {
            throw new DbException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.releaseReference();
                } catch (Throwable ex) {
                    LogUtil.e(ex.getMessage(), ex);
                }
            }
        }
    }

    @Override
    public int executeUpdateDelete(String sql) throws DbException {
        SQLiteStatement statement = null;
        try {
            statement = database.compileStatement(sql);
            return statement.executeUpdateDelete();
        } catch (Throwable e) {
            throw new DbException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.releaseReference();
                } catch (Throwable ex) {
                    LogUtil.e(ex.getMessage(), ex);
                }
            }
        }
    }

    @Override
    public void execNonQuery(SqlInfo sqlInfo) throws DbException {
        SQLiteStatement statement = null;
        try {
            statement = sqlInfo.buildStatement(database);
            statement.execute();
        } catch (Throwable e) {
            throw new DbException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.releaseReference();
                } catch (Throwable ex) {
                    LogUtil.e(ex.getMessage(), ex);
                }
            }
        }
    }

    @Override
    public void execNonQuery(String sql) throws DbException {
        try {
            database.execSQL(sql);
        } catch (Throwable e) {
            throw new DbException(e);
        }
    }

    @Override
    public Cursor execQuery(SqlInfo sqlInfo) throws DbException {
        try {
            return database.rawQuery(sqlInfo.getSql(), sqlInfo.getBindArgsAsStrArray());
        } catch (Throwable e) {
            throw new DbException(e);
        }
    }

    @Override
    public Cursor execQuery(String sql) throws DbException {
        try {
            return database.rawQuery(sql, null);
        } catch (Throwable e) {
            throw new DbException(e);
        }
    }
}
