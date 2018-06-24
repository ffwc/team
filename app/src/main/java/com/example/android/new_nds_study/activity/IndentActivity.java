package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.example.android.new_nds_study.R;

public class IndentActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIndentBack;
    /**
     * 我的订单
     */
    private TextView mIndentMyindent;
    private XTabLayout mIndentTab;
    private ViewPager mIndentViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indent);
        initView();


    }

    private void initView() {
        mIndentBack = (ImageView) findViewById(R.id.indent_back);
        mIndentBack.setOnClickListener(this);
        mIndentMyindent = (TextView) findViewById(R.id.indent_myindent);
        mIndentMyindent.setOnClickListener(this);
        mIndentTab = (XTabLayout) findViewById(R.id.indent_tab);
        mIndentTab.setOnClickListener(this);
        mIndentViewpager = (ViewPager) findViewById(R.id.indent_viewpager);
        mIndentViewpager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.indent_back:
                finish();
                break;
            case R.id.indent_myindent:

                break;
            case R.id.indent_tab:

                break;
            case R.id.indent_viewpager:
                break;
        }
    }
    public void initData(){


    }
}
