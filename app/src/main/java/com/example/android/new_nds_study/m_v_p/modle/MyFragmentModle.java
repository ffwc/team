package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentModuleListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;

import java.util.HashMap;

public class MyFragmentModle {

    public void getData(String token, final MyFragmentModuleListener myFragmentModuleListener){
        HashMap<String, String> map = new HashMap<>();
        final String url = "/v1/oauth2/userinfo?token="+token;
        RetrofitManager.get(url, map, new BaseObserver<UserinfoBean>() {
            @Override
            public void success(UserinfoBean userinfoBean) {
                if (myFragmentModuleListener!=null){
                    myFragmentModuleListener.success(userinfoBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });


    }
}
