package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.RecommendBigPictureBean;
import com.example.android.new_nds_study.m_v_p.modle.RecommendBigPictureModle;
import com.example.android.new_nds_study.m_v_p.view.RecommendBigPictureModleListener;
import com.example.android.new_nds_study.m_v_p.view.RecommendBigPicturePresenterListener;

/**
 * @Author J & J
 * @Time 2018/6/8.
 */

public class RecommendBigPicturePreserent {
    RecommendBigPicturePresenterListener recommendBigPicturePresenterListener;
    private final RecommendBigPictureModle recommendBigPictureModle;

    public RecommendBigPicturePreserent(RecommendBigPicturePresenterListener recommendBigPicturePresenterListener) {
        this.recommendBigPicturePresenterListener = recommendBigPicturePresenterListener;
        recommendBigPictureModle = new RecommendBigPictureModle();

    }

    public void getData() {

        //调用m层的数据
        recommendBigPictureModle.getData(new RecommendBigPictureModleListener() {


            @Override
            public void success(RecommendBigPictureBean recommendBigPictureBean) {
                if (recommendBigPicturePresenterListener != null) {
                    recommendBigPicturePresenterListener.success(recommendBigPictureBean);

                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        recommendBigPicturePresenterListener = null;
    }

}