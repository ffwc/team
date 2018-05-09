package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.logion_refister.bean.LoginBean;
import com.example.android.new_nds_study.logion_refister.presnster.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by android on 2018/4/17.
 */

public class LoginActivity extends AppCompatActivity{

    private static final String TAG = "LoginActivity";
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
    @BindView(R.id.login_logo)
    ImageView loginLogo;
    //@BindView(R.id.login_wxlogin)
    //ImageView loginWechat;
    private Intent intentq;
    private Intent intentw;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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

                Log.i(TAG, "onClick: 登录成功");
                String account = loginAccountEdittext.getText().toString().trim();
                String pass = loginPasswordEdittext.getText().toString().trim();
                loginPresenter.setLogin(account, pass);
                LoginBean loginBean = new LoginBean();
                int errcode = loginBean.getErrcode();
                if (errcode == 0) {
                    intentq = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intentq);
                    finish();
                } else {
                    Toast.makeText(this, "请重新输入", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.login_forget_password:

                intentw = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(intentw);
                break;

        }

    }

    public void showLogin(LoginBean loginBean, int errcode, String errmsg) {
        if (errcode == 0) {
            Toast.makeText(this, errmsg, Toast.LENGTH_SHORT).show();
            LoginBean.DataEntity data = loginBean.getData();
            String access_token = data.getAccess_token();
            int expires_in = data.getExpires_in();
            String refresh_token = data.getRefresh_token();
            String scope = data.getScope();
            String token_type = data.getToken_type();
            MyApp.edit.putString("access_token", access_token);
            MyApp.edit.putString("refresh_token", refresh_token);
            MyApp.edit.putInt("expires_in", expires_in);
            MyApp.edit.putString("scope", scope);
            MyApp.edit.putString("token_type", token_type);
            MyApp.edit.commit();
            MyApp.edit.putBoolean("flag", true);

        } else {
            Log.i(TAG, "showLogin: 输入有误请重新输入");
        }
    }
}

