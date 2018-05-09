package com.example.android.new_nds_study.retrofit;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by android on 2018/4/24.
 */

public interface ApiService {
    public static final String Base_URL = "https://account.ndmooc.com";
    /**
     *普通写法
     */
    @GET("service/getIpInfo.php/")
    Observable<ResponseBody> getData(@Query("ip") String ip);

    @GET("{url}")
    Observable<ResponseBody> executeGet(
            @Path("url") String url,
            Map headers, @QueryMap Map<String, String> maps);


    @POST("{url}")
    Observable<ResponseBody> executePost(
            @Path("url") String url,
            @QueryMap Map<String, String> maps, Map parameters);

//    @Multipart
//    @POST("{url}")
//    Observable<ResponseBody> upLoadFile(
//            @Path("url") String url,
//            @Part("image\\\\"; filename=\\"image.jpg") RequestBody avatar);


    @POST("{url}")
    Observable<ResponseBody> uploadFiles(
            @Path("url") String url,
            @Path("headers") Map<String, String> headers,
            @Part("filename") String description,
            @PartMap()  Map<String, RequestBody> maps);

    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);

}
