package com.example.sanfuproject.activity.utils;

import java.util.HashMap;
import java.util.Map;


import android.support.v4.app.Fragment;

import com.example.sanfuproject.activity.fragment.childfrag.BagFrag;
import com.example.sanfuproject.activity.fragment.childfrag.ClothFrag;
import com.example.sanfuproject.activity.fragment.childfrag.ManFrag;
import com.example.sanfuproject.activity.fragment.childfrag.WomanFrag;

public class FragmentFactory {
    private static Map<Integer, Fragment> fragmentMap = new HashMap<Integer, Fragment>();

    public static Fragment createFragment(int arg0) {
        //
        Fragment fragment = fragmentMap.get(arg0);
        if (fragment != null) {
            return fragment;
        } else {
            switch (arg0) {
                case 0:
                    fragment = new ManFrag();
                    break;
                case 1:
                    fragment = new WomanFrag();
                    break;
                case 2:
                    fragment = new ClothFrag();
                    break;
                case 3:
                    fragment = new BagFrag();
                    break;
            }
            //添加到map集合中去
            fragmentMap.put(arg0, fragment);
            return fragment;
        }
    }
}
