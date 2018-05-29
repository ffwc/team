package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.MessageListBean;
import com.example.android.new_nds_study.m_v_p.modle.MessageListModle;
import com.example.android.new_nds_study.m_v_p.view.MessageListModuleListener;
import com.example.android.new_nds_study.m_v_p.view.MessageListPresenterListener;

/**
 * @Author J & J
 * @Time 2018/5/14.
 */

public class MessageListPreserent {
    MessageListPresenterListener messageListPresenterListener;
    private final MessageListModle messageListModle;

    public MessageListPreserent(MessageListPresenterListener messageListPresenterListener) {
        this.messageListPresenterListener = messageListPresenterListener;
        messageListModle = new MessageListModle();

    }

    public void getData(int name_id, int page) {

        //调用m层的数据
        messageListModle.getData(name_id, page, new MessageListModuleListener() {


            @Override
            public void success(MessageListBean messageListBean) {
                if (messageListPresenterListener != null) {
                    messageListPresenterListener.successe(messageListBean);

                }
            }
        });
    }

    //防止内存泄露
    public void detach() {
        messageListPresenterListener = null;
    }

}
