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

import static android.content.ContentValues.TAG;

/**
 * Created by dell on 2018/6/20.
 */

public class EementClassModel {

    public void getData(String Courses,String limit, String page, final EementModelListener eementModelListener) {
        Map<String, String> map = new HashMap<>();
        String str = API.LEAGERPATH+Courses+"/units/limit/"+limit+"/page/"+ page;
        LogUtil.i("ssss",str);
        map.put("token", "c065f926bfd740be39fc2b34dfe12dc2e7882b09");
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
