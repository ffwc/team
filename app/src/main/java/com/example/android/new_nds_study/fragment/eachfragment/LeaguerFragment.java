package com.example.android.new_nds_study.fragment.eachfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.LoginActivity;
import com.example.android.new_nds_study.adapter.LeaguerAdapter;
import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassUnitPresenter;
import com.example.android.new_nds_study.m_v_p.view.UnitPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.example.android.new_nds_study.util.MyDecoration;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class LeaguerFragment extends Fragment implements UnitPresenterListener {

    private View view;
    private RecyclerView recycle;
    List<UnitBean.DataBean.ListBean> unitList = new ArrayList<>();
    private LeaguerAdapter leaguerAdapter;
    private TextView tlak_size;
    private TextView titleText;
    private List<UnitBean.DataBean.ListBean> list;
//    private String token = "25d66c30859f7bc0f241435c85fc5445ce8c4734";
    private String token;
//    private int courses = 121;
    private String course_id;
    private SmartRefreshLayout leaguer_smart;
    private ClassUnitPresenter classUnitPresenter;
    private int page=1;
    private int total;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.leaguer_layout, container, false);
        initView();
        initData();
        return view;
    }

    private void initData() {
        LinearLayoutManager manager = new LinearLayoutManager(MyApp.applicationInstance());
        leaguerAdapter = new LeaguerAdapter(getActivity(), unitList);
        titleText = view.findViewById(R.id.leaguer_title);
        titleText.setText("成员");
        recycle.setLayoutManager(manager);
        recycle.setAdapter(leaguerAdapter);
        recycle.addItemDecoration(new MyDecoration(getActivity(), MyDecoration.VERTICAL_LIST));
        getData();

        leaguer_smart.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ++page;
                if (page <= ((total+9)/10)){
                    getData();
                }else {
                    leaguer_smart.finishLoadMore();
                }
            }
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page=1;
                unitList.clear();
                getData();
            }
        });
    }

    private void getData() {
//        LogUtil.i("page", page + "");
        token = MyApp.sp.getString("token", null);
        course_id = MyApp.sp.getString("course_id", null);
        
        classUnitPresenter.getData(Integer.valueOf(course_id), page, token);
    }


    public void initView() {
        leaguer_smart = view.findViewById(R.id.leaguer_smart);
        recycle = this.view.findViewById(R.id.leaguer_recy);
        tlak_size = view.findViewById(R.id.tlak_size);
        classUnitPresenter = new ClassUnitPresenter(this);
    }

    @Override
    public void successe(UnitBean unitBean,int flag) {
        if (unitBean.getData() != null) {
            total=unitBean.getData().getTotal();
            list = unitBean.getData().getList();
            unitList.addAll(list);
            tlak_size.setText("(" + total + ")");
            leaguerAdapter.notifyDataSetChanged();
            leaguer_smart.finishRefresh();
            leaguer_smart.finishLoadMore();
        }
    }

    static class MyHandler extends Handler {
        WeakReference<Activity> mActivityReference;

        MyHandler(Activity activity) {
            mActivityReference = new WeakReference<Activity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            final Activity activity = mActivityReference.get();
            if (activity != null) {

            }
        }
    }
}
