package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.fragment.eachfragment.ClassTlakFrament;
import com.example.android.new_nds_study.fragment.eachfragment.EementClassFragment;
import com.example.android.new_nds_study.fragment.eachfragment.LeaguerFragment;
import com.hjm.bottomtabbar.BottomTabBar;

public class EachClassActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mEachclassReturn;
    /**
     * HTML+CSS基础课程
     */
    private TextView mEachclassTitle;
    private ImageView mEachclassCorrelation;
    private RelativeLayout mEachclassHeadLayout;
    private BottomTabBar tabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_class);
        initView();
        initData();
    }
    private void initView() {
        
        tabBar = (BottomTabBar) findViewById(R.id.eachActivity_tab_bar);
        mEachclassReturn = (ImageView) findViewById(R.id.eachclass_return);
        mEachclassTitle = (TextView) findViewById(R.id.eachclass_title);
        mEachclassCorrelation = (ImageView) findViewById(R.id.eachclass_correlation);
        mEachclassHeadLayout = (RelativeLayout) findViewById(R.id.eachclass_head_layout);
        
        mEachclassReturn.setOnClickListener(this);
        mEachclassCorrelation.setOnClickListener(this);
    }
    private void initData() {
        //这个init ( getSupportFragmentManager() )方法一定要第一个调用，没有//这个初始化，后边什么也做不了。
        tabBar.init(getSupportFragmentManager())
                .addTabItem("单元", R.drawable.ic_tab_icon_dynamic_hover, R.mipmap.tab_icon_dynamic_normal, EementClassFragment.class)
                .addTabItem("讨论", R.mipmap.tab_icon_find_hover, R.mipmap.tab_icon_find_normal, ClassTlakFrament.class)
                .addTabItem("成员", R.mipmap.tab_icon_live_hover, R.mipmap.tab_icon_live_normal, ClassTlakFrament.class)
                .addTabItem("作业", R.mipmap.tab_icon_course_hover, R.mipmap.tab_icon_course_normal, EementClassFragment.class)
                .addTabItem("测验", R.mipmap.tab_icon_communication_hover, R.mipmap.tab_icon_communication_normal, LeaguerFragment.class);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.eachclass_return:
                 finish();
                 break;  
            case R.id.eachclass_correlation:
                 break;
        }
    }
}
