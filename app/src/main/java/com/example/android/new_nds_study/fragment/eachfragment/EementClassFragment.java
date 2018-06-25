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
    private List<EementClassBean.DataBean.ListBean> beanList = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private EementClassRecyAdapter classRecyAdapter;
    private TextView title;
    private TextView tlak_size;
//    private int courses = 121;
    private int courses;
    private int limit = 5;
    private int page = 1;
    private int total;
    private RefreshLayout refreshLayout;
    private List<EementClassBean.DataBean.ListBean> list;

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
        classRecyAdapter = new EementClassRecyAdapter(getActivity(), beanList);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(classRecyAdapter);

        eementClassPresenter = new EementClassPresenter(this);
        courses =Integer.valueOf(MyApp.sp.getString("course_id", null));
        eementClassPresenter.getData(courses + "", limit + "", page + "");
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ++page;
                if (page <= ((total+4)/5)){
                    eementClassPresenter.getData(courses + "", limit + "", page + "");
                }else {
                    refreshLayout.finishLoadMore();
                }
            }
        });
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                beanList.clear();
                eementClassPresenter.getData(courses + "", limit + "", page + "");
            }
        });
    }

    @Override
    public void scuess(EementClassBean eementClassBean) {
//        LogUtil.i("adapter_size", eementClassBean.getData().getList().size() + "");
        if (eementClassBean.getData() != null) {
            total=eementClassBean.getData().getTotal();
            list = eementClassBean.getData().getList();
            beanList.addAll(list);
            tlak_size.setText("(" + total + ")");
            classRecyAdapter.notifyDataSetChanged();
        }
        refreshLayout.finishLoadMore();
        refreshLayout.finishRefresh();
    }
}