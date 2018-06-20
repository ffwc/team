package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.m_v_p.view.UnitModelListener;
import com.example.android.new_nds_study.m_v_p.view.UnitPresenterListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

import static com.example.android.new_nds_study.network.API.LEAGERPATH;
import static com.example.android.new_nds_study.network.API.classlist;

/**
 * Created by dell on 2018/6/19.
 */

public class ClassUnitModel {

    public void getUnitModel(int Courses, int page, Map<String, String> map, final UnitModelListener unitModelListener) {

        String BasePath = LEAGERPATH + Courses + "/users/limit/10/page/" + page;
        RetrofitManagerAPI.get(BasePath, map, new BaseObserver<UnitBean>() {
            @Override
            public void success(UnitBean unitBean) {
                unitModelListener.successe(unitBean);
            }

            @Override
            public void failure(int code) {

            }
        });
    }
}
