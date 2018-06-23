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
import com.example.android.new_nds_study.adapter.EementClassRecyAdapter;
import com.example.android.new_nds_study.m_v_p.bean.EementClassBean;
import com.example.android.new_nds_study.m_v_p.presnster.EementClassPresenter;
import com.example.android.new_nds_study.m_v_p.view.EementPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.example.android.new_nds_study.util.MyDecoration;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

public class EementClassFragment extends Fragment implements EementPresenterListener {

    private View view;
    private TextView eementClassTitle;
    private RecyclerView recycle;
    private EementClassPresenter eementClassPresenter;
    private List<EementClassBean.DataBean.ListBean> list = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private EementClassRecyAdapter classRecyAdapter;
    private TextView title;
    private TextView tlak_size;
    private int courses = 121;
    private int limit = 1;
    private int page = 1;
    private RefreshLayout refreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.item_each_class_study, null);
        initView();
        initData();
        return view;
    }

    private void initView() {
        eementClassTitle = view.findViewById(R.id.leaguer_title);
        recycle = view.findViewById(R.id.eementClass_recycle);
        title = view.findViewById(R.id.leaguer_title);
        tlak_size = view.findViewById(R.id.tlak_size);
        refreshLayout = view.findViewById(R.id.item_each_Refresh);
        title.setText("单元");
    }

    private void initData() {
        linearLayoutManager = new LinearLayoutManager(MyApp.applicationInstance());
        classRecyAdapter = new EementClassRecyAdapter(getActivity(), list);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(classRecyAdapter);
        recycle.addItemDecoration(new MyDecoration(getActivity(), MyDecoration.VERTICAL_LIST));

        eementClassPresenter = new EementClassPresenter(this);
        eementClassPresenter.getData(courses + "", limit + "", page + "");
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page += 2;
                eementClassPresenter.getData(courses + "", limit + "", page + "");
            }
        });
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;

                eementClassPresenter.getData(courses + "", limit + "", page + "");
                list.clear();
            }
        });
    }

    @Override
    public void scuess(EementClassBean eementClassBean) {
//        LogUtil.i("adapter_size", eementClassBean.getData().getList().size() + "");
        list.addAll(eementClassBean.getData().getList());
        classRecyAdapter.notifyDataSetChanged();
        tlak_size.setText("(" + list.size() + ")");
        refreshLayout.finishLoadMore();
        refreshLayout.finishRefresh();
    }
}