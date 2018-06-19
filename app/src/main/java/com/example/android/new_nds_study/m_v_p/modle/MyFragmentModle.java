package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.OpenUser;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentModuleListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;

import java.util.HashMap;

public class MyFragmentModle {

    public void getData(String uid, final MyFragmentModuleListener myFragmentModuleListener){
        HashMap<String, String> map = new HashMap<>();
        final String url = " /v1/users/publicinfo?uid="+uid;
        RetrofitManager.get(url, map, new BaseObserver<OpenUser>() {
            @Override
            public void success(OpenUser openUser) {
                if (myFragmentModuleListener!=null){
                    myFragmentModuleListener.success(openUser);
                }
            }

            @Override
            public void failure(int code) {

            }
        });


    }
}
