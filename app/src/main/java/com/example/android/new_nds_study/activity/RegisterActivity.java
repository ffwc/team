package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.logion_refister.bean.RegisterBean;
import com.example.android.new_nds_study.logion_refister.presnster.RegisterPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by android on 2018/4/17.
 */

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    @BindView(R.id.regist_iv_back)
    ImageView registIvBack;
    @BindView(R.id.regist_ed_name)
    EditText registEdName;
    @BindView(R.id.regist_ed_phone)
    EditText registEdPhone;
    @BindView(R.id.regist_ed_authcode)
    EditText registEdAuthcode;
    @BindView(R.id.regist_ed_pass_ask_for)
    EditText registEdPassAskFor;
    @BindView(R.id.regist_ed_algin_password)
    EditText registEdAlginPassword;
    @BindView(R.id.register_btn_register)
    Button registerBtnRegister;
    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        registerPresenter = new RegisterPresenter(this);
    }

    @OnClick({R.id.regist_iv_back, R.id.register_btn_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.regist_iv_back:
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.register_btn_register:
                String phone = registEdName.getText().toString().trim();
                String pass = registEdPassAskFor.getText().toString().trim();
                registerPresenter.setRegist(phone, pass);
                break;
        }
    }


    public void showRegister(RegisterBean registerBean, int errcode, String errmsg) {
        Log.i(TAG, "showRegister: 开始注册");
        if (errcode == 0) {
            Toast.makeText(this, errmsg, Toast.LENGTH_SHORT).show();
            if (errmsg.equals("ok")) {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        } else {
            Toast.makeText(this, errmsg, Toast.LENGTH_SHORT).show();
        }
    }
}


