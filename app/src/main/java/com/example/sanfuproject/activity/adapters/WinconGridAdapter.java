package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanfuproject.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Map;

import static android.R.attr.data;

/**
 * Created by Hello on 2016/10/18.
 */

public class WinconGridAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<String> data = new ArrayList<String>();
    private int mSelect = -1;

    public WinconGridAdapter(Context context, ArrayList<Map<String, String>> con_data, String flag) {
        layoutInflater = layoutInflater.from(context);
        if ("size_name".equals(flag)) {
            for (Map<String, String> map : con_data) {
                if (!data.contains(map.get("size_name"))) {
                    data.add(map.get("size_name"));
                }
            }
        }
        if ("color_name".equals(flag)) {
            for (Map<String, String> map : con_data) {
                if (!data.contains(map.get("color_name"))) {
                    data.add(map.get("color_name"));
                }
            }
        }
//        System.out.println("--" + data);
    }

    public void changeSelected(int positon) { //刷新方法
        this.mSelect = positon;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.window_cart_item, null);
            holder.textView = (TextView) convertView.findViewById(R.id.win_cart_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(data.get(position));
        if (mSelect == position) {
            convertView.setBackgroundColor(Color.rgb(102, 153, 255)); //选中项背景
            holder.textView.setTextColor(Color.RED);
        } else {
            convertView.setBackgroundColor(Color.rgb(229, 229, 229));  //其他项背景
            holder.textView.setTextColor(Color.BLACK);
        }
        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}
