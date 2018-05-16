package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.logion_refister.bean.LoginBean;
import com.example.android.new_nds_study.logion_refister.presnster.LoginPresenter;
import com.example.android.new_nds_study.logion_refister.view.LoginModuleListener;
import com.example.android.new_nds_study.logion_refister.view.LoginPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by android on 2018/4/17.
 */

public class LoginActivity extends AppCompatActivity implements LoginPresenterListener, LoginModuleListener {

    @BindView(R.id.login_tv_register)
    TextView loginTvRegister;
    @BindView(R.id.login_account_edittext)
    EditText loginAccountEdittext;
    @BindView(R.id.login_password_edittext)
    EditText loginPasswordEdittext;
    @BindView(R.id.login_btn)
    TextView loginBtn;
    @BindView(R.id.login_forget_password)
    TextView loginForgetPassword;
    //@BindView(R.id.login_wxlogin)
    //ImageView loginWechat;
    private Intent intentq;
    private Intent intentw;
    private LoginPresenter loginPresenter;

    private static final String TAG = "LOGINACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginPresenter = new LoginPresenter(this);
    }

    @OnClick({R.id.login_tv_register, R.id.login_btn, R.id.login_forget_password})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.login_tv_register:
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.login_btn:
                String loginid = loginAccountEdittext.getText().toString().trim();
                String password = loginPasswordEdittext.getText().toString().trim();
                loginPresenter.getData(loginid, password);

                break;

            case R.id.login_forget_password:

                intentw = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(intentw);
                break;
            default:
                break;
        }

    }

    @Override
    public void success(LoginBean loginBean) {
        LoginBean.DataEntity data = loginBean.getData();
        String access_token = data.getAccess_token();
        LogUtil.i(TAG + "access_token", access_token);
        System.out.print(access_token);
    }
    @Override
    public void success(String s) {
        Log.i(TAG, s.toString());
        if (("OK").equals(s)) {
            //Toast.makeText(LoginActivity.this, , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "账号或密码错误请重新输入", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void failed(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void adminEmpty(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void pwdEmpty(String s) {
        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    //销毁防止内存泄露
    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detach();
    }


}

