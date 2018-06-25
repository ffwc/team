package com.example.android.new_nds_study.m_v_p.modle;

import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.m_v_p.bean.RegisterBean;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.view.RegModuleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class RegisterModule {
    public void getData(String nickname,String phone, String password,String note, final RegModuleListener regModuleListener) {
        Map<String, String> map = new HashMap<>();

        map.put("nickname", nickname);
        map.put("password", password);
        map.put("phone", phone);
        map.put("client_id", "ndmooc_ios");
        map.put("validate[phone_code]",note);
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

    public void getNote(String phone , String type , String deviceid , final RegModuleListener RegModuleListener){

        Map<String, String> map = new HashMap<>();

        map.put("type",type);
        map.put("phone",phone);
        map.put("deviceid",deviceid);
        RetrofitManager.post(API.SEND, map, new BaseObserver<UserUpdate>() {
            @Override
            public void success(UserUpdate userUpdate) {
                Toast.makeText(MyApp.applicationInstance(),"发送成功",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(int code) {

            }
        });

    }
}
