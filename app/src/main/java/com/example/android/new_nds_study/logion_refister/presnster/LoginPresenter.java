package com.example.android.new_nds_study.logion_refister.presnster;

import android.text.TextUtils;

import com.example.android.new_nds_study.logion_refister.bean.LoginBean;
import com.example.android.new_nds_study.logion_refister.modle.LoginModule;
import com.example.android.new_nds_study.logion_refister.view.LoginModuleListener;
import com.example.android.new_nds_study.logion_refister.view.LoginPresenterListener;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class LoginPresenter {
    LoginPresenterListener loginPresenterListener;
    private final LoginModule loginModule;

    public LoginPresenter(LoginPresenterListener loginPresenterListener) {
        this.loginPresenterListener = loginPresenterListener;
        loginModule = new LoginModule();

    }

    public void getData(String loginid, String password){
        //判断用户名不用为空
        if(TextUtils.isEmpty(loginid)){
            if(loginPresenterListener!=null){
                loginPresenterListener.adminEmpty("用户名不能为空");
                return;
            }
        }
        //判断密码不用为空
        if(TextUtils.isEmpty(password)){
            if(loginPresenterListener!=null){
                loginPresenterListener.adminEmpty("密码不能为空");
                return;
            }
        }
        //调用m层的数据
        loginModule.getData(loginid, password,new LoginModuleListener() {
            @Override
            public void success(LoginBean loginBean) {
                if(loginPresenterListener!=null){

                    loginPresenterListener.success(loginBean.getErrmsg());

                }
            }
        });
    }
    //防止内存泄露
    public void detach(){
        loginPresenterListener=null;
    }

}
