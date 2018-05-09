package com.example.android.new_nds_study.logion_refister.modle;

import com.example.android.new_nds_study.logion_refister.NetListener;
import com.example.android.new_nds_study.logion_refister.RetrofitHelper;
import com.example.android.new_nds_study.logion_refister.ServerApi;
import com.example.android.new_nds_study.logion_refister.bean.LoginBean;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by android on 2018/4/23.
 */

    public class LoginModel implements ILoginModel{
    @Override
    public void getLogin(final NetListener<LoginBean> onNetListener, String password, String nickname) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.login(nickname,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<LoginBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        onNetListener.onFailure((Exception) e);
                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        onNetListener.onSuccess(loginBean);
                    }
                });
    }

    }

