package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.MessageListBean;
import com.example.android.new_nds_study.m_v_p.view.MessageListModuleListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class MessageListModle {

    public void getData(int name_id, int page ,final MessageListModuleListener messageListModuleListener) {
        final Map<String, String> map = new HashMap<>();
        String zixunliebiao = "/v1/news/app/category/" + name_id + "/newslist/limit/50/page/" + page;
        RetrofitManagerAPI.get(zixunliebiao, map, new BaseObserver<MessageListBean>() {


            @Override
            public void success(MessageListBean messageListBean) {
                if (messageListModuleListener != null) {

                    messageListModuleListener.success(messageListBean);
                    // LogUtil.i("88888","数据请求成功");
                }
            }

            @Override
            public void failure(int code) {

            }
        });
    }
}
