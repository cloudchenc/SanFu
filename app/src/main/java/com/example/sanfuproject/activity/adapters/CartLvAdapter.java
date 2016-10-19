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
import java.util.Map;

/**
 * Created by Hello on 2016/10/18.
 */

public class CartLvAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Map<String, String>> data;

    public CartLvAdapter(Context context, ArrayList<Map<String, String>> data) {
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
            convertView = layoutInflater.inflate(R.layout.cart_list_item, null);
            holder.img = (ImageView) convertView.findViewById(R.id.goods_img);
            holder.name = (TextView) convertView.findViewById(R.id.goods_name);
            holder.size = (TextView) convertView.findViewById(R.id.goods_size);
            holder.color = (TextView) convertView.findViewById(R.id.goods_color);
            holder.price = (TextView) convertView.findViewById(R.id.goods_price);
            holder.number = (TextView) convertView.findViewById(R.id.goods_num);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(data.get(position).get("name"));
        holder.size.setText(data.get(position).get("size"));
        holder.color.setText(data.get(position).get("color"));
        holder.price.setText(data.get(position).get("price"));
        holder.number.setText(data.get(position).get("number"));
        Picasso.with(context).load(data.get(position).get("img")).into(holder.img);

        return convertView;
    }

    class ViewHolder {
        ImageView img;
        TextView name;
        TextView size;
        TextView color;
        TextView price;
        TextView number;
    }
}
