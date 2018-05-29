package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.TabLayoutBean;
import com.example.android.new_nds_study.m_v_p.modle.TabLayoutModule;
import com.example.android.new_nds_study.m_v_p.view.TabLayoutModuleListener;
import com.example.android.new_nds_study.m_v_p.view.TabLayoutPresenterListener;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class TabLayoutPresenter {
    TabLayoutPresenterListener tabLayoutPresenterListener;
    private final TabLayoutModule tabLayoutModule;

    public TabLayoutPresenter(TabLayoutPresenterListener tabLayoutPresenterListener) {
        this.tabLayoutPresenterListener = tabLayoutPresenterListener;
        tabLayoutModule = new TabLayoutModule();

    }

    public void getData() {

        //调用m层的数据
        tabLayoutModule.getData(new TabLayoutModuleListener() {

            @Override
            public void success(TabLayoutBean tabLayoutBean) {
                if (tabLayoutPresenterListener != null) {


                    tabLayoutPresenterListener.successe(tabLayoutBean);



                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        tabLayoutPresenterListener = null;
    }

}
