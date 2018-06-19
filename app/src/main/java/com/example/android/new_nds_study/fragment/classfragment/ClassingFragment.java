package com.example.android.new_nds_study.fragment.classfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.OpenClassActivity;
import com.example.android.new_nds_study.adapter.ClassListRecyAdapter;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassListPresenter;
import com.example.android.new_nds_study.m_v_p.view.ClassPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class ClassingFragment extends Fragment implements ClassPresenterListener {
    private static final String TAG = "AllFragment";
    private View view;
    private ClassListPresenter classListPresenter;
    private XRecyclerView recyclerView;
    private ClassListRecyAdapter classListRecyAdapter;
    private LinearLayoutManager manager;
    private List<ClassListBean.DataBean.ListBean> list;
    private TextView moretext;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.classingfragment, container, false);
        LogUtil.i(TAG,"+++++++开始请求数据");
        classListPresenter = new ClassListPresenter(this);
        /*classListPresenter.getData();*/

        return view;
    }
    @Override
    public void success(ClassListBean classListBean) {
        LogUtil.i(TAG,"数据请求成功");
        if (classListBean==null){
            return;
        }

        list = classListBean.getData().getList();
        initview(view, list);
    }

    private void initview(View view, List<ClassListBean.DataBean.ListBean> list) {

        recyclerView = view.findViewById(R.id.classing_recyclerview);

        manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        classListRecyAdapter = new ClassListRecyAdapter(getActivity(), list);
        recyclerView.setAdapter(classListRecyAdapter);

    }

}