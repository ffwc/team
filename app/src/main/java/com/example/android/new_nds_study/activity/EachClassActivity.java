package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.fragment.eachfragment.EementClassFragment;
import com.hjm.bottomtabbar.BottomTabBar;

public class EachClassActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mEachclassReturn;
    /**
     * title_eachclass
     */
    private TextView mEachclassTitle;
    private ImageView mEachclassCorrelation;
    private RelativeLayout mEachclassHeadLayout;
    private FrameLayout mEachclassContent;
    private BottomTabBar mEachclassTabControl;
    private EementClassFragment eementClassFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_class);
        initView();
        initData();
    }

    private void initView() {
        mEachclassReturn = (ImageView) findViewById(R.id.eachclass_return);
        mEachclassReturn.setOnClickListener(this);
        mEachclassTitle = (TextView) findViewById(R.id.eachclass_title);
        mEachclassTitle.setOnClickListener(this);
        mEachclassCorrelation = (ImageView) findViewById(R.id.eachclass_correlation);
        mEachclassCorrelation.setOnClickListener(this);
        mEachclassHeadLayout = (RelativeLayout) findViewById(R.id.eachclass_head_layout);
        mEachclassHeadLayout.setOnClickListener(this);
        mEachclassContent = (FrameLayout) findViewById(R.id.eachclass_content);
        mEachclassContent.setOnClickListener(this);
        mEachclassTabControl = (BottomTabBar) findViewById(R.id.eachclass_tabControl);
        mEachclassTabControl.setOnClickListener(this);
    }
    private void initData(){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        eementClassFragment = new EementClassFragment();


        fragmentTransaction.add(R.id.eachclass_content,eementClassFragment);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.eachclass_return:
                break;
            case R.id.eachclass_title:
                break;
            case R.id.eachclass_correlation:
                break;
            case R.id.eachclass_head_layout:
                break;
            case R.id.eachclass_content:
                break;
            case R.id.eachclass_tabControl:
                break;
        }
    }
}
