package com.example.android.new_nds_study.MVP.modle;

import com.example.android.new_nds_study.MVP.bean.TabLayoutBean;
import com.example.android.new_nds_study.MVP.view.TabLayoutModuleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class TabLayoutModule {

    public void getData(final TabLayoutModuleListener tabLayoutModuleListener) {
        final Map<String, String> map = new HashMap<>();

        RetrofitManagerAPI.get(API.zixunfenlei, map, new BaseObserver<TabLayoutBean>() {


            @Override
            public void success(TabLayoutBean tabLayoutBean) {
                if (tabLayoutModuleListener != null) {
                    tabLayoutModuleListener.success(tabLayoutBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });
    }
}
