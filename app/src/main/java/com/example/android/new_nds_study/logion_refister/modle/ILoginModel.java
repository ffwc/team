package com.example.android.new_nds_study.logion_refister.modle;

import com.example.android.new_nds_study.logion_refister.NetListener;
import com.example.android.new_nds_study.logion_refister.bean.LoginBean;

/**
 * Created by android on 2018/4/23.
 */

public interface ILoginModel {
    public void getLogin(final NetListener<LoginBean> onNetListener, String password, String nickname);
}
