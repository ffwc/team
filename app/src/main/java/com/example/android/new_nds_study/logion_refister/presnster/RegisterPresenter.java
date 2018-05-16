package com.example.android.new_nds_study.logion_refister.presnster;

import android.text.TextUtils;

import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;
import com.example.android.new_nds_study.logion_refister.modle.RegisterModule;
import com.example.android.new_nds_study.logion_refister.view.RegModuleListener;
import com.example.android.new_nds_study.logion_refister.view.RegisterPresenterListener;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class RegisterPresenter {
    RegisterPresenterListener registerPresenterListener;
    private final RegisterModule registerModule;


    public RegisterPresenter(RegisterPresenterListener registerPresenterListener) {
        this.registerPresenterListener = registerPresenterListener;
        registerModule = new RegisterModule();
    }

    public void getData(String nickname, String password, String mpwd) {
        //判断用户名不用为空
        if (TextUtils.isEmpty(nickname)) {
            if (registerPresenterListener != null) {
                registerPresenterListener.adminEmpty("用户名不能为空");
                return;
            }
        }
        //判断密码不用为空
        if (TextUtils.isEmpty(password)) {
            if (registerPresenterListener != null) {
                registerPresenterListener.pwdEmpty("密码不能为空");
                return;
            }
            //判断二次输入密码
            if (TextUtils.isEmpty(mpwd)) {
                if (registerPresenterListener != null) {
                    registerPresenterListener.confrim("请再次输入密码");
                    return;
                }
                if (!mpwd.equals(password)) {
                    if (registerPresenterListener != null) {
                        registerPresenterListener.confrim("两次密码不一样");
                        return;
                    }
                }
            }

        }
        //调用m层的数据
        registerModule.getData(nickname, password, new RegModuleListener() {
            @Override
            public void success(RegisterBean registerBean) {
                if (registerPresenterListener != null) {

                    registerPresenterListener.success(registerBean.getErrmsg());

                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        registerPresenterListener = null;
    }


}

