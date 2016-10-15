package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.sanfuproject.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class HomeGridView extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<String> list4;

    public HomeGridView(Context context, ArrayList<String> list4) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        this.list4 = list4;
    }

    @Override
    public int getCount() {
        return list4.size();
    }

    @Override
    public Object getItem(int position) {
        return list4.get(position);
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

            convertView = layoutInflater.inflate(R.layout.home_gridview, null);
            holder.imageView = (ImageView) convertView.findViewById(R.id.image_gridview);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String url = list4.get(position);
        Picasso.with(context).load(url).into(holder.imageView);
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;

    }
}
