package com.example.android.new_nds_study.base;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by  on 2018/4/19.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected Context mContext;
    protected T mPresenter;
    private Application myApplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //沉浸式
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
           // SystemBarTintManager tintManager = new SystemBarTintManager(this);
           // tintManager.setStatusBarTintEnabled(true);
          //  tintManager.setStatusBarTintResource(R.color.Black);//通知栏所需颜色
        }
        setContentView(getLayoutId());
        init();
        initView();//初始化当前Activity控件
        initDatas();//初始化数据

    }

    //沉浸式相关方法
    @TargetApi(19)
    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    private void init(){
        mContext = this;

        //添加当前Activity
      //  myApplication.getInstance().addActivity(this);
        createPresenter();
        mPresenter.attachView(this);
    }

    protected abstract void createPresenter();

    //初始化布局
    protected abstract int getLayoutId();
    protected abstract void initView();
    protected abstract void initDatas();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //MyApplication.getInstance().removeActivity(this);//移除当前Activity
        //        Presenter解除绑定
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter = null;
        }
    }


}

