package com.example.android.new_nds_study.m_v_p.modle;

import android.util.Log;
import android.widget.Toast;

import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;
import com.example.android.new_nds_study.m_v_p.view.MyClassModeListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;

import java.util.HashMap;

public class MyClassModle {
    public void getData(final MyClassModeListener myClassModeListener){
        final HashMap<String, String> map = new HashMap<>();
//        map.put("page","1");
        map.put("token","c065f926bfd740be39fc2b34dfe12dc2e7882b09");
        RetrofitManagerAPI.get(API.classlist, map, new BaseObserver<MyCoursesBean>() {
            @Override
            public void success(MyCoursesBean myCoursesBean) {
            Log.e("MyClassModle",""+myCoursesBean);
            if(myClassModeListener!=null){
                myClassModeListener.onSuccess(myCoursesBean);
             }    
            }
            @Override
            public void failure(int code) {

            }
        });


    }
    
}
