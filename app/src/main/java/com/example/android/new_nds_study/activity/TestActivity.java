package com.example.android.new_nds_study.activity;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.fragment.eachfragment.ClassTlakFrament;
import com.example.android.new_nds_study.fragment.eachfragment.EementClassFragment;
import com.example.android.new_nds_study.fragment.eachfragment.LeaguerFragment;

import java.util.ArrayList;
import java.util.List;


public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    int j;
    private TextView tab1;
    private TextView tab2;
    private TextView tab3;
    private ArrayList<TextView> textList;
    private ClassTlakFrament classTlakFrament;
    private List<Fragment> fragList;
    private EementClassFragment eementClassFragment;
    private LeaguerFragment leaguerFragment;
    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initData();
        addTextViewList(tab1);
        addTextViewList(tab2);
        addTextViewList(tab3);
        addFragmentList(classTlakFrament);
        addFragmentList(eementClassFragment);
        addFragmentList(leaguerFragment);
        supportFragmentManager.beginTransaction().hide(eementClassFragment).commit();
        supportFragmentManager.beginTransaction().hide(leaguerFragment).commit();
    }
    public void initData(){
        fragList = new ArrayList<>();
        textList = new ArrayList<>();
    }

    private void initView() {
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        supportFragmentManager = getSupportFragmentManager();
        classTlakFrament = new ClassTlakFrament();
        eementClassFragment = new EementClassFragment();
        leaguerFragment = new LeaguerFragment();
    }

    public void addFragmentList(Fragment fragment){
        fragList.add(fragment);
        supportFragmentManager.beginTransaction().add(R.id.get,fragment).commit();
    }
    public void toggleFrag(int postion,int fragment){
        for (int i = 0; i <textList.size() ; i++) {
           if(postion==i){
               textList.get(postion).setTextColor(Color.BLACK);
           }else{
               textList.get(i).setTextColor(Color.BLUE);
           }
        }
        for (int i = 0; i <fragList.size() ; i++) {
            if (postion == i) {
                supportFragmentManager.beginTransaction().show(fragList.get(fragment)).commit();
            } else {
                supportFragmentManager.beginTransaction().hide(fragList.get(i)).commit();
            }
        }
    }
    public void addTextViewList(TextView tv){
        tv.setOnClickListener(this);
        textList.add(tv);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tab1:
                toggleFrag(0,0);
                break;
            case R.id.tab2:
                toggleFrag(1,1);
                break;
            case R.id.tab3:
                toggleFrag(2,2);
                break;
        }
    }
}
