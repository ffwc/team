package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.bean.OpenClassBean;
import com.example.android.new_nds_study.m_v_p.view.ClassModleListener;
import com.example.android.new_nds_study.m_v_p.view.OpenClassModleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/6/5.
 */

public class OpenClassModle {
    public static void getData(final OpenClassModleListener openClassModleListener) {
        final Map<String, String> map = new HashMap<>();
        RetrofitManagerAPI.get(API.openclass, map, new BaseObserver<OpenClassBean>() {


            @Override
            public void success(OpenClassBean openClassBean) {
                if (openClassBean != null) {

                    openClassModleListener.success(openClassBean);
                     LogUtil.i("classlist22222","数据请求成功");
                }
            }

            @Override
            public void failure(int code) {

            }
        });
    }
}
