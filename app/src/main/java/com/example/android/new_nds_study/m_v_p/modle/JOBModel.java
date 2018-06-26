package com.example.android.new_nds_study.m_v_p.modle;

import android.util.Log;

import com.example.android.new_nds_study.m_v_p.bean.StudentBean;
import com.example.android.new_nds_study.m_v_p.view.JOBModelLisnner;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by dell on 2018/6/24.
 */

public class JOBModel {
    private Response response;

    public void getData(String courses,String token, final JOBModelLisnner jobModelLisnner) {
        String path = "https://api.ndmooc.com/v1/ngx/canvas/courses/"+courses+"/assignments";
//      String encoding = "25d66c30859f7bc0f241435c85fc5445ce8c4734";
      String encoding = "Bearer "+token;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(path)
                .get()
                .addHeader("Authorization", encoding)
                .build();
        try {
            response = client.newCall(request).execute();
            String string = response.body().string();
            Log.i("aa", "getData: " + string);
            Gson gson = new Gson();
            StudentBean[] studentBean = gson.fromJson(string, StudentBean[].class);
            jobModelLisnner.Sucess(studentBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
