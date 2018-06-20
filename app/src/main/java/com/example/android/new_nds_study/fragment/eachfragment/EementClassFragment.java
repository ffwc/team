package com.example.android.new_nds_study.fragment.eachfragment;

import android.os.Bundle;
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

import java.util.ArrayList;
import java.util.List;

public class EementClassFragment extends Fragment implements EementPresenterListener {

private View view;
    private TextView eementClassTitle;
    private RecyclerView recycle;
    private EementClassPresenter eementClassPresenter;
    private List<EementClassBean.DataBean.ListBean> list=new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private EementClassRecyAdapter classRecyAdapter;
    private TextView title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.item_each_class_study, null);
        initView();
        initData();
        return view;
    }
    private void initView(){
    eementClassTitle = view.findViewById(R.id.leaguer_title);
    recycle = view.findViewById(R.id.eementClass_recycle);
    title = view.findViewById(R.id.leaguer_title);
    title.setText("单元");
    }

     private void initData(){
         eementClassPresenter = new EementClassPresenter(this);
         eementClassPresenter.getData("121","3");
         linearLayoutManager = new LinearLayoutManager(MyApp.applicationInstance());
         classRecyAdapter = new EementClassRecyAdapter(getActivity(), list);
         recycle.setLayoutManager(linearLayoutManager);
         recycle.setAdapter(classRecyAdapter);
    }

    @Override
    public void scuess(EementClassBean eementClassBean) {
        list.addAll(eementClassBean.getData().getList());
        classRecyAdapter.notifyDataSetChanged();
    }
}
