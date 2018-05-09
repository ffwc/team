package com.example.android.new_nds_study.logion_refister.presnster;

import com.example.android.new_nds_study.activity.LoginActivity;
import com.example.android.new_nds_study.logion_refister.bean.LoginBean;
import com.example.android.new_nds_study.logion_refister.modle.LoginModel;
import com.example.android.new_nds_study.logion_refister.NetListener;

/**
 * Created by android on 2018/4/23.
 */


public class LoginPresenter {
    private LoginActivity iLoginActivity;
    private LoginModel iLoginModel;

    public LoginPresenter(LoginActivity iLoginActivity) {
        this.iLoginActivity = iLoginActivity;
        iLoginModel = new LoginModel();
    }

    public void setLogin(String Loginid, String password) {
        iLoginModel.getLogin(new NetListener<LoginBean>() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                String errmsg = loginBean.getErrmsg();
                int errcode = loginBean.getErrcode();
                iLoginActivity.showLogin(loginBean,errcode, errmsg);
            }

            @Override
            public void onFailure(Exception e) {

            }
        }, Loginid, password);
    }
}

