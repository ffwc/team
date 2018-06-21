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

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.JobAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class JobFragment extends Fragment {
    private TextView titleText;
    private TextView tlak_size;
    private View view;
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_job, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View view) {
        titleText = view.findViewById(R.id.leaguer_title);
        titleText.setText("作业");
        tlak_size = view.findViewById(R.id.tlak_size);
        tlak_size.setText("(21)");

        mLeaguerTitle = (TextView) view.findViewById(R.id.leaguer_title);
        mTlakSize = (TextView) view.findViewById(R.id.tlak_size);
        mJobRecycler = (RecyclerView) view.findViewById(R.id.job_recycler);
        mJobSmart = (SmartRefreshLayout) view.findViewById(R.id.job_smart);
    }

    private void initData() {
        mJobSmart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mJobSmart.finishRefresh(1000);
            }
        });
        mJobSmart.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mJobSmart.finishLoadMore(1000);
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        jobAdapter = new JobAdapter(getActivity());
    }
}
