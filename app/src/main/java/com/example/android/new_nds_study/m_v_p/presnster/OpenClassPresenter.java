package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.bean.OpenClassBean;
import com.example.android.new_nds_study.m_v_p.modle.OpenClassModle;
import com.example.android.new_nds_study.m_v_p.view.OpenClassModleListener;
import com.example.android.new_nds_study.m_v_p.view.OpenClassPreserentListener;

/**
 * @Author J & J
 * @Time 2018/6/5.
 */

public class OpenClassPresenter {
    OpenClassPreserentListener openClassPreserentListener;
    private final OpenClassModle openClassModle;

    public OpenClassPresenter(OpenClassPreserentListener openClassPreserentListener) {
        this.openClassPreserentListener = openClassPreserentListener;
        openClassModle = new OpenClassModle();

    }

    public void getData() {

        //调用m层的数据
        OpenClassModle.getData(new OpenClassModleListener() {


            @Override
            public void success(OpenClassBean openClassBean) {
                if (openClassPreserentListener != null) {
                    openClassPreserentListener.success(openClassBean);

                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        openClassPreserentListener = null;
    }

}
