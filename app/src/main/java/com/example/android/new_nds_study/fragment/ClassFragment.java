package com.example.android.new_nds_study.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.androidkun.xtablayout.XTabLayout;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.classfragment.ClassingFragment;
import com.example.android.new_nds_study.fragment.classfragment.MyclassFragment;

import java.util.ArrayList;


/**
 * Created by android on 2018/4/17.
 */

public class ClassFragment extends Fragment {

    private View view;
    private LinearLayout include_head;
    private com.androidkun.xtablayout.TabItem head_classing;
    private com.androidkun.xtablayout.TabItem head_myclass;
    private android.support.design.widget.TabItem classing;
    private android.support.design.widget.TabItem myclass;
    XTabLayout head_tablayout;
    TabLayout tablayout;
    private LinearLayout linearLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.class_fragment, container, false);
        initview(view);
        initviewpager(view);
        return view;
    }


    private void initview(View view) {
        linearLayout = view.findViewById(R.id.include_head);
        head_tablayout = view.findViewById(R.id.head_tablayout);
//        tablayout = view.findViewById(R.id.tablayout);
        include_head = view.findViewById(R.id.include_head);
        /*head_classing = view.findViewById(R.id.head_classing_tabitem);
        head_myclass = view.findViewById(R.id.head_myclass_tabitem);*/
//        classing = view.findViewById(R.id.classing_tabitem);
//        myclass = view.findViewById(R.id.myclass_tabitem);
        viewPager = view.findViewById(R.id.class_viewpager);
        head_tablayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case 0:
                        viewPager.setCurrentItem(0, true);
                        break;
                    case 1:
                        viewPager.setCurrentItem(1, true);
                        break;
                    default:
                        break;

                }
            }
        });
    }


    private void initviewpager(View view) {
        ClassingFragment classingFragment = new ClassingFragment();
        MyclassFragment myclassFragment = new MyclassFragment();
        fragments = new ArrayList<Fragment>();
        fragments.add(classingFragment);
        fragments.add(myclassFragment);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getFragmentManager(), fragments);
        // 创建ViewPager适配器
        viewPager.setAdapter(myPagerAdapter);
        // 使用 TabLayout 和 ViewPager 相关联  
        head_tablayout.setupWithViewPager(viewPager);
//          tablayout.setupWithViewPager(viewPager);
//          tablayout.getTabAt(0).setText("正在进行");
//          tablayout.getTabAt(1).setText("我的课程");
        head_tablayout.getTabAt(0).setText("正在进行");
        head_tablayout.getTabAt(1).setText("我的课程");

    }


}


