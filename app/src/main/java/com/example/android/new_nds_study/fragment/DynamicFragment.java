package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.OpenClassActivity;
import com.example.android.new_nds_study.adapter.BigPictureRecycler_adapter;
import com.example.android.new_nds_study.adapter.FreeClassRecycler_adapter;
import com.example.android.new_nds_study.adapter.PayClassRecycler_adapter;
import com.example.android.new_nds_study.m_v_p.bean.OpenClassBean;
import com.example.android.new_nds_study.m_v_p.bean.RecommendBigPictureBean;
import com.example.android.new_nds_study.m_v_p.presnster.OpenClassPresenter;
import com.example.android.new_nds_study.m_v_p.presnster.RecommendBigPicturePreserent;
import com.example.android.new_nds_study.m_v_p.view.OpenClassPreserentListener;
import com.example.android.new_nds_study.m_v_p.view.RecommendBigPicturePresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by android on 2018/4/17.
 */

public class DynamicFragment extends Fragment implements OpenClassPreserentListener, RecommendBigPicturePresenterListener {
    String TAG = "DynamicFragment";
    private View view;
    private RecyclerView big_picture_recyclerview;
    private TextView textmore;
    private RecyclerView payrecyclerview;
    private RecyclerView freerecyclerview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dynamic_fragment, container, false);
        OpenClassPresenter openClassPresenter = new OpenClassPresenter(this);
        openClassPresenter.getData();
        RecommendBigPicturePreserent recommendBigPicturePreserent = new RecommendBigPicturePreserent(this);
        recommendBigPicturePreserent.getData();

        return view;
    }


    @Override
    public void success(OpenClassBean openClassBean) {
       // LogUtil.i(TAG + "openClassBean的长度", openClassBean.getData().getList().size() + "");
        List<OpenClassBean.DataBean.ListBean> openclasslist = openClassBean.getData().getList();
        initopenclassview(view, openclasslist);
        initfreerecycler(view,openclasslist);

    }
    @Override
    public void success(RecommendBigPictureBean recommendBigPictureBean) {
        List<RecommendBigPictureBean.DataBean.ListBean> list = recommendBigPictureBean.getData().getList();
        initview(view, list);
    }

    private void initfreerecycler(View view, List<OpenClassBean.DataBean.ListBean> openclasslist) {
        freerecyclerview = view.findViewById(R.id.free_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        freerecyclerview.setLayoutManager(linearLayoutManager);
        FreeClassRecycler_adapter freeClassRecycler_adapter = new FreeClassRecycler_adapter(getActivity(), openclasslist);
        freerecyclerview.setAdapter(freeClassRecycler_adapter);

    }



    private void initview(View view, List<RecommendBigPictureBean.DataBean.ListBean> list) {
        LogUtil.i(TAG + "推荐大图：", list.size() + "");
        big_picture_recyclerview = view.findViewById(R.id.big_picture_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        big_picture_recyclerview.setLayoutManager(linearLayoutManager);
        BigPictureRecycler_adapter bigPictureRecycler_adapter = new BigPictureRecycler_adapter(getActivity(), list);
        big_picture_recyclerview.setAdapter(bigPictureRecycler_adapter);

    }


    private void initopenclassview(View view, List<OpenClassBean.DataBean.ListBean> openclasslist) {
        LogUtil.i(TAG + "推荐课程：", openclasslist.size() + "");
        textmore = view.findViewById(R.id.class_more_text);
        textmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OpenClassActivity.class);
                startActivity(intent);

            }
        });
        payrecyclerview = view.findViewById(R.id.pay_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        payrecyclerview.setLayoutManager(linearLayoutManager);
        PayClassRecycler_adapter payClassRecycler_adapter = new PayClassRecycler_adapter(getActivity(), openclasslist);
        payrecyclerview.setAdapter(payClassRecycler_adapter);



    }


}
