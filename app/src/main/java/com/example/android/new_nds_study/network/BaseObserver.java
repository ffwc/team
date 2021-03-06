package com.example.android.new_nds_study.network;

import android.util.Log;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.SocketException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */


public abstract class BaseObserver<T> implements Observer<String> {


    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(String s) {
        try {
            Type genType = getClass().getGenericSuperclass();
            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
            Class entityClass = (Class) params[0];
            Gson gson = new Gson();
            Log.e("http数据", "onNext: "+s);
             T t = (T)gson.fromJson(s,entityClass);
            success(t);

        } catch (Exception e) {
            failure(1001);
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable e) {
        try {
            if(e != null){
                if(e instanceof HttpException){
                    failure(HTTP_ERROR);
                } else if(e instanceof SocketException){
                    failure(NET_WORK_ERROR);
                }else {
                    failure(UNKNOW_ERROR);
                }
            }else {
                failure(UNKNOW_ERROR);
            }
            e.printStackTrace() ;
        } catch (Exception e1) {
            failure(UNKNOW_ERROR);
            e1.printStackTrace();
        }


    }

    @Override
    public void onComplete() {

    }


    //

    /**
     * code
     *  1000 UNKNOW_ERROR 未知错误
     *  1001 json 转化异常  parse error
     *  1002 当前网络不可用     java.net.SocketException: Network is unreachable  超时
     *  1003 服务器不可用 401 402 403 500 502 503 504
     * @param code
     */

    public static final int UNKNOW_ERROR = 1000;
    public static final int JSON_FORMAT_ERROR = 1001;
    public static final int NET_WORK_ERROR = 1002;
    public static final int HTTP_ERROR = 1003;


    public abstract void success(T t);
    public abstract void failure(int code);
}
