package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.classname.InteractiveFragment;
import com.example.android.new_nds_study.fragment.classname.MoreFragment;
import com.example.android.new_nds_study.fragment.classname.RemoteFragment;
import com.example.android.new_nds_study.fragment.classname.ResourceFragment;
import com.example.android.new_nds_study.fragment.classname.WritingFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClassnameActivity extends AppCompatActivity {

    private static final String TAG = "ClassnameActivity";
    @BindView(R.id.classname_textview)
    TextView classnameTextview;
    @BindView(R.id.classname_iv_remote)
    LinearLayout classnameIvRemote;
    @BindView(R.id.classname_iv_resource)
    LinearLayout classnameIvResource;
    @BindView(R.id.classname_iv_writing)
    LinearLayout classnameIvWriting;
    @BindView(R.id.classname_iv_interactive)
    LinearLayout classnameIvInteractive;
    @BindView(R.id.classname_iv_more)
    LinearLayout classnameIvMore;
    @BindView(R.id.classname_iv_time)
    ImageView classnameIvTime;
    @BindView(R.id.btn_beginclass)
    Button btnBeginclass;
    @BindView(R.id.right)
    RelativeLayout right;
    @BindView(R.id.drawerlayout)
    DrawerLayout drawerlayout;
    @BindView(R.id.iv_quit)
    ImageView ivQuit;
    @BindView(R.id.tv_countdown)
    TextView tvCountdown;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;
    private WritingFragment writingFragment;
    private ResourceFragment resourceFragment;
    private RemoteFragment remoteFragment;
    private MoreFragment moreFragment;
    private InteractiveFragment interactiveFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classname);
        MyApp.setTitFlag(this);
        ButterKnife.bind(this);
        initview();
        initviewviewpager();
    }

    private void initviewviewpager() {
        viewPager = findViewById(R.id.classname_viewpager);
        interactiveFragment = new InteractiveFragment();
        moreFragment = new MoreFragment();
        remoteFragment = new RemoteFragment();
        resourceFragment = new ResourceFragment();
        writingFragment = new WritingFragment();
        fragments = new ArrayList<>();
        fragments.add(remoteFragment);
        fragments.add(resourceFragment);
        fragments.add(writingFragment);
        fragments.add(interactiveFragment);
        fragments.add(moreFragment);
        //Log.i(TAG+"集合的长度是", String.valueOf(fragments.size()));
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), fragments));
        //ViewPager显示第一个Fragment
        //viewPager.setCurrentItem(0);
        //ViewPager页面切换监听
        //viewPager.setOnPageChangeListener();
    }


    private void initview() {

        DisplayMetrics dm = getResources().getDisplayMetrics();
        int heigth = dm.heightPixels;
        int width = dm.widthPixels;
        int btnwidth = width * 48 / 100;
        int btnheight = heigth * 72 / 1000;
        int btnbottom = heigth * 61 / 1000;
        double v = width * 43.5 / 100;
        Log.i(TAG, String.valueOf(v));
        Log.i(TAG + "按钮的高度", String.valueOf(btnheight));
        Log.i(TAG + "按钮的宽度", String.valueOf(btnwidth));
        btnBeginclass.setWidth(btnwidth);
        btnBeginclass.setHeight(btnheight);
        btnBeginclass.setBottom(btnbottom);


    }

    @OnClick({R.id.classname_iv_remote, R.id.classname_iv_resource,
            R.id.classname_iv_writing, R.id.classname_iv_interactive, R.id.classname_iv_more,
            R.id.classname_iv_time, R.id.iv_quit, R.id.btn_beginclass})
    public void onClick(View view) {
        ImageView imageView = findViewById(R.id.classname_imageview);
        imageView.setVisibility(View.GONE);
        btnBeginclass.setVisibility(View.GONE);
        switch (view.getId()) {
            case R.id.classname_iv_remote:
                //ViewPager显示第一个Fragment且关闭页面切换动画效果
                viewPager.setCurrentItem(0, true);
                break;
            case R.id.classname_iv_resource:
                viewPager.setCurrentItem(1, true);
                break;
            case R.id.classname_iv_writing:
                viewPager.setCurrentItem(2, true);
                break;
            case R.id.classname_iv_interactive:
                viewPager.setCurrentItem(3, true);
                break;
            case R.id.classname_iv_more:
                viewPager.setCurrentItem(4, true);
                break;
            case R.id.classname_iv_time:
                drawerlayout.openDrawer(Gravity.RIGHT);
                break;
            case R.id.iv_quit:
                finish();
                break;
            case R.id.btn_beginclass:
                viewPager.setCurrentItem(0, true);
                break;
            default:
                break;
        }
    }
}

