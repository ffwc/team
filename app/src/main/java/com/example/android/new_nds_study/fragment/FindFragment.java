package com.example.android.new_nds_study.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;

;

/**
 * Created by android on 2018/4/17.
 */

public class FindFragment extends Fragment {


    private View view;
    TabLayout mTabLayout;
    ViewPager mViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.find_fragment, container, false);
        initview(view);
       // initViewPager(view);
        return view;

    }
/*
    private void initViewPager(View view) {
        ArrayList<GongGaoFragment> fragments = new ArrayList<>();
        // 装填
        AllFragment allfragment=new AllFragment();
        fragments.add( allfragment);
        fragments.add(new GongGaoFragment());
        fragments.add(new HuoDongFragment());
        fragments.add(new NewsFragment());
        // 创建ViewPager适配器

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager()){};
        myPagerAdapter.setFragments(fragments);
        // 给ViewPager设置适配器
        mViewPager.setAdapter(myPagerAdapter);
        // 使用 TabLayout 和 ViewPager 相关联
        mTabLayout.setupWithViewPager(mViewPager);


    }*/

    private void initview(View view) {
        mTabLayout =(TabLayout) view.findViewById(R.id.tablayout);
        mViewPager =(ViewPager) view.findViewById(R.id.viewpager);
        mTabLayout.addTab(mTabLayout.newTab().setText("全部"));
        mTabLayout.addTab(mTabLayout.newTab().setText("公告"));
        mTabLayout.addTab(mTabLayout.newTab().setText("活动"));
        mTabLayout.addTab(mTabLayout.newTab().setText("新闻"));


    }
}
