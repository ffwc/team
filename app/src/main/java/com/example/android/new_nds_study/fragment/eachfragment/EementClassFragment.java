package com.example.android.new_nds_study.fragment.eachfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

public class EementClassFragment extends Fragment {

private View view;
    private TextView eementClassTitle;

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

    }
private void initData(){

}

}
