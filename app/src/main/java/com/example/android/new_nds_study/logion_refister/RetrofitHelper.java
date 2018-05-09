package com.example.android.new_nds_study.logion_refister;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by android on 2018/4/23.
 */

public class RetrofitHelper {
    private static OkHttpClient client;
    private static ServerApi serverApi;

    static {
        getClient();
    }

    public static OkHttpClient getClient() {
        if (client == null) {
            synchronized (OkHttpClient.class) {
                if (client == null) {
                    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                    logging.getLevel();
                    client = new OkHttpClient.Builder()
                            .addInterceptor(logging)
                            .build();
                }
            }
        }
        return client;
    }

    public static ServerApi getServerApi() {
        if (serverApi == null) {
            synchronized (ServerApi.class) {
                if (serverApi == null) {
                    serverApi = onCreate(ServerApi.class, API.baseurl);
                }
            }
        }
        return serverApi;
    }

    public static <T> T onCreate(Class<T> tClass, String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(tClass);
    }

}