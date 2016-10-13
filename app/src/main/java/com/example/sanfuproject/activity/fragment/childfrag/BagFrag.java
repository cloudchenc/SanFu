package com.example.sanfuproject.activity.fragment.childfrag;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.ChildLvAdapter;
import com.example.sanfuproject.activity.entity.Classify;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.bitmap;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.sanfuproject.activity.utils.Constants.category;

/**
 * Created by Hello on 2016/10/12.
 */

public class BagFrag extends Fragment {

    private ArrayList<String> list2_name = new ArrayList<String>();
    private List<Classify.MsgBean.CategoryBean.List2Bean> list2Been = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.childfrag_listview, null);
        ImageView imageView = new ImageView(getContext());
        Picasso.with(getContext()).load(category.get(3).getImg()).into(imageView);
        ListView listView = (ListView) view.findViewById(R.id.child_listView);
        listView.addHeaderView(imageView);
        initData();
        ChildLvAdapter adapter = new ChildLvAdapter(getContext(), list2_name, list2Been);
        listView.setAdapter(adapter);
        return view;
    }

    private void initData() {
        list2Been = category.get(3).getList2();
        for (int i = 0; i < list2Been.size(); i++) {
            if (!list2_name.contains(list2Been.get(i).getName())) {
                list2_name.add(list2Been.get(i).getName());
                System.out.println("--" + list2_name.toString());
            }
        }
    }
}
