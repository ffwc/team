package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.ClassnameActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * Created by android on 2018/4/17.
 */

public class LiveFragment extends Fragment {

    @BindView(R.id.live_tv)
    TextView liveTv;
    Unbinder unbinder;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.live_fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;

    }

    @OnClick(R.id.live_tv)
    public void onClick() {
        Intent intent=new Intent(getActivity(), ClassnameActivity.class);
        startActivity(intent);
    }
}
