package com.example.android.new_nds_study.util;

import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.ApiService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    private RetrofitUtils retrofitUtils;
    public static ApiService apiService;
    //单例模式
    public  RetrofitUtils getInstace(){
        if(retrofitUtils==null){
            retrofitUtils = new RetrofitUtils();
        }
        return retrofitUtils;
    }
    static {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(API.baseurlAPI)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }
}
