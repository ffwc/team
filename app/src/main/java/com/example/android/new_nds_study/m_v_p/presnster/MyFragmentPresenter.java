package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.OpenUser;
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

    public void getData(String uid ){

        myFragmentModle.getData(uid, new MyFragmentModuleListener() {
            @Override
            public void success(OpenUser openUser) {
                if (myFragmentPresenterListener!=null){

                    myFragmentPresenterListener.onSuccess(openUser);
                }

            }
        });



    }
}
