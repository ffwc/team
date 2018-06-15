package com.example.android.new_nds_study.fragment.classfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;


/**
 * Created by android on 2018/4/17.
 */

public class MyclassFragment extends Fragment{

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myclassfragment, container, false);
        return view;
    }
}
