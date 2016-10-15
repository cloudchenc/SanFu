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

import static android.R.attr.data;

/**
 * Created by Hello on 2016/10/14.
 */

public class SearchGridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<String> data;

    public SearchGridAdapter(Context context, ArrayList<String> data) {
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
            convertView = layoutInflater.inflate(R.layout.search_grid_item, null);
            holder.textView = (TextView) convertView.findViewById(R.id.history);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(data.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}
