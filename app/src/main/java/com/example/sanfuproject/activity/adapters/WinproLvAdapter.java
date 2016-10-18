package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sanfuproject.R;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Hello on 2016/10/18.
 */

public class WinproLvAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Map<String, String>> data;

    public WinproLvAdapter(Context context, ArrayList<Map<String, String>> data) {
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
            convertView = layoutInflater.inflate(R.layout.window_pro_item, null);
            holder.pro_class = (TextView) convertView.findViewById(R.id.pro_class);
            holder.pro_class_content = (TextView) convertView.findViewById(R.id.pro_class_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.pro_class.setText(data.get(position).get("class"));
        holder.pro_class_content.setText(data.get(position).get("content"));

        return convertView;
    }

    class ViewHolder {
        TextView pro_class;
        TextView pro_class_content;
    }
}
