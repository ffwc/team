package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.androidkun.xtablayout.XTabLayout;
import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.openclass.AllFragment;
import com.example.android.new_nds_study.fragment.openclass.NoPayFragment;
import com.example.android.new_nds_study.fragment.openclass.PayFragment;

import java.util.ArrayList;
import java.util.List;

public class OpenClassActivity extends AppCompatActivity {

    private XTabLayout xtab;
    private ImageView iv_return;
    private ViewPager viewpager;
    private List fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_class);

        initview();
        initviewpager();
    }


    private void initview() {
        MyApp.setTitFlag(this);
        iv_return = findViewById(R.id.iv_openclass_return);
        iv_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        xtab = findViewById(R.id.openclass_xtab);
        viewpager = findViewById(R.id.openclass_viewpager);


    }

    private void initviewpager() {
        AllFragment allFragment = new AllFragment();
        PayFragment payFragment = new PayFragment();
        NoPayFragment noPayFragment = new NoPayFragment();
        fragments = new ArrayList<Fragment>();
        fragments.add(allFragment);
        fragments.add(payFragment);
        fragments.add(noPayFragment);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragments);
        // 创建ViewPager适配器
        viewpager.setAdapter(myPagerAdapter);

        // 使用 TabLayout 和 ViewPager 相关联

        xtab.setupWithViewPager(viewpager);

        xtab.getTabAt(0).setText("全部");
        xtab.getTabAt(1).setText("付费");
        xtab.getTabAt(2).setText("免费");

    }

}
