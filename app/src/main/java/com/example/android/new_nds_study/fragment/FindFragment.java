package com.example.android.new_nds_study.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.find.GongGaoFragment;
import com.example.android.new_nds_study.fragment.find.HuoDongFragment;
import com.example.android.new_nds_study.fragment.find.NewsFragment;
import com.example.android.new_nds_study.fragment.orderfragment.OrderAllFragment;

import java.util.ArrayList;


/**
 * Created by android on 2018/4/17.
 */

public class FindFragment extends Fragment {


    private View view;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    private ArrayList<Fragment> fragments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.find_fragment, container, false);
        initview(view);
        initViewPager();
        return view;

    }

    private void initViewPager() {
        fragments = new ArrayList<>();
        // 装填
        fragments.add(new OrderAllFragment());
        fragments.add(new GongGaoFragment());
        fragments.add(new HuoDongFragment());
        fragments.add(new NewsFragment());
        // 创建ViewPager适配器
        mViewPager.setAdapter(new MyPagerAdapter(getFragmentManager(), fragments));
        // 使用 TabLayout 和 ViewPager 相关联
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("全部");
        mTabLayout.getTabAt(1).setText("公告");
        mTabLayout.getTabAt(2).setText("活动");
        mTabLayout.getTabAt(3).setText("新闻");

    }

    private void initview(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case 0:
                        //ViewPager显示第一个Fragment且关闭页面切换动画效果
                        mViewPager.setCurrentItem(0, true);
                        break;
                    case 1:
                        mViewPager.setCurrentItem(1, true);
                        break;
                    case 2:
                        mViewPager.setCurrentItem(2, true);
                        break;
                    case 3:
                        mViewPager.setCurrentItem(3, true);
                        break;
                    default:
                        break;
                }
            }
        });


    }
}
