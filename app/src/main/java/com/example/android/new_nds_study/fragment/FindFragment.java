package com.example.android.new_nds_study.fragment;


import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.MVP.bean.TabLayoutBean;
import com.example.android.new_nds_study.MVP.modle.TabLayoutModule;
import com.example.android.new_nds_study.MVP.view.TabLayoutModuleListener;
import com.example.android.new_nds_study.MVP.view.TabLayoutPresenterListener;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.find.FindAllFragment;
import com.example.android.new_nds_study.fragment.find.GongGaoFragment;
import com.example.android.new_nds_study.fragment.find.HuoDongFragment;
import com.example.android.new_nds_study.fragment.find.NewsFragment;
import com.example.android.new_nds_study.fragment.orderfragment.OrderAllFragment;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by android on 2018/4/17.
 */

public class FindFragment extends Fragment implements TabLayoutModuleListener {


    private View view;
    TabLayout mTabLayout;
    ViewPager mViewPager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.find_fragment, container, false);
        initview(view);

        return view;

    }


    private void initview(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);


    }

    @Override
    public void success(TabLayoutBean tabLayoutBean) {
        TabLayoutBean.DataBean data = tabLayoutBean.getData();
        List<TabLayoutBean.DataBean.ListBean> list = data.getList();
        LogUtil.i("-----",list.size()+"");

        for (int i = 0; i <= list.size(); i++) {
            mTabLayout.getTabAt(getId()).setText(list.get(i).getTitle());
        }


    }
}
