package com.example.android.new_nds_study.fragment.classfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.MyClassAdapter;
import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;
import com.example.android.new_nds_study.m_v_p.presnster.MyClassPresenter;
import com.example.android.new_nds_study.m_v_p.view.MyClassPresenterListener;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class MyclassFragment extends Fragment implements MyClassPresenterListener {
    private final static String TAG="MyclassFragment ";
    private View view;
    private RecyclerView mMyclassfragmentRecycler;
    private MyClassAdapter myClassAdapter;
    private MyClassPresenter myClassPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myclassfragment, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        myClassPresenter = new MyClassPresenter(this);
        myClassPresenter.getMyClassPresenter("1","c065f926bfd740be39fc2b34dfe12dc2e7882b09");
        Log.e(TAG,"检测");
    }

    private void initView(View view) {
        mMyclassfragmentRecycler = (RecyclerView) view.findViewById(R.id.myclassfragment_recycler);
    }
    @Override
    public void onSuccess(MyCoursesBean myCoursesBean) {
        Log.e(TAG,"检测"+myCoursesBean);
        myClassAdapter = new MyClassAdapter(getActivity(),myCoursesBean.getData().getList());
        mMyclassfragmentRecycler.setAdapter(myClassAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mMyclassfragmentRecycler.setLayoutManager(linearLayoutManager);
    }
   //防止内存泄露
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
