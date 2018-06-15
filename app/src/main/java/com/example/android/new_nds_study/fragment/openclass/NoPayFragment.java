package com.example.android.new_nds_study.fragment.openclass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
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

public class NoPayFragment extends Fragment {
    private static final String TAG = "NoPayFragment";
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.openclass_nopayfragment, container, false);


        return view;
    }
}