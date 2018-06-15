package com.example.android.new_nds_study.fragment.openclass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.ClassListRecyAdapter;
import com.example.android.new_nds_study.adapter.PayClassRecycler_adapter;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.bean.OpenClassBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassListPresenter;
import com.example.android.new_nds_study.m_v_p.presnster.OpenClassPresenter;
import com.example.android.new_nds_study.m_v_p.view.ClassPresenterListener;
import com.example.android.new_nds_study.m_v_p.view.OpenClassPreserentListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class AllFragment extends Fragment implements OpenClassPreserentListener {
    private static final String TAG = "AllFragment";
    private View view;
    private RecyclerView allrecyclerview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.openclass_allfragment, container, false);
        OpenClassPresenter openClassPresenter = new OpenClassPresenter(this);
        openClassPresenter.getData();

        return view;
    }

    @Override
    public void success(OpenClassBean openClassBean) {
        List<OpenClassBean.DataBean.ListBean> openclasslist = openClassBean.getData().getList();
        initopenclassview(view, openclasslist);


    }

    private void initopenclassview(View view, List<OpenClassBean.DataBean.ListBean> openclasslist) {
        allrecyclerview = view.findViewById(R.id.all_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        allrecyclerview.setLayoutManager(linearLayoutManager);
        PayClassRecycler_adapter payClassRecycler_adapter = new PayClassRecycler_adapter(getActivity(), openclasslist);
        allrecyclerview.setAdapter(payClassRecycler_adapter);
    }
}