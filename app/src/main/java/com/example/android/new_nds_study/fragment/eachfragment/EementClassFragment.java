package com.example.android.new_nds_study.fragment.eachfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

public class EementClassFragment extends Fragment implements View.OnClickListener {


    private View view;
    /**
     * 代码初体验，制作我的第一个网页2
     */
    private TextView mItemEachClassStudyTitle;
    /**
     * 未开始
     */
    private TextView mItemEachClassStudyType;
    /**
     * 2016/03/09
     */
    private TextView mItemEachClassStudyStarttime;
    /**
     * |
     */
    private TextView mItemEachClassStudyG;
    /**
     * 15:30～17:30
     */
    private TextView mItemEachClassStudyStoptime;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_each_class_study, null);


        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    private void initView(View view) {
        mItemEachClassStudyTitle = (TextView) view.findViewById(R.id.item_each_class_study_title);
        mItemEachClassStudyTitle.setOnClickListener(this);
        mItemEachClassStudyType = (TextView) view.findViewById(R.id.item_each_class_study_type);
        mItemEachClassStudyType.setOnClickListener(this);
        mItemEachClassStudyStarttime = (TextView) view.findViewById(R.id.item_each_class_study_starttime);
        mItemEachClassStudyStarttime.setOnClickListener(this);
        mItemEachClassStudyG = (TextView) view.findViewById(R.id.item_each_class_study_g);
        mItemEachClassStudyG.setOnClickListener(this);
        mItemEachClassStudyStoptime = (TextView) view.findViewById(R.id.item_each_class_study_stoptime);
        mItemEachClassStudyStoptime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.item_each_class_study_title:



                break;
            case R.id.item_each_class_study_type:
                break;
            case R.id.item_each_class_study_starttime:
                break;
            case R.id.item_each_class_study_g:
                break;
            case R.id.item_each_class_study_stoptime:
                break;
        }
    }
}
