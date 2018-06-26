package com.example.android.new_nds_study.m_v_p.presnster;

import android.util.Log;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.m_v_p.bean.RegisterBean;
import com.example.android.new_nds_study.m_v_p.modle.RegisterModule;
import com.example.android.new_nds_study.m_v_p.view.RegModuleListener;
import com.example.android.new_nds_study.m_v_p.view.RegisterPresenterListener;
import com.example.android.new_nds_study.util.Verification;

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

    public void getData(String nickname, String phone, String note, String password, String toPassword) {
        if (Verification.isNickName(nickname) && Verification.isPhone(phone) && Verification.isNote(note) && Verification.isPassWord(password) && Verification.isPassWordEquality(password, toPassword)) {

            //调用m层的数据
            registerModule.getData(nickname, phone, password,note, new RegModuleListener() {
                @Override
                public void success(RegisterBean registerBean) {
                    if (registerPresenterListener != null) {

                        registerPresenterListener.success(registerBean.getErrmsg());

                    }
                }
            });
        }
    }

    //防止内存泄露
    public void detach() {
        registerPresenterListener = null;
    }


    public void getNote(String phone) {

        if (Verification.isPhone(phone)) {
            MyApp myApp = MyApp.applicationInstance();
           /* TelephonyManager TelephonyMgr = (TelephonyManager) myApp.getSystemService(myApp.TELEPHONY_SERVICE);
            if (ActivityCompat.checkSelfPermission(myApp, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            String szImei = TelephonyMgr.getDeviceId();*/
            Log.e("yjb", "getNote: "+Verification.getMacAddr() );
            registerModule.getNote(phone, "register", Verification.getMacAddr(), new RegModuleListener() {
                @Override
                public void success(RegisterBean registerBean) {
                    registerPresenterListener.register(registerBean.getErrmsg());
                }
            });
        }

    }
}

