package com.example.sanfuproject.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.sanfuproject.R;
import com.example.sanfuproject.activity.adapters.CartLvAdapter;
import com.example.sanfuproject.activity.entity.ShopCart;

import org.xutils.ex.DbException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.sanfuproject.activity.MyApplication.db;

/**
 * Created by Hello on 2016/10/11.
 */

public class CartFrag extends Fragment {

    private View view;
    private ArrayList<Map<String, String>> cart_data = new ArrayList<Map<String, String>>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cart, null);
        initView();
        return view;
    }

    private void initView() {
        try {
            ListView listView = (ListView) view.findViewById(R.id.goods_cart_lsv_goods_item);
            View emptyView = view.findViewById(R.id.goods_cart_linearlayout_no_data);
            listView.setEmptyView(emptyView);
            System.out.println("--111");
            List<ShopCart> all = db.selector(ShopCart.class).findAll();//findAll()：查询所有结果
            System.out.println("--" + all);
            if (all != null) {
                for (ShopCart item : all) {
//                Log.i("--", item.toString());
                    Map<String, String> map = new HashMap<String, String>();
                    map.put("img", item.getImgUrl());
                    map.put("name", item.getName());
                    map.put("size", item.getSize());
                    map.put("color", item.getColor());
                    map.put("price", item.getPrice());
                    map.put("number", item.getNumber());
                    cart_data.add(map);
                }
            }
            CartLvAdapter adapter = new CartLvAdapter(getContext(), cart_data);
            listView.setAdapter(adapter);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }
}
