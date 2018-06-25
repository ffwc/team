package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.presnster.RegisterPresenter;
import com.example.android.new_nds_study.m_v_p.view.RegisterPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by android on 2018/4/17.
 */

public class RegisterActivity extends AppCompatActivity implements RegisterPresenterListener {
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
    EditText registEdPass;
    @BindView(R.id.regist_ed_algin_password)
    EditText registEdAlginPassword;
    @BindView(R.id.register_btn_register)
    Button registerBtnRegister;
    @BindView(R.id.regist_ed_note)
    TextView mRegistEdNote;
    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        MyApp.setTitFlag(this);
        registerPresenter = new RegisterPresenter(this);


    }

    @OnClick({R.id.regist_iv_back, R.id.register_btn_register, R.id.regist_ed_note})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.regist_iv_back:
                finish();
                break;
            case R.id.register_btn_register:
                String nickname = registEdName.getText().toString().trim();
                String password = registEdPass.getText().toString().trim();
                String phone = registEdPhone.getText().toString().trim();
                String note = registEdAuthcode.getText().toString().trim();
                String registEdAlginPassword = this.registEdAlginPassword.getText().toString().trim();


                registerPresenter.getData(nickname, phone, note, password, registEdAlginPassword);
                break;

            case R.id.regist_ed_note:

                String phonec = registEdPhone.getText().toString().trim();

                registerPresenter.getNote(phonec);

                break;
            default:
                break;
        }
    }


    //返回的数据安这也
    @Override
    public void success(String s) {
        LogUtil.i(TAG, s);
        if (("OK").equals(s)) {
            Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void failed(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void adminEmpty(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void pwdEmpty(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }


    @Override
    public void confrim(String s) {
        Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void register(String s) {
        Toast.makeText(MyApp.applicationInstance(),s,Toast.LENGTH_SHORT).show();
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        registerPresenter.detach();
    }


}



