package com.example.android.new_nds_study.logion_refister.presnster;

import android.util.Log;

import com.example.android.new_nds_study.activity.RegisterActivity;
import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;
import com.example.android.new_nds_study.logion_refister.modle.IRegisterModel;
import com.example.android.new_nds_study.logion_refister.modle.RegisterModel;
import com.example.android.new_nds_study.logion_refister.NetListener;

import static android.content.ContentValues.TAG;

/**
 * Created by android on 2018/4/23.
 */

public class RegisterPresenter {
    private IRegisterModel iRegisterModel;
    private RegisterActivity iRegisterActivity;

    public RegisterPresenter(RegisterActivity iRegisterActivity) {
        this.iRegisterActivity = iRegisterActivity;
        iRegisterModel = new RegisterModel();
    }
    public void setRegist(String phone,String pass){
        iRegisterModel.getRegister(new NetListener<RegisterBean>() {
            @Override
            public void onSuccess(RegisterBean registerBean) {
                Log.i(TAG, "onSuccess:拿到注册的数据 ");
                int errcode = registerBean.getErrcode();
                String errmsg = registerBean.getErrmsg();
                iRegisterActivity.showRegister(registerBean,errcode,errmsg);
            }

            @Override
            public void onFailure(Exception e) {

            }
        }, phone, pass);
    }
}

