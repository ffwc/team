package com.example.android.new_nds_study.fragment.classfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.ClassListRecyAdapter;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassListPresenter;
import com.example.android.new_nds_study.m_v_p.view.ClassPresenterListener;
import com.example.android.new_nds_study.util.ToastUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class ClassingFragment extends Fragment implements ClassPresenterListener {
    private static final String TAG = "AllFragment";
    private View view;
    private ClassListPresenter classListPresenter;
    private RecyclerView recyclerView;
    private ClassListRecyAdapter classListRecyAdapter;
    private LinearLayoutManager manager;
    private List<ClassListBean.DataBean.ListBean> list = new ArrayList<>();
    private SmartRefreshLayout refreshLayout;
    private int page = 1;
    private int limit = 5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.classingfragment, container, false);
        classListPresenter = new ClassListPresenter(this);
        initview();
        getData();
        return view;
    }

    private void getData() {
        classListPresenter.getData(limit, page);
    }

    @Override
    public void success(ClassListBean classListBean) {
//        LogUtil.i(TAG, "数据请求成功");
        if (classListBean == null) {
            return;
        }
        list.addAll(classListBean.getData().getList());
        if (classListBean.getData().getList() == null) {
            ToastUtils.show(getContext(), "暂无数据", Toast.LENGTH_SHORT);
        }
        classListRecyAdapter.notifyDataSetChanged();
        refreshLayout.finishLoadMore();
        refreshLayout.finishRefresh();
    }

    private void initview() {
        recyclerView = view.findViewById(R.id.classing_recyclerview);
        refreshLayout = view.findViewById(R.id.myclassfragment_smart);
        refreshLayout.setEnableAutoLoadMore(false);

        manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        classListRecyAdapter = new ClassListRecyAdapter(getActivity(), list);
        recyclerView.setAdapter(classListRecyAdapter);
        classListPresenter.getData(limit, page);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                list.clear();
                getData();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page++;
                getData();
            }
        });

    }
}