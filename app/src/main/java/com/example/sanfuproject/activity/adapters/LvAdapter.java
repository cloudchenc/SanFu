package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sanfuproject.R;

import java.util.ArrayList;

/**
 * 分类页，左侧listView适配器
 * Created by Hello on 2016/10/12.
 */

public class LvAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<String> data;
    private int mSelect = 0;

    public LvAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        this.data = data;
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
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            holder.textView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(data.get(position));
        if (mSelect == position) {
            convertView.setBackgroundColor(Color.WHITE); //选中项背景
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
