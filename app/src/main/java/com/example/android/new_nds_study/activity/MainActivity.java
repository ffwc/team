package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.fragment.ClassFragment;
import com.example.android.new_nds_study.fragment.DynamicFragment;
import com.example.android.new_nds_study.fragment.FindFragment;
import com.example.android.new_nds_study.fragment.LiveFragment;
import com.example.android.new_nds_study.fragment.MyFragment;
import com.hjm.bottomtabbar.BottomTabBar;

/**
 * Created by android on 2018/4/17.
 */

public class MainActivity extends AppCompatActivity {
    private BottomTabBar tabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApp.setTitFlag(this);
        tabBar = (BottomTabBar) findViewById(R.id.bottom_tab_bar);
        //这个init ( getSupportFragmentManager() )方法一定要第一个调用，没有//这个初始化，后边什么也做不了。
        tabBar.init(getSupportFragmentManager())
                .addTabItem("动态", R.mipmap.tab_icon_dynamic_hover, R.mipmap.tab_icon_dynamic_normal, DynamicFragment.class)
                .addTabItem("发现", R.mipmap.tab_icon_find_hover, R.mipmap.tab_icon_find_normal, FindFragment.class)
                .addTabItem("现场", R.mipmap.tab_icon_live_hover, R.mipmap.tab_icon_live_normal, LiveFragment.class)
                .addTabItem("课程", R.mipmap.tab_icon_course_hover, R.mipmap.tab_icon_course_normal, ClassFragment.class)
                .addTabItem("我的", R.mipmap.tab_icon_communication_hover, R.mipmap.tab_icon_communication_normal, MyFragment.class);
    }

    //记录用户首次点击返回键的时间
    private long firstTime = 0;

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:

                long secondTime = System.currentTimeMillis();
                if (secondTime - firstTime > 2000) {

                    Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                    firstTime = secondTime;
                    return true;

                } else {

                    System.exit(0);

                }
                break;
            default:
                break;

        }

        return super.onKeyUp(keyCode, event);
    }
}
