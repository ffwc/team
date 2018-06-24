package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetPasswordActivity extends AppCompatActivity {

    @BindView(R.id.forget_login)
    TextView forgetLogin;
    @BindView(R.id.forget_next)
    Button forgetNext;
    @BindView(R.id.forget_tv_getauthcode)
    TextView forgetTvGetauthcode;
    @BindView(R.id.forget_ed_phone)
    EditText forgetEdPhone;
    @BindView(R.id.forget_ed_authcode)
    EditText forgetEdAuthcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        ButterKnife.bind(this);
        MyApp.setTitFlag(this);
    }

    @OnClick({R.id.forget_login, R.id.forget_tv_getauthcode, R.id.forget_next})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.forget_login:

                Intent intent = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
                break;

            case R.id.forget_tv_getauthcode:

                Log.i("forgetpassword", "点击了获取验证码 ");
                break;
            case R.id.forget_next:
                break;
                default:
                    break;
        }
    }


}

