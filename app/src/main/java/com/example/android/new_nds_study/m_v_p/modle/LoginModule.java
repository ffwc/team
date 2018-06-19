package com.example.android.new_nds_study.m_v_p.modle;

import android.util.Log;

import com.example.android.new_nds_study.m_v_p.bean.LoginBean;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.view.LoginModuleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class LoginModule {

    public void getData(String loginid, String password, final LoginModuleListener loginListener) {
        final Map<String, String> map = new HashMap<>();
        map.put("loginid", loginid);
        map.put("password", password);
        map.put("client_id", "ndmooc_ios");
        map.put("response_type", "token");

        Log.i("map集合的长度", map.size() + "");
        RetrofitManager.post(API.LOGIN, map, new BaseObserver<LoginBean>() {
            @Override
            public void success(LoginBean loginBean) {

                if (loginListener != null) {
                    loginListener.success(loginBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });

    }
    public void getInfo(String token, final LoginModuleListener loginModuleListener){

        String url = "/v1/oauth2/userinfo?token="+token;

        HashMap<String, String> map = new HashMap<>();

        RetrofitManager.get(url, map, new BaseObserver<UserinfoBean>() {
            @Override
            public void success(UserinfoBean userinfoBean) {
                loginModuleListener.uSuccess(userinfoBean);

            }

            @Override
            public void failure(int code) {

            }
        });


    }
}
