package com.example.android.new_nds_study.m_v_p.presnster;

import android.util.Log;

import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;
import com.example.android.new_nds_study.m_v_p.view.MyClassPresenterListener;
import com.example.android.new_nds_study.network.ApiService;
import com.example.android.new_nds_study.util.RetrofitUtils;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MyClassPresenter implements MyClassPresenterListener {
    private MyClassPresenterListener myClassPresenterListener;
    private final ApiService apiService;

    public  MyClassPresenter(MyClassPresenterListener myClassPresenterListener){
        this.myClassPresenterListener=myClassPresenterListener;
        apiService = RetrofitUtils.apiService;
    }
    public void getMyClassPresenter(final String page , String token){
        Observable<MyCoursesBean> observable = apiService.getMyCoures(page, token);
        observable.subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Consumer<MyCoursesBean>() {
                     @Override
                     public void accept(MyCoursesBean myCoursesBean) throws Exception {
                         Log.e("MyClassPresenter", "判断"+myCoursesBean);
                         if (myCoursesBean==null){
                         Log.e("MyClassPresenter", "accept: "+"null");
                         } else {
                             if (myCoursesBean.getErrmsg().equals("OK")){
                                 Log.e("MyClassPresenter", "accept: "+true+myCoursesBean.getData().getList().get(0).getUnit().toString());
                                 myClassPresenterListener.onSuccess(myCoursesBean,page);
                             }
                         }
                     }
                 });
    }

    @Override
    public void onSuccess(MyCoursesBean myCoursesBean, String flag) {

    }

    //防止内存泄露
    public void detach() {
        myClassPresenterListener = null;
    }
}
