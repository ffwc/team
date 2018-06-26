package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.StudentBean;
import com.example.android.new_nds_study.m_v_p.modle.JOBModel;
import com.example.android.new_nds_study.m_v_p.view.JOBModelLisnner;
import com.example.android.new_nds_study.m_v_p.view.JOBPresenterLisnner;

/**
 * Created by dell on 2018/6/24.
 */

public class JOBPresenter {
    private JOBModel jobModel;
    private JOBPresenterLisnner jobPresenterLisnner;

    public JOBPresenter(JOBPresenterLisnner jobPresenterLisnner) {
        this.jobModel = new JOBModel();
        this.jobPresenterLisnner = jobPresenterLisnner;
    }

    public void getData(String courses,String token) {
        jobModel.getData(courses,token, new JOBModelLisnner() {
            @Override
            public void Sucess(StudentBean[] jobBean) {
                jobPresenterLisnner.Sucess(jobBean);
            }
        });
    }
}
