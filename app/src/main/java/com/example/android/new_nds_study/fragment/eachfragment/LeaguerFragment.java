package com.example.android.new_nds_study.fragment.eachfragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import com.example.android.new_nds_study.adapter.LeaguerAdapter;
import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassUnitPresenter;
import com.example.android.new_nds_study.m_v_p.view.UnitPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.example.android.new_nds_study.util.MyDecoration;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class LeaguerFragment extends Fragment implements UnitPresenterListener {

    private View view;
    private XRecyclerView recycle;
    List<UnitBean.DataBean.ListBean> unitList = new ArrayList<>();
    private LeaguerAdapter leaguerAdapter;
    private TextView tlak_size;
    private TextView titleText;
    private int page = 1;
    private List<UnitBean.DataBean.ListBean> list;
    private String token = "c065f926bfd740be39fc2b34dfe12dc2e7882b09";
    private int Courses = 121;

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
        recycle.setPullRefreshEnabled(true);
        recycle.setLoadingMoreEnabled(true);
        recycle.addItemDecoration(new MyDecoration(getActivity(), MyDecoration.VERTICAL_LIST));

        recycle.setLoadingMoreProgressStyle(ProgressStyle.SquareSpin);
        getData();

        recycle.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                new MyHandler(getActivity()).postDelayed(new Runnable() {
                    public void run() {
                        unitList.clear();
                        getData();
                        recycle.refreshComplete();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                new MyHandler(getActivity()).postDelayed(new Runnable() {
                    public void run() {
                        page += 1;
                        getData();
                    }

                }, 2000);
            }
        });
    }

    private void getData() {
        ClassUnitPresenter classUnitPresenter = new ClassUnitPresenter(this);
        LogUtil.i("page", page + "");
        classUnitPresenter.getData(Courses, page, token);
    }


    public void initView() {
        recycle = this.view.findViewById(R.id.leaguer_recy);

        tlak_size = view.findViewById(R.id.tlak_size);
    }

    @Override
    public void successe(UnitBean unitBean) {
        if (unitBean.getData() != null) {
            list = unitBean.getData().getList();
            unitList.addAll(list);
            tlak_size.setText("(" + list.size() + ")");
            leaguerAdapter.notifyDataSetChanged();
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
