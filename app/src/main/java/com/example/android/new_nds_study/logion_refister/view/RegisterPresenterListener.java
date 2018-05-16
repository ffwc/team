package com.example.android.new_nds_study.logion_refister.view;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public interface RegisterPresenterListener {
    void success(String s);
    void failed(String s);
    void adminEmpty(String s);
    void pwdEmpty(String s);
    void confrim(String s);

}
