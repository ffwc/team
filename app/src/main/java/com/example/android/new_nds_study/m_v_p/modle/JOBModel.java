package com.example.android.new_nds_study.m_v_p.modle;

import android.content.Context;
import android.util.Log;
import android.widget.ScrollView;

import com.example.android.new_nds_study.m_v_p.bean.StudentBean;
import com.example.android.new_nds_study.m_v_p.view.JOBModelLisnner;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.ApiService;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Arrays;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

/**
 * Created by dell on 2018/6/24.
 */

public class JOBModel {
    private Response response;

    public void getData(String Courses, final JOBModelLisnner jobModelLisnner) {
        String path = "https://api.ndmooc.com/v1/ngx/canvas/courses/121/assignments";
        final String encoding = "25d66c30859f7bc0f241435c85fc5445ce8c4734";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.ndmooc.com/v1/ngx/canvas/courses/121/assignments")
                .get()
                .addHeader("Authorization", "Bearer 25d66c30859f7bc0f241435c85fc5445ce8c4734")
                .build();
        try {
            response = client.newCall(request).execute();
            String string = response.body().string();
            Log.i("aa", "getData: " + string);
            Gson gson = new Gson();
            final StudentBean[] studentBean = gson.fromJson(string, StudentBean[].class);
            jobModelLisnner.Sucess(studentBean);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
