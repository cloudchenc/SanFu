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
import java.util.Map;

/**
 * Created by Hello on 2016/10/17.
 */

public class GoodsLvAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Map<String, String>> data;

    public GoodsLvAdapter(Context context, ArrayList<Map<String, String>> data) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        this.data = data;
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
            convertView = layoutInflater.inflate(R.layout.goods_list_item, null);
            holder.wayStr = (TextView) convertView.findViewById(R.id.goods_wayStr);
            holder.wayCon = (TextView) convertView.findViewById(R.id.goods_wayCon);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.wayStr.setText(data.get(position).get("wayStr"));
        holder.wayCon.setText(data.get(position).get("name"));

        return convertView;
    }

    class ViewHolder {
        TextView wayStr;
        TextView wayCon;
    }
}
