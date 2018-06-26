package com.example.android.new_nds_study.fragment.classfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.EachClassActivity;
import com.example.android.new_nds_study.adapter.MyClassAdapter;
import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;
import com.example.android.new_nds_study.m_v_p.presnster.MyClassPresenter;
import com.example.android.new_nds_study.m_v_p.view.MyClassPresenterListener;
import com.example.android.new_nds_study.util.NetWorkUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;


/**
 * Created by android on 2018/4/17.
 */

public class MyclassFragment extends Fragment implements MyClassPresenterListener {
    private final static String TAG = "MyclassFragment";
    private View view;
    private RecyclerView mMyclassfragmentRecycler;
    private MyClassAdapter myClassAdapter;
    private MyClassPresenter myClassPresenter;
    private SmartRefreshLayout myclassfragment_smart;
    private MyCoursesBean myCoursesBean = new MyCoursesBean();
    private int page = 1;
    private int total;
    private String token = "25d66c30859f7bc0f241435c85fc5445ce8c4734";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myclassfragment, container, false);
        initView(view);
        if (NetWorkUtil.isNetWorkEnable(MyApp.applicationInstance())) {
            initData();
        }

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (MyApp.sp.getString("token", "") != null) {
            token = MyApp.sp.getString("token", "");
        }
        if (MyApp.sp.getString("token", "") == null) {
            token = "25d66c30859f7bc0f241435c85fc5445ce8c4734";
        }
    }

    private void initData() {
        myClassPresenter = new MyClassPresenter(this);
        myClassAdapter = new MyClassAdapter(getActivity());
        mMyclassfragmentRecycler.setAdapter(myClassAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mMyclassfragmentRecycler.setLayoutManager(linearLayoutManager);
        myClassAdapter.setOnItemClickListener(new MyClassAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, String title, String course_id, String unit_id) {
                //跳转单元
                Intent intent = new Intent(getActivity(), EachClassActivity.class).putExtra("title", title).putExtra("courses", course_id).putExtra("unit", unit_id);
                startActivity(intent);
            }

        });
        myClassPresenter.getMyClassPresenter("1", "");
        //下拉刷新
        myclassfragment_smart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                myClassPresenter.getMyClassPresenter("" + page, token);
            }
        });
        //上拉加载
        myclassfragment_smart.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ++page;
                if (page <= ((total + 4) / 5)) {
                    myClassPresenter.getMyClassPresenter("" + page, token);
                } else {
                    myclassfragment_smart.finishLoadMore();
                }
            }
        });
    }

    private void initView(View view) {
        mMyclassfragmentRecycler = (RecyclerView) view.findViewById(R.id.myclassfragment_recycler);
        myclassfragment_smart = view.findViewById(R.id.myclassfragment_smart);
        myclassfragment_smart.setEnableAutoLoadMore(false);
    }

    @Override
    public void onSuccess(MyCoursesBean myCoursesBean, String flag) {
//        Log.e(TAG,"检测"+myCoursesBean);
        //设置RecyclerView 点击条目事件
        this.myCoursesBean = myCoursesBean;
//        Log.e(TAG, "onSuccess: "+flag);
        if (flag.equals("1")) {
            total = myCoursesBean.getData().getTotal();
            myClassAdapter.setDataClear(myCoursesBean.getData().getList());
        } else {
            myClassAdapter.setData(myCoursesBean.getData().getList());
        }
        myclassfragment_smart.finishRefresh();
        myclassfragment_smart.finishLoadMore();
    }

    //防止内存泄露
    @Override
    public void onDestroy() {
        super.onDestroy();
        myClassPresenter.detach();
    }
}
