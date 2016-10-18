package com.example.sanfuproject.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.SearchActivity;
import com.example.sanfuproject.activity.adapters.SearchGridAdapter;

import java.util.ArrayList;

import static com.example.sanfuproject.R.id.textView;
import static com.example.sanfuproject.activity.utils.Constants.keyword;

/**
 * Created by Hello on 2016/10/11.
 */

public class RightFrag extends Fragment {

    private ArrayList<String> scan_data = new ArrayList<>();
    private SearchGridAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, null);
        final EditText editText = (EditText) view.findViewById(R.id.search_edit);
        final TextView scan = (TextView) view.findViewById(R.id.search_scan);
        System.out.println("--" + scan_data);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyword = editText.getText().toString();
                if (!TextUtils.isEmpty(keyword)) {
                    if (!scan_data.contains(keyword)) {
                        scan_data.add(keyword);
                        adapter.notifyDataSetChanged();
                        editText.setText("");
                    }
                    Intent intent = new Intent(getContext(), SearchActivity.class);
                    intent.putExtra("keyword", keyword);
                    startActivity(intent);
                } else {
                    Toast.makeText(getContext(), "请输入商品名或货号", Toast.LENGTH_SHORT).show();
                }
            }
        });
        GridView gridview = (GridView) view.findViewById(R.id.search_gridview);
        adapter = new SearchGridAdapter(getContext(), scan_data);
        gridview.setAdapter(adapter);
        TextView del = (TextView) view.findViewById(R.id.search_del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!"".equals(scan_data.toString())) {
                    scan_data.clear();
                    adapter.notifyDataSetChanged();
                }
            }
        });
        return view;
    }

}
