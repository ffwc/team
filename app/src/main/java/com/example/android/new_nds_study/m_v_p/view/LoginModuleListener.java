package com.example.android.new_nds_study.m_v_p.view;

import com.example.android.new_nds_study.m_v_p.bean.LoginBean;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public interface LoginModuleListener {
    void success(LoginBean loginBean);
    void uSuccess(UserinfoBean userinfoBean);
}
