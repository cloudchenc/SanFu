package com.example.sanfuproject.activity.fragment.childfrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.sanfuproject.R;
import com.squareup.picasso.Picasso;

import static com.example.sanfuproject.activity.utils.Constants.category;

/**
 * Created by Hello on 2016/10/12.
 */

public class ManFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.childfrag_listview, null);
        ListView listView = (ListView) view.findViewById(R.id.child_listView);
        ImageView imageView = (ImageView) view.findViewById(R.id.child_image);
        Picasso.with(getContext()).load(category.get(0).getImg()).into(imageView);
        return view;
    }
}
