package com.example.android.new_nds_study.MVP.presnster;

import android.util.Log;

import com.example.android.new_nds_study.MVP.bean.LoginBean;
import com.example.android.new_nds_study.MVP.bean.TabLayoutBean;
import com.example.android.new_nds_study.MVP.modle.LoginModule;
import com.example.android.new_nds_study.MVP.modle.TabLayoutModule;
import com.example.android.new_nds_study.MVP.view.LoginModuleListener;
import com.example.android.new_nds_study.MVP.view.LoginPresenterListener;
import com.example.android.new_nds_study.MVP.view.TabLayoutModuleListener;
import com.example.android.new_nds_study.MVP.view.TabLayoutPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

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

                    tabLayoutPresenterListener.success(tabLayoutBean.getErrmsg());

                    LogUtil.i("----------",tabLayoutBean.getErrmsg());

                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        tabLayoutPresenterListener = null;
    }

}
