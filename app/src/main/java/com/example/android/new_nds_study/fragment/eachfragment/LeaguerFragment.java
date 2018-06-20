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
import com.example.android.new_nds_study.adapter.LeaguerAdapter;
import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassUnitPresenter;
import com.example.android.new_nds_study.m_v_p.view.UnitPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class LeaguerFragment extends Fragment implements UnitPresenterListener {

    private View view;
    private RecyclerView recycle;
    List<UnitBean.DataBean.ListBean>  unitList=new ArrayList<>();
    private LeaguerAdapter leaguerAdapter;
    private TextView tlak_size;
    private TextView titleText;

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
        ClassUnitPresenter classUnitPresenter = new ClassUnitPresenter(this);
        classUnitPresenter.getData(121,2,"c065f926bfd740be39fc2b34dfe12dc2e7882b09");

    }
    public  void initView(){
    recycle = this.view.findViewById(R.id.leaguer_recy);

    tlak_size = view.findViewById(R.id.tlak_size);
    }

    @Override
    public void successe(UnitBean unitBean) {
        if(unitBean.getData()!=null){

            List<UnitBean.DataBean.ListBean> list = unitBean.getData().getList();
            unitList.addAll(list);
            tlak_size.setText("("+list.size()+")");
            leaguerAdapter.notifyDataSetChanged();
        }


    }
}
