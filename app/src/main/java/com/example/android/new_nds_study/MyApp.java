package com.example.android.new_nds_study;

import android.app.Application;
import android.content.SharedPreferences;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by android on 2018/4/19.
 */

public class MyApp extends Application {
    public static SharedPreferences sp;
    public static SharedPreferences.Editor edit;
    private static MyApp mapp;
    @Override
    public void onCreate() {
        super.onCreate();
        sp = getSharedPreferences("user", MODE_PRIVATE);
        edit = sp.edit();
        mapp=this;
        Fresco.initialize(this);
    /*    if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);*/
        // Normal app init code...
        //初始化图片框架
        Fresco.initialize(this);
    }
public static MyApp applicationInstance(){
        return mapp;
}
}
