package com.example.android.new_nds_study.fragment.classfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.EachClassActivity;
import com.example.android.new_nds_study.activity.LoginActivity;
import com.example.android.new_nds_study.adapter.MyClassAdapter;
import com.example.android.new_nds_study.m_v_p.bean.MessageEvent;
import com.example.android.new_nds_study.m_v_p.bean.MyCoursesBean;
import com.example.android.new_nds_study.m_v_p.presnster.MyClassPresenter;
import com.example.android.new_nds_study.m_v_p.view.MyClassPresenterListener;
import com.example.android.new_nds_study.util.NetWorkUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * Created by android on 2018/4/17.
 */

public class MyclassFragment extends Fragment implements MyClassPresenterListener {
    private final static String TAG="MyclassFragment";
    private View view;
    private RecyclerView mMyclassfragmentRecycler;
    private MyClassAdapter myClassAdapter;
    private MyClassPresenter myClassPresenter;
    private SmartRefreshLayout myclassfragment_smart;
    private MyCoursesBean myCoursesBean =new MyCoursesBean();
    private String access_token;
    private int page=1;
    private int total;
    private int a;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.myclassfragment, container, false);
        initView(view);
        if (NetWorkUtil.isNetWorkEnable(MyApp.applicationInstance())){
            initData();
        }

        return view;
    }

    private void initData() {
        myClassPresenter = new MyClassPresenter(this);
        myClassAdapter = new MyClassAdapter(getActivity());
        mMyclassfragmentRecycler.setAdapter(myClassAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mMyclassfragmentRecycler.setLayoutManager(linearLayoutManager);
        myClassAdapter.setOnItemClickListener(new MyClassAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, String title,String course_id,String unit_id) {
                //跳转单元
                MyApp.edit.putString("course_id", course_id).commit();
                MyApp.edit.putString("unit_id", unit_id).commit();
                Intent intent = new Intent(getActivity(), EachClassActivity.class).putExtra("title",title);
                startActivity(intent);
            }
        });
        initGetData();
        //下拉刷新
        myclassfragment_smart.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page=1;
                myClassPresenter.getMyClassPresenter(""+page, access_token );
            }
        });
        //上拉加载
        myclassfragment_smart.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ++page;
                if (page <= ((total+4)/5)){
                    myClassPresenter.getMyClassPresenter(""+page, access_token );
                }else {
                    myclassfragment_smart.finishLoadMore();
                }
            }
        });
        //监听RecyclerView 滑动事件
     mMyclassfragmentRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
         @Override
         public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
             super.onScrolled(recyclerView, dx, dy);
//             Log.e(TAG, "onScrolled: "+dy);
             if(dy>0){
                //上拉
                 if (a!=1){
                     MessageEvent messageEvent = new MessageEvent();
                     messageEvent.setFlag(1);
                     EventBus.getDefault().postSticky(messageEvent);
                     a=1;
                 }
             }else {
                //下拉
                 if (a!=2){
                     MessageEvent messageEvent = new MessageEvent();
                     messageEvent.setFlag(2);
                     EventBus.getDefault().postSticky(messageEvent);
                     a=2;
                 }
             }
         }
     });

//        mMyclassfragmentRecycler.addOnScrollListener(new HidingScrollListener() {
//            @Override
//            public void onHide() {
////                if (a!=1){
//                     MessageEvent messageEvent = new MessageEvent();
//                     messageEvent.setFlag(1);
//                     EventBus.getDefault().postSticky(messageEvent);
////                     a=1;
////                 }
//            }
//            @Override
//            public void onShow() {
////                if (a!=2){
//                     MessageEvent messageEvent = new MessageEvent();
//                     messageEvent.setFlag(2);
//                     EventBus.getDefault().postSticky(messageEvent);
////                     a=2;
////                 }
//            }
//        });
    }
    public abstract class HidingScrollListener extends RecyclerView.OnScrollListener {
        private static final int HIDE_THRESHOLD = 20; //移动多少距离后显示隐藏
        private int scrolledDistance = 0; //移动的中距离
        private boolean controlsVisible = true; //显示或隐藏


        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (scrolledDistance > HIDE_THRESHOLD && controlsVisible) {//移动总距离大于规定距离 并且是显示状态就隐藏
                onHide();
                controlsVisible = false;
                scrolledDistance = 0;//归零
            }
            else if (scrolledDistance < -HIDE_THRESHOLD && !controlsVisible) {
                onShow();
                controlsVisible = true;
                scrolledDistance = 0;
            }
            if ((controlsVisible && dy > 0) || (!controlsVisible && dy < 0)) { //显示状态向上滑动 或 隐藏状态向下滑动 总距离增加
                scrolledDistance += dy;
            }

        }


        public abstract void onHide();

        public abstract void onShow();
    }
    //订阅者
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onMessageEvent(MessageEvent event) {
        if (event.getLogin()==1 || event.getLogin()==2){
            initGetData();
            EventBus.getDefault().removeStickyEvent(event);
        }
    }

    private void initGetData(){
        access_token = MyApp.sp.getString("token", null);
        if (access_token == null) {
            //token失效跳转登录界面
            Toast.makeText(getActivity(),"请先登录账号",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        }else {
            myClassPresenter.getMyClassPresenter("1",  access_token );
        }
    }

    private void initView(View view) {
        mMyclassfragmentRecycler = (RecyclerView) view.findViewById(R.id.myclassfragment_recycler);
        myclassfragment_smart = view.findViewById(R.id.myclassfragment_smart);
        myclassfragment_smart.setEnableAutoLoadMore(false);
        EventBus.getDefault().register(this);
    }
    @Override
    public void onSuccess(MyCoursesBean myCoursesBean,String flag) {
//        Log.e(TAG,"检测"+myCoursesBean);
        //设置RecyclerView 点击条目事件
        this.myCoursesBean=myCoursesBean;
//        Log.e(TAG, "onSuccess: "+flag);
        if ( myCoursesBean.getData()!= null) {
            if (myCoursesBean.getData().getTotal()!=0){
                if (flag.equals("1")){
                    total=myCoursesBean.getData().getTotal();
                    myClassAdapter.setDataClear(myCoursesBean.getData().getList());
                }else {
                    myClassAdapter.setData(myCoursesBean.getData().getList());
                }
            }else {
                myClassAdapter.setDataClear(null);
            }
        }
        myclassfragment_smart.finishRefresh();
        myclassfragment_smart.finishLoadMore();
    }
    //防止内存泄露
    @Override
    public void onDestroy() {
        super.onDestroy();
        myClassPresenter.detach();
        EventBus.getDefault().unregister(this);
    }
}
