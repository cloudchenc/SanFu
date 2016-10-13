package com.example.sanfuproject.activity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.entity.Classify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.R.attr.data;
import static com.example.sanfuproject.R.id.list2;

/**
 * Created by Hello on 2016/10/13.
 */

public class ChildLvAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<String> list2_name;
    private List<Classify.MsgBean.CategoryBean.List2Bean> list2Been;
    private ArrayList<Map<String, String>> item_data;

    public ChildLvAdapter(Context context, ArrayList<String> list2_name, List<Classify.MsgBean.CategoryBean.List2Bean> list2Been) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        this.list2_name = list2_name;
        this.list2Been = list2Been;
    }

    @Override
    public int getCount() {
        return list2_name.size();
    }

    @Override
    public Object getItem(int position) {
        return list2_name.get(position);
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
            convertView = layoutInflater.inflate(R.layout.child_list_item, null);
            holder.textView = (TextView) convertView.findViewById(list2);
            holder.gridView = (GridView) convertView.findViewById(R.id.gridView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list2_name.get(position));
        initData(position);
        GridAdapter adapter = new GridAdapter(context, item_data);
        holder.gridView.setAdapter(adapter);
        return convertView;
    }

    private void initData(int position) {
        item_data = new ArrayList<Map<String, String>>();
        List<Classify.MsgBean.CategoryBean.List2Bean> list2 = list2Been.get(position).getList2();
        for (int j = 0; j < list2.size(); j++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("img", list2.get(j).getImg().toString());
            map.put("name", list2.get(j).getName().toString());
            if (!item_data.contains(map)) {
                item_data.add(map);
            }
        }
        System.out.println("--" + item_data);
    }

    class ViewHolder {
        TextView textView;
        GridView gridView;
    }
}
