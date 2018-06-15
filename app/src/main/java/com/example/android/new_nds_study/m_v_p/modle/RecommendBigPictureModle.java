package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.example.android.new_nds_study.m_v_p.bean.RecommendBigPictureBean;
import com.example.android.new_nds_study.m_v_p.view.ClassModleListener;
import com.example.android.new_nds_study.m_v_p.view.RecommendBigPictureModleListener;
import com.example.android.new_nds_study.network.API;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/6/8.
 */

public class RecommendBigPictureModle {
    public void getData(final RecommendBigPictureModleListener recommendBigPictureModleListener) {
        final Map<String, String> map = new HashMap<>();

        RetrofitManagerAPI.get(API.bigpicture, map, new BaseObserver<RecommendBigPictureBean>() {


            @Override
            public void success(RecommendBigPictureBean recommendBigPictureBean) {
                if (recommendBigPictureBean != null) {

                    recommendBigPictureModleListener.success(recommendBigPictureBean);

                }
            }

            @Override
            public void failure(int code) {

            }
        });
    }
}

