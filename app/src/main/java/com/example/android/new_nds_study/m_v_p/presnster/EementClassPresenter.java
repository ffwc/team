package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.EementClassBean;
import com.example.android.new_nds_study.m_v_p.modle.EementClassModel;
import com.example.android.new_nds_study.m_v_p.view.EementModelListener;
import com.example.android.new_nds_study.m_v_p.view.EementPresenterListener;

/**
 * Created by dell on 2018/6/20.
 */

public class EementClassPresenter {
    private EementPresenterListener eementPresenterListener;
    private EementClassModel eementClassModel;

    public EementClassPresenter(EementPresenterListener eementPresenterListener) {
        this.eementPresenterListener = eementPresenterListener;
        this.eementClassModel = new EementClassModel();
    }

    public void getData(String Courses, String page) {

        eementClassModel.getData(Courses, page, new EementModelListener() {
            @Override
            public void success(EementClassBean eementClassBean) {
                eementPresenterListener.scuess(eementClassBean);
            }
        });
    }
}
