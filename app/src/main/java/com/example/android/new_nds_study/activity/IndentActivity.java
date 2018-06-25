package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.androidkun.xtablayout.XTabLayout;
import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.IntdentAdapter;
import com.example.android.new_nds_study.fragment.indentFragment.AccomplishFragment;
import com.example.android.new_nds_study.fragment.indentFragment.AllintdentFragment;
import com.example.android.new_nds_study.fragment.indentFragment.ArrearageFragment;
import com.example.android.new_nds_study.fragment.indentFragment.CancelFragment;

import java.util.ArrayList;

public class IndentActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIndentBack;
    /**
     * 我的订单
     */
    private TextView mIndentMyindent;
    private XTabLayout mIndentTab;
    private ViewPager mIndentViewpager;
    private AccomplishFragment accomplishFragment;
    private AllintdentFragment allintdentFragment;
    private ArrearageFragment arrearageFragment;
    private CancelFragment cancelFragment;
    private ArrayList<Fragment> fragments;
    private IntdentAdapter intdentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indent);
        initView();
        initData();

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
        mIndentTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case 0:
                        mIndentViewpager.setCurrentItem(0, true);
                        break;
                    case 1:
                        mIndentViewpager.setCurrentItem(1, true);
                        break;
                    case 2:
                        mIndentViewpager.setCurrentItem(2, true);
                        break;
                    case 3:
                        mIndentViewpager.setCurrentItem(3, true);
                        break;
                    default:
                        break;
                }
            }
        });
        accomplishFragment = new AccomplishFragment();
        allintdentFragment = new AllintdentFragment();
        arrearageFragment = new ArrearageFragment();
        cancelFragment = new CancelFragment();
        fragments = new ArrayList<>();
        fragments.add(accomplishFragment);
        fragments.add(allintdentFragment);
        fragments.add(arrearageFragment);
        fragments.add(cancelFragment);
        intdentAdapter = new IntdentAdapter(getSupportFragmentManager());
        intdentAdapter.setList(fragments);
        mIndentViewpager.setAdapter(intdentAdapter);
        mIndentTab.setupWithViewPager(mIndentViewpager);
        mIndentTab.getTabAt(0).setText("全部");
        mIndentTab.getTabAt(1).setText("待付款");
        mIndentTab.getTabAt(2).setText("已完成");
        mIndentTab.getTabAt(3).setText("已取消");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MyApp.applicationInstance(),"暂未开发",Toast.LENGTH_SHORT).show();
    }
}
