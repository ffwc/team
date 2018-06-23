package com.example.android.new_nds_study.network;

import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public interface ApiService {
    @GET
    Observable<String> get(@Url String url , @QueryMap Map<String,String> map);
//    @GET("/v1/news/app/category/{uid}/newslist/limit/:limit/page/:page")
//    Observable<MessageListBean> getDataBean(@Query ("category_id") int uid);

    @FormUrlEncoded
    @POST
    Observable<String> post(@Url String url, @FieldMap Map<String,String> map);


    @GET("/v1/courses/mine/limit/5/page/{page}")
    Observable<MyCoursesBean> getMyCoures(@Path("page")String page, @Query("token") String token);


    @Multipart
    @POST
    Observable<String> updataAvatar(@Url String url, @PartMap()Map<String, RequestBody> maps, @Part MultipartBody.Part file);

}
