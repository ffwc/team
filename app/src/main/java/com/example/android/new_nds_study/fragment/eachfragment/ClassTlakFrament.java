package com.example.android.new_nds_study.fragment.eachfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.EachClassActivity;

/**
 * Created by dell on 2018/6/17.
 */

public class ClassTlakFrament extends Fragment {
    View view;
    private RecyclerView recycle;
    private View learguer;
    private ImageView edit_img;
    private TextView tlak_size;
    private TextView titleText;
    private EachClassActivity eachClassActivity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.classtlak_layout, container, false);

        initview();
        initData();
        return view;
    }

    public void initData() {

    }

    @Override
    public void onPause() {
        super.onPause();
        eachClassActivity.getTabBar().isShowDivider(true);
    }


    @Override
    public void onStart() {
        super.onStart();
        eachClassActivity.getTabBar().isShowDivider(false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        eachClassActivity = null;
    }

    @SuppressLint("WrongViewCast")
    public void initview() {
        eachClassActivity = (EachClassActivity) getActivity();
        learguer = view.findViewById(R.id.leaguer_title);
        recycle = view.findViewById(R.id.tlak_recycle);

        tlak_size = view.findViewById(R.id.tlak_size);
        edit_img = view.findViewById(R.id.tlak_edit);
        edit_img.setBackground(getResources().getDrawable(R.drawable.tlakedit_img));
        edit_img.setColorFilter(R.color.color_yellow);
        titleText = view.findViewById(R.id.leaguer_title);
        titleText.setText("讨论");
    }


}
