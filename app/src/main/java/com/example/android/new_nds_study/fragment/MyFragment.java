package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.OrderActivity;
import com.example.android.new_nds_study.activity.SetActivity;

import butterknife.ButterKnife;

/**
 * Created by android on 2018/4/17.
 */

public class MyFragment extends Fragment {

    private View view;
    private TextView textviewset;
    private LinearLayout layoutorder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_fragment, container, false);
        ButterKnife.bind(this, view);
        initview(view);
        inttlistener(view);
        return view;
    }


    private void initview(View view) {
        textviewset = view.findViewById(R.id.textview_set);
        layoutorder = view.findViewById(R.id.layout_order);

    }


    private void inttlistener(View view) {
        textviewset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SetActivity.class);
                startActivity(intent);
            }
        });
        layoutorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
