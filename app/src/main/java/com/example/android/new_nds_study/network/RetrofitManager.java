package com.example.android.new_nds_study.network;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class RetrofitManager {
    public static OkHttpClient client = new OkHttpClient.Builder()
            .build();


    public static ApiService apiService = new Retrofit.Builder()
            .baseUrl(API.baseurl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(client)
            .build()
            .create(ApiService.class);


    public static void get(String url, Map<String,String> map, Observer observer){

        apiService.get(url,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }


    public static void post(String url,Map<String,String> map,Observer observer){
        apiService.post(url,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public static void updataAvatar(String url, Map<String, RequestBody> map, MultipartBody.Part file, Observer observer){



        apiService.updataAvatar(url,map,file)

                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
