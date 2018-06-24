package com.example.android.new_nds_study.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class IntdentAdapter extends FragmentPagerAdapter {


    private List<Fragment> f;

    public IntdentAdapter(FragmentManager fm) {
        super(fm);
    }
    public void setList(List<Fragment> f){

        this.f = f;
    }

    @Override
    public Fragment getItem(int position) {
        return f.get(position);
    }

    @Override
    public int getCount() {
        return f.size();
    }

}
