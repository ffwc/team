package com.example.android.new_nds_study.fragment.classname;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.resourcefragment.PlaceFragment;
import com.example.android.new_nds_study.fragment.resourcefragment.YunFileFragment;

import java.lang.reflect.Field;
import java.util.ArrayList;


/**
 * Created by android on 2018/4/17.
 */

public class ResourceFragment extends Fragment{
    TabLayout mTabLayout;
    ViewPager mViewPager;
    private ArrayList<Fragment> fragments;
    private PlaceFragment placeFragment;
    private YunFileFragment yunFileFragment;
    int initPosition; //默认位置
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.resouce_fragment, container, false);
        initview(view);
        initViewPager();

        return  view;
    }

    private void initViewPager() {
        fragments = new ArrayList<Fragment>();
        placeFragment = new PlaceFragment();
        yunFileFragment = new YunFileFragment();
        fragments.add(placeFragment);
        fragments.add(yunFileFragment);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getFragmentManager(), fragments);
        // 创建ViewPager适配器
        mViewPager.setAdapter(myPagerAdapter);

        // 使用 TabLayout 和 ViewPager 相关联
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("本地");
        mTabLayout.getTabAt(1).setText("云盘");
    }
    private void initview(View view) {

        mTabLayout = (TabLayout) view.findViewById(R.id.serource_tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.resource_viewpager);
        mTabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        mTabLayout.setTabTextColors(Color.BLACK, Color.RED);
        mTabLayout.post(new Runnable() {
            @Override
            public void run() {
                setIndicator(mTabLayout, 60, 60);
            }
        });
        mTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.placeitem:

                        mViewPager.setCurrentItem(0, true);

                        break;
                    case R.id.yunfileitem:
                        mViewPager.setCurrentItem(1, true);
                        break;
                    default:
                        break;

                }
            }
        });


        //设置tab的点击监听器
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //将默认位置选中为false
                isSelected(mTabLayout.getTabAt(initPosition), false);
                //选中当前位置
                isSelected(tab, true);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                isSelected(tab, false);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                isSelected(tab, true);
            }
        });
    }


        public void setIndicator(TabLayout mTabLayout, int leftDip, int rightDip) {
            Class<?> tabLayout = mTabLayout.getClass();
            Field tabStrip = null;
            try {
                tabStrip = tabLayout.getDeclaredField("mTabStrip");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            tabStrip.setAccessible(true);
            LinearLayout llTab = null;
            try {
                llTab = (LinearLayout) tabStrip.get(mTabLayout);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, leftDip, Resources.getSystem().getDisplayMetrics());
            int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, rightDip, Resources.getSystem().getDisplayMetrics());

            for (int i = 0; i < llTab.getChildCount(); i++) {
                View child = llTab.getChildAt(i);
                child.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
                params.leftMargin = left;
                params.rightMargin = right;
                child.setLayoutParams(params);
                child.invalidate();
            }
        }

    /**
     * 设置选中的tab是否带缩放效果
     * @param tab
     * @param isSelected
     */
    private void isSelected(TabLayout.Tab tab, boolean isSelected) {
        View view = tab.getCustomView();
        if (null != view) {
            view.setScaleX(isSelected ? 1.3f : 1.0f);
            view.setScaleY(isSelected ? 1.3f : 1.0f);
        }
    }
    }


