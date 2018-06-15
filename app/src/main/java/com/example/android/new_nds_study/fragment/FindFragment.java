package com.example.android.new_nds_study.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.TabLayoutBean;
import com.example.android.new_nds_study.m_v_p.presnster.TabLayoutPresenter;
import com.example.android.new_nds_study.m_v_p.view.TabLayoutPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class FindFragment extends Fragment implements TabLayoutPresenterListener {


    private static final String TAG = "FindFragment";
    private View view;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    private TabLayoutPresenter tabLayoutPresenter;
    private List<TabLayoutBean.DataBean.ListBean> listBean;
    private int name_id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.find_fragment, container, false);
        tabLayoutPresenter = new TabLayoutPresenter(this);
        tabLayoutPresenter.getData();

        return view;
    }

    @Override
    public void successe(TabLayoutBean tabLayoutBean) {

        if (tabLayoutBean == null) {
            return;
        }
        listBean = tabLayoutBean.getData().getList();
        initview(view);

    }

    private void initview(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mTabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        mTabLayout.setTabTextColors(Color.BLACK, Color.RED);
        //tablayout和viewpager关联
        mTabLayout.setupWithViewPager(mViewPager);
        //设置viewpager适配器
        mViewPager.setCurrentItem(0);
        mViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {


            //重写这个方法，将设置每个Tab的标题
            @Override
            public CharSequence getPageTitle(int position) {

                return listBean.get(position).getTitle();
            }

            @Override
            public Fragment getItem(int position) {

                //一般我们在这个位置对比一下标题是什么,,,然后返回对应的fragment
                //初始化fragment  对应position有多少，fragment有多少
                name_id = listBean.get(position).getId();
                NewFragment newFragment = new NewFragment();
                Bundle bundle = new Bundle();
                if (listBean.get(position).getTitle()
                        .equals(listBean.get(position).getTitle())) {
                    bundle.putInt("name", name_id);
                    LogUtil.i(TAG, "传递的值shi：" + name_id);
                }
                newFragment.setArguments(bundle);

                return newFragment;

            }

            @Override
            public int getCount() {
                //LogUtil.i(TAG, "listbean的数量" + listBean.size());
                return listBean.size();

            }

        });

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        tabLayoutPresenter.detach();

    }
}


