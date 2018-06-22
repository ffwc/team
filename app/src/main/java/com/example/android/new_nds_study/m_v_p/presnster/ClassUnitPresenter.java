package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.m_v_p.modle.ClassUnitModel;
import com.example.android.new_nds_study.m_v_p.view.UnitModelListener;
import com.example.android.new_nds_study.m_v_p.view.UnitPresenterListener;

import java.util.HashMap;

/**
 * Created by dell on 2018/6/19.
 */

public class ClassUnitPresenter {
    UnitPresenterListener unitPresenterListener;
    ClassUnitModel unitModel;

    public ClassUnitPresenter(UnitPresenterListener unitPresenterListener) {
        this.unitPresenterListener = unitPresenterListener;
        this.unitModel = new ClassUnitModel();
    }
    public void getData(int Courses, final int page, String token){
        HashMap<String, String> map = new HashMap<>();
        //上拉加载，下拉刷新需要的page
//取出Shareprence里面的token
//map.put("token", MyApp.sp.getString("login_token",""));
        map.put("token",token);
           unitModel.getUnitModel(Courses,page,map, new UnitModelListener() {
               @Override
               public void successe(UnitBean unitBean) {
                   unitPresenterListener.successe(unitBean,page);
               }
           });
    }
    public void Dech(){
        unitPresenterListener=null;

    }
}
