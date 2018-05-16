package com.example.android.new_nds_study.logion_refister.view;

import com.example.android.new_nds_study.logion_refister.bean.LoginBean;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public interface LoginPresenterListener {
    void success(String s);
    void failed(String s);
    void adminEmpty(String s);
    void pwdEmpty(String s);
}
