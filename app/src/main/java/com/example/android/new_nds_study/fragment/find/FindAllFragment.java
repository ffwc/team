package com.example.android.new_nds_study.fragment.find;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;


/**
 * Created by android on 2018/4/17.
 */

public class FindAllFragment extends Fragment{

    private View view;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.find_all_fragment, container, false);
        intiview(view);
        return  view;
    }

    private void intiview(View view) {
        recyclerView = view.findViewById(R.id.find_recyclerview);


    }
}
