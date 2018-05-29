package com.example.android.new_nds_study.m_v_p.view;

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
