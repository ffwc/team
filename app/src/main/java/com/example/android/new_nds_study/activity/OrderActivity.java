package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.orderfragment.Cancle_Payment_Fragment;
import com.example.android.new_nds_study.fragment.orderfragment.No_Payment_Fragment;
import com.example.android.new_nds_study.fragment.orderfragment.Ok_Payment_Fragment;
import com.example.android.new_nds_study.fragment.orderfragment.OrderAllFragment;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        initview();
        initviewpager();
    }

    private void initviewpager() {
        OrderAllFragment orderAllFragment = new OrderAllFragment();
        No_Payment_Fragment no_payment_fragment = new No_Payment_Fragment();
        Ok_Payment_Fragment ok_payment_fragment = new Ok_Payment_Fragment();
        Cancle_Payment_Fragment cancle_payment_fragment = new Cancle_Payment_Fragment();
        fragments = new ArrayList<>();
        fragments.add(orderAllFragment);
        fragments.add(no_payment_fragment);
        fragments.add(ok_payment_fragment);
        fragments.add(cancle_payment_fragment);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), fragments));
        mViewPager.setCurrentItem(0);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("全部");
        mTabLayout.getTabAt(1).setText("代付款");
        mTabLayout.getTabAt(2).setText("已完成");
        mTabLayout.getTabAt(3).setText("已取消");

    }
    private void initview() {
        MyApp.setTitFlag(this);
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
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