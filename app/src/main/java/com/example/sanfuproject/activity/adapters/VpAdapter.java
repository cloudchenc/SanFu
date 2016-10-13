package com.example.sanfuproject.activity.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Hello on 2016/10/12.
 */

public class VpAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> vpList;

    public VpAdapter(FragmentManager fm, ArrayList<Fragment> vpList) {
        super(fm);
        this.vpList = vpList;
    }

    @Override
    public Fragment getItem(int position) {
        return vpList.get(position);
    }

    @Override
    public int getCount() {
        return vpList.size();
    }
}
