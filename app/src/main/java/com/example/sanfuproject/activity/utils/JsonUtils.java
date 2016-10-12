package com.example.sanfuproject.activity.utils;

import com.alibaba.fastjson.JSON;
import com.example.sanfuproject.activity.entity.Classify;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import static com.example.sanfuproject.activity.utils.Constants.classifyStr;

/**
 * Created by Hello on 2016/10/12.
 */

public class JsonUtils {
    /**
     * 获得到json字符串
     */
    public static String loadJson() {
        try {
            URL url = new URL(classifyStr);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(5000);
            InputStream is = connection.getInputStream();
            byte[] arr = new byte[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(arr)) != -1) {
                String string = new String(arr, 0, len, "utf-8");
                sb.append(string);
            }
            is.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解析classifyJson数据
     *
     * @return json数据对应实体类
     */
    public static Classify parseJson(String classifyJson) {
        Classify classify = JSON.parseObject(classifyJson, Classify.class);
        return classify;
    }
}
