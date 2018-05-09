package com.example.android.new_nds_study.logion_refister;

import com.example.android.new_nds_study.logion_refister.bean.LoginBean;
import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by android on 2018/4/23.
 */

public interface ServerApi {
    @POST(API.LOGIN)
    Observable<LoginBean> login( @Query("password") String password, @Query("nickname") String nickname);//登录

    @POST(API.REGIST)
    Observable<RegisterBean> regist(@Query("password") String password, @Query("username") String username);//注册



}
