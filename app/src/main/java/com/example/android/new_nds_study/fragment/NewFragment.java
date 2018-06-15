package com.example.android.new_nds_study.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.FindRecycler_adapter;
import com.example.android.new_nds_study.m_v_p.bean.MessageListBean;
import com.example.android.new_nds_study.m_v_p.presnster.MessageListPreserent;
import com.example.android.new_nds_study.m_v_p.view.MessageListModuleListener;
import com.example.android.new_nds_study.m_v_p.view.MessageListPresenterListener;
import com.example.android.new_nds_study.util.LogUtil;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/20.
 */

public class NewFragment extends Fragment implements MessageListPresenterListener, MessageListModuleListener {


    private static final String TAG = "NewFragment";
    private XRecyclerView findrecyclerview;
    private MessageListPreserent messageListPreserent;


    private View view;
    private int name_id;
    int page = 1;
    private FindRecycler_adapter findRecycler_adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //找到布局文件
        view = View.inflate(getActivity(), R.layout.findfragmentmanger, null);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        //接收传递过来的值
        name_id = bundle.getInt("name");
        //Log.i(TAG, "接收的值是: " + name_id);
        messageListPreserent = new MessageListPreserent(this);

        messageListPreserent.getData(name_id, page);
        //调用解析方法


    }


    @Override
    public void successe(MessageListBean messageListBean) {

        if (messageListBean == null) {
            return;
        }
        //Log.i(TAG, "viewpager: 成功");
        //String errmsg = messageListBean.getErrmsg();
        //Log.i(TAG, "successe: " + errmsg);
        List<MessageListBean.DataBean.ListBean> list = messageListBean.getData().getList();
        initview(view, list);
    }

    @Override
    public void success(MessageListBean messageListBean) {

    }


    private void initview(View view, final List<MessageListBean.DataBean.ListBean> list) {
        findrecyclerview = view.findViewById(R.id.find_recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        findrecyclerview.setLayoutManager(manager);

        findRecycler_adapter = new FindRecycler_adapter(getActivity(), list);
        findrecyclerview.setAdapter(findRecycler_adapter);
        //设置允许上拉下拉
        findrecyclerview.setPullRefreshEnabled(true);
        findrecyclerview.setLoadingMoreEnabled(true);
        findrecyclerview.setLoadingListener(new XRecyclerView.LoadingListener() {

            @Override
            public void onRefresh() {
                page = 1;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        list.clear();
                       // Toast.makeText(getActivity(), "刷新page页码是：" + page + "", Toast.LENGTH_LONG).show();
                        LogUtil.i(TAG, "刷新page页码是：" + page);
                        messageListPreserent.getData(name_id, page);
                        findRecycler_adapter.notifyDataSetChanged();
                        findrecyclerview.refreshComplete();

                    }
                }, 3000);
            }

            @Override
            public void onLoadMore() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(getActivity(), "加载page页码是：" + page + "", Toast.LENGTH_LONG).show();
                        LogUtil.i(TAG, "加载page页码是：" + page);
                        messageListPreserent.getData(name_id, page);
                        findRecycler_adapter.notifyDataSetChanged();
                        findrecyclerview.loadMoreComplete();
                    }
                }, 3000);
            }

        });

    }
}



