package com.example.android.new_nds_study.fragment;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;

import com.androidkun.xtablayout.XTabLayout;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyPagerAdapter;
import com.example.android.new_nds_study.fragment.classfragment.ClassingFragment;
import com.example.android.new_nds_study.fragment.classfragment.MyclassFragment;
import com.example.android.new_nds_study.m_v_p.bean.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.security.Key;
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
    private LinearLayout include_head_linearLayout;
    String  a;
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
        include_head = view.findViewById(R.id.include_head);
        include_head_linearLayout = view.findViewById(R.id.include_head_linearLayout);
//        tablayout = view.findViewById(R.id.tablayout);
//        head_classing = view.findViewById(R.id.head_classing_tabitem);
//        head_myclass = view.findViewById(R.id.head_myclass_tabitem);
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
    //订阅者
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onMessageEvent(MessageEvent event) {
        if (event.getFlag()==1){
            Resources resources = getActivity().getResources();
            DisplayMetrics dm = resources.getDisplayMetrics();
            int height = dm.heightPixels;
            
//            include_head_linearLayout.setVisibility(View.GONE);
            include_head_linearLayout.animate()
                    .translationY(-height)
                    .setDuration(800)
                    .setInterpolator(new AccelerateInterpolator(2))
                    .start();
//            ViewGroup.LayoutParams layoutParams = include_head_linearLayout.getLayoutParams();
//            layoutParams.height=height;
//            include_head_linearLayout.setLayoutParams(layoutParams);
            EventBus.getDefault().removeStickyEvent(event);
        }else if (event.getFlag()==2){
//            include_head_linearLayout.setVisibility(View.VISIBLE);

            include_head_linearLayout
                    .animate().translationY(0)
                    .setInterpolator(new DecelerateInterpolator(2))
                    .setDuration(800).start();
            EventBus.getDefault().removeStickyEvent(event);
        }
    }
    
//    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
//    public void onMessageEvent(String a) {
//       if(a.equals("0")){
//           include_head_linearLayout.setVisibility(View.GONE);   
//       }else {
//           include_head_linearLayout.setVisibility(View.VISIBLE); 
//       }
//    }
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
        EventBus.getDefault().register(this);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        //取消订阅
        EventBus.getDefault().unregister(this);
    }
}


