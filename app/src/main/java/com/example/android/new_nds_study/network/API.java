package com.example.android.new_nds_study.network;

/**
 * Created by android on 2018/4/23.
 */

public class API {

    public static final String baseurl = "https://account.ndmooc.com";
    public static final String baseurlAPI = "https://api.ndmooc.com";
    public static final String LOGIN = "/v1/users/login";
    public static final String REGIST = "/v1/users/add";
    public static final String zixunfenlei = "/v1/news/app/category";
    public static final String zixunliebiao = "/v1/news/app/category/:category_id/newslist/limit/:limit/page/:page";
    public static final String zixunxiangqing = "/v1/news/app/newsdetail/:news_id";
}
