package com.example.android.new_nds_study.logion_refister.modle;

import com.example.android.new_nds_study.logion_refister.NetListener;
import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;

/**
 * Created by android on 2018/4/23.
 */

public interface IRegisterModel {
    void getRegister(NetListener<RegisterBean> netListener, String phone, String pass);
}
