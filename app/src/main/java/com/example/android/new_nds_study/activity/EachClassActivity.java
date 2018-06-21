package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.fragment.eachfragment.ClassTlakFrament;
import com.example.android.new_nds_study.fragment.eachfragment.EementClassFragment;
import com.example.android.new_nds_study.fragment.eachfragment.JobFragment;
import com.example.android.new_nds_study.fragment.eachfragment.LeaguerFragment;
import com.example.android.new_nds_study.fragment.eachfragment.QuizFragment;
import com.hjm.bottomtabbar.BottomTabBar;

public class EachClassActivity extends AppCompatActivity {

    private BottomTabBar tabBar;
    private TextView title_text;
    private ImageView mEachclassReturn;
    private TextView eachclass_correlation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_class);
        MyApp.setTitFlag(this);
        initView();
        seting();
    }

    private void initView() {
        tabBar = (BottomTabBar) findViewById(R.id.eachActivity_tab_bar);
        title_text = findViewById(R.id.eachclass_title);
        mEachclassReturn = (ImageView) findViewById(R.id.eachclass_return);
        eachclass_correlation = findViewById(R.id.eachclass_correlation);
    }

    private void seting() {
        Intent intent = getIntent();
        if(intent.getStringExtra("title")!=null){
            title_text.setText(intent.getStringExtra("title"));
        }
        //关闭页面
        mEachclassReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //关于课程的监听事件
        eachclass_correlation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Toast.makeText(EachClassActivity.this,"敬请期待",Toast.LENGTH_SHORT).show();     
            }
        });
        //这个init ( getSupportFragmentManager() )方法一定要第一个调用，没有//这个初始化，后边什么也做不了。
        tabBar.init(getSupportFragmentManager())
                .isShowDivider(true)
                .addTabItem("单元", R.drawable.class_tab_icon_unit_hover, R.drawable.class_tab_icon_unit_normal, EementClassFragment.class)
                .addTabItem("讨论", R.drawable.class_tab_icon_discussion_hover, R.drawable.class_tab_icon_discussion_normal, ClassTlakFrament.class)
                .addTabItem("成员", R.drawable.class_tab_icon_member_hover, R.drawable.class_tab_icon_member_normal, LeaguerFragment.class)
                .addTabItem("作业", R.drawable.class_tab_icon_homework_hover, R.drawable.class_tab_icon_homework_normal, JobFragment.class)
                .addTabItem("测验", R.drawable.class_tab_icon_test_hover, R.drawable.class_tab_icon_test_normal, QuizFragment.class);
    }

    public BottomTabBar getTabBar() {
        return tabBar;
    }
}
