package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.m_v_p.bean.EementClassBean;
import com.example.android.new_nds_study.m_v_p.view.EementModelListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2018/6/20.
 */

public class EementClassModel {

    public void getData(String Courses,String limit, String page, final EementModelListener eementModelListener) {
        Map<String, String> map = new HashMap<>();
        String str = API.LEAGERPATH+Courses+"/units/limit/"+limit+"/page/"+ page;
        LogUtil.i("ssss",str);
        if(MyApp.sp.getString("token","")==null){

        }else{
            map.put("token", "25d66c30859f7bc0f241435c85fc5445ce8c4734");
        }

        RetrofitManagerAPI.get(str, map, new BaseObserver<EementClassBean>() {
            @Override
            public void success(EementClassBean eementClassBean) {
                    eementModelListener.success(eementClassBean);
            }
            @Override
            public void failure(int code) {
            }


        });
    }
}
