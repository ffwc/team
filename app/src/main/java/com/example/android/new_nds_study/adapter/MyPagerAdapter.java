package com.example.android.new_nds_study.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;


/**
 * Created by android on 2018/4/24.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;


    public MyPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {
//        Log.i("集合的长度", String.valueOf(fragments.size()));
        return fragments.size();
    }
}
