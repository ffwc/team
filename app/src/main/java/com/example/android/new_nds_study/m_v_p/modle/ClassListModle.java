package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.view.ClassModleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;
import com.example.android.new_nds_study.util.LogUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @Author J & J
 * @Time 2018/6/5.
 */

public class ClassListModle {
    public void getData(final ClassModleListener classModleListener) {
        final Map<String, String> map = new HashMap<>();
        String zixunliebiao = "/v1/courses/limit/20/page/1";

        RetrofitManagerAPI.get(API.classlist, map, new BaseObserver<ClassListBean>() {
            @Override
            public void success(ClassListBean classListBean) {
                if (classModleListener != null) {

                    classModleListener.success(classListBean);
                     LogUtil.i("classlist22222","数据请求成功");
                }
            }
            @Override
            public void failure(int code) {

            }
        });

    }

}
