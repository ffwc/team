package com.example.android.new_nds_study.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dell on 2018/6/26.
 */

public class ClassPageAdapter extends FragmentPagerAdapter {
List<Fragment> list;


    public ClassPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = list.get(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
