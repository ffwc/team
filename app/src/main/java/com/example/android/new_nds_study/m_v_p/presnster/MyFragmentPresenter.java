package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.modle.MyFragmentModle;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentModuleListener;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentPresenterListener;

public class MyFragmentPresenter {

    private final MyFragmentPresenterListener myFragmentPresenterListener;
    private final MyFragmentModle myFragmentModle;

    public MyFragmentPresenter(MyFragmentPresenterListener myFragmentPresenterListener) {
        this.myFragmentPresenterListener = myFragmentPresenterListener;
        myFragmentModle = new MyFragmentModle();

    }

    public void getData(String token ){

        myFragmentModle.getData(token, new MyFragmentModuleListener() {
            @Override
            public void success(UserinfoBean userinfoBean) {
                if (myFragmentPresenterListener!=null){

                    myFragmentPresenterListener.onSuccess(userinfoBean);
                }

            }
        });



    }
}
