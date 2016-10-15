package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanfuproject.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Hello on 2016/10/15.
 */

public class FreshGridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private LinkedList<Map<String, Object>> data;

    public FreshGridAdapter(Context context, LinkedList<Map<String, Object>> data) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        this.data = data;
        System.out.println("--data:" + data);
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
            convertView = layoutInflater.inflate(R.layout.fresh_grid_item, null);
            holder.imgView = (ImageView) convertView.findViewById(R.id.fresh_img);
            holder.nameView = (TextView) convertView.findViewById(R.id.fresh_name);
            holder.priceView = (TextView) convertView.findViewById(R.id.fresh_price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.nameView.setText((String) data.get(position).get("goods_name"));
        holder.priceView.setText("￥ " + (Integer) data.get(position).get("mb_price") + ".00");
        String url = (String) data.get(position).get("l_img");
        if (!"".equals(url)) {
            Picasso.with(context).load(url).into(holder.imgView);
        } else {
            Picasso.with(context).load(R.drawable.error).into(holder.imgView);
        }
        return convertView;
    }

    class ViewHolder {
        ImageView imgView;
        TextView nameView;
        TextView priceView;
    }
}
