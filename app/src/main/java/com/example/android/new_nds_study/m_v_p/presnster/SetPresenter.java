package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.ProvinceandCity;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.modle.SetModle;
import com.example.android.new_nds_study.m_v_p.view.SetModleListener;
import com.example.android.new_nds_study.m_v_p.view.SetPresenterListenner;

import java.io.File;

public class SetPresenter {

    private final SetPresenterListenner setPresenterListenner;
    private final SetModle setModle;

    public SetPresenter(SetPresenterListenner setPresenterListenner) {

        this.setPresenterListenner = setPresenterListenner;
        setModle = new SetModle();
    }

    public void getUserInfo(String token){


        setModle.getData(token, new SetModleListener() {
            @Override
            public void success(UserinfoBean userinfoBean) {
                setPresenterListenner.onUser(userinfoBean);

            }

            @Override
            public void accountUpdata(UserUpdate userUpdate) {

            }

            @Override
            public void district(ProvinceandCity provinceandCity) {

            }
        });

    }

    public void getAccountUpdata(String token , String parameter, String type, String uid, String oid){
        setModle.accountUpdata(token, parameter, type, uid, oid, new SetModleListener() {
            @Override
            public void success(UserinfoBean userinfoBean) {


            }

            @Override
            public void accountUpdata(UserUpdate userUpdate) {
                setPresenterListenner.accountUpdata(userUpdate);


            }

            @Override
            public void district(ProvinceandCity provinceandCity) {

            }
        });

    }
    public void getDistrict(){

        setModle.district(new SetModleListener() {
            @Override
            public void success(UserinfoBean userinfoBean) {

            }

            @Override
            public void accountUpdata(UserUpdate userUpdate) {

            }

            @Override
            public void district(ProvinceandCity provinceandCity) {
                setPresenterListenner.district(provinceandCity);
            }
        });
    }
    public void setAvatar(String token , File parameter, String type, String uid, String oid){

        setModle.updataAvatar(token, parameter, type, uid, oid, new SetModleListener() {
            @Override
            public void success(UserinfoBean userinfoBean) {

            }

            @Override
            public void accountUpdata(UserUpdate userUpdate) {
                setPresenterListenner.accountUpdata(userUpdate);
            }

            @Override
            public void district(ProvinceandCity provinceandCity) {

            }
        });


    }
}
