package com.example.android.new_nds_study.logion_refister.modle;

import com.example.android.new_nds_study.logion_refister.NetListener;
import com.example.android.new_nds_study.logion_refister.RetrofitHelper;
import com.example.android.new_nds_study.logion_refister.ServerApi;
import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by android on 2018/4/23.
 */
public class RegisterModel implements IRegisterModel {
    @Override
    public void getRegister(final NetListener<RegisterBean> netListener, String phone, String pass) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.regist(phone,pass)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<RegisterBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        netListener.onFailure((Exception) e);
                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {
                        netListener.onSuccess(registerBean);
                    }
                });
    }

}
