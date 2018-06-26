package com.example.android.new_nds_study.fragment.eachfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.JobAdapter;
import com.example.android.new_nds_study.m_v_p.bean.StudentBean;
import com.example.android.new_nds_study.m_v_p.presnster.JOBPresenter;
import com.example.android.new_nds_study.m_v_p.view.JOBPresenterLisnner;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobFragment extends Fragment implements JOBPresenterLisnner {
    /**
     * 讨论
     */
    private TextView mLeaguerTitle;
    /**
     * ()
     */
    private TextView mTlakSize;
    private RecyclerView mJobRecycler;
    private SmartRefreshLayout mJobSmart;
    private JobAdapter jobAdapter;
    private JOBPresenter jobPresenter;
//    private int Courses = 121;
    private String courses;
    private String token;
    private List<StudentBean> list = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_job, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View view) {
        mTlakSize = view.findViewById(R.id.tlak_size);
        mLeaguerTitle = view.findViewById(R.id.leaguer_title);
        mLeaguerTitle.setText("作业");
        mJobRecycler = (RecyclerView) view.findViewById(R.id.job_recycler);
        mJobSmart = (SmartRefreshLayout) view.findViewById(R.id.job_smart);
        mJobSmart.setEnableLoadMore(false);
        token = MyApp.sp.getString("token", null);
        courses = MyApp.sp.getString("course_id", null);
    }
    private void initData() {
        jobPresenter = new JOBPresenter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        jobAdapter = new JobAdapter(getActivity(), list);
        mJobRecycler.setLayoutManager(linearLayoutManager);
        mTlakSize.setText("("+list.size()+")");
        mJobRecycler.setAdapter(jobAdapter);
        getData();

        mJobSmart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                list.clear();
                getData();
            }
        });
    }
    public void getData() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                jobPresenter.getData(courses,token);
            }
        }.start();
        mJobSmart.finishRefresh();
    }
    @Override
    public void Sucess(final StudentBean[] jobBean) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                list.addAll(Arrays.asList(jobBean));
                mTlakSize.setText("("+list.size()+")");
                jobAdapter.notifyDataSetChanged();
            }
        });
    }
}

