package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.fragment.classfragment.ClassingFragment;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.modle.ClassListModle;
import com.example.android.new_nds_study.m_v_p.view.ClassModleListener;
import com.example.android.new_nds_study.m_v_p.view.ClassPresenterListener;

/**
 * @Author J & J
 * @Time 2018/6/5.
 */

public class ClassListPresenter {
    ClassPresenterListener classPresenterListener;
    private final ClassListModle classListModle;

    public ClassListPresenter(ClassPresenterListener classPresenterListener) {

        this.classPresenterListener = classPresenterListener;
        classListModle = new ClassListModle();
    }

    public void getData(int limit, int page) {
        //调用m层的数据
        classListModle.getData(limit, page, new ClassModleListener() {
            @Override
            public void success(ClassListBean classListBean) {
                if (classPresenterListener != null) {
                    classPresenterListener.success(classListBean);
                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        classPresenterListener = null;
    }

}
