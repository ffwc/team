package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;
import com.example.android.new_nds_study.m_v_p.bean.RegisterBean;
import com.example.android.new_nds_study.m_v_p.view.RegModuleListener;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class RegisterModule {
    public void getData(String nickname, String password, final RegModuleListener regModuleListener) {
        Map<String, String> map = new HashMap<>();

        map.put("nickname", nickname);
        map.put("password", password);
        map.put("username", nickname);
        map.put("client_id", "ndmooc_ios");
        RetrofitManager.post(API.REGIST, map, new BaseObserver<RegisterBean>() {
            @Override
            public void success(RegisterBean registerBean) {
                if (regModuleListener != null) {
                    regModuleListener.success(registerBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });

    }
}
