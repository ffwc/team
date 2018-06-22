package com.example.android.new_nds_study.m_v_p.presnster;

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
    public void getMyClassPresenter(String page ,String token){
        Observable<MyCoursesBean> observable = apiService.getMyCoures(/*page,*/ token);
        observable.subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Consumer<MyCoursesBean>() {
                     @Override
                     public void accept(MyCoursesBean myCoursesBean) throws Exception {
                         if (myCoursesBean==null){
                        }
                         else {

                         }
                       myClassPresenterListener.onSuccess(myCoursesBean);  
                     }
                 });
    }
    @Override
    public void onSuccess(MyCoursesBean myCoursesBean) {
        
    }
}
