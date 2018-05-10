package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.ClassnameActivity;
import com.example.android.new_nds_study.view.ObservableScrollView;


/**
 * Created by android on 2018/4/17.
 */

public class LiveFragment extends Fragment {


    private View view;
    private RelativeLayout mIvDetail;
    private ObservableScrollView mScrollView;
    private TextView mTvTitlebar;
    private RelativeLayout mLayoutTitle;
    private int mImageHeight;
    private TextView textView_ste;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.live_fragment, container, false);
        initview(view);
        initListener(view);

        //设置ScrollVIew的滚动监听,一般滑动时,最上面的标题显示,参数是ScrollViewListener,我们让Activity去实现

        return view;
    }

    private void initview(View view) {
        mIvDetail = (RelativeLayout) view.findViewById(R.id.iv_detail);
        mScrollView = (ObservableScrollView) view.findViewById(R.id.scrollView);
        mTvTitlebar = (TextView) view.findViewById(R.id.tv_titlebar);
        mLayoutTitle = (RelativeLayout) view.findViewById(R.id.layout_title);
        textView_ste = view.findViewById(R.id.textview_set);
        textView_ste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassnameActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * C 获取顶部的图片高度,设置ScrollView的滚动监听时,要使用这个参数
     */
    private void initListener(View view) {
        //获取控件的视图观察者,以便通过视图观察者得到控件的宽高参数
        ViewTreeObserver viewTreeObserver = mIvDetail.getViewTreeObserver();
        //使用视图观察者设置监听,以便获取所观察控件的高度
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //回调监听后,第一件事情就是移除该监听,减少内存的消耗,在API16中removeOnGlobalLayoutListener代替removeGlobalOnLayoutListener
                mIvDetail.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                //得到控件的高度
                mImageHeight = mIvDetail.getHeight();

            }
        });
        new ObservableScrollView.ScrollViewListener() {
            @Override
            public void onScrollChanged(ObservableScrollView scrollView, int l, int t, int oldl, int oldt) {
                int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
                int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
                mIvDetail.measure(w, h);
                int height = mIvDetail.getMeasuredHeight();
                int width = mIvDetail.getMeasuredWidth();


                //对T轴进行判断,就两种形态:1.消失没有   2.随着滑动,颜色越来越深

                Log.i("控件的高度", String.valueOf(height));
                if (height > 0) {
                    //设置标题隐藏
                    mTvTitlebar.setVisibility(View.INVISIBLE);
                    //设置标题所在背景为透明
                    //mLayoutTitle.setBackgroundColor(Color.argb(0,0,0,0));
                } else if (height <= 0) {
                    //让标题显示出来
                    mLayoutTitle.setVisibility(View.VISIBLE);
                    //获取ScrollView向下滑动,图片消失部分的比例
                    float scale = (float) t / mImageHeight;
                    //根据这个比例,让标题的颜色慢慢的由浅入深
                    float alpha = 255 * scale;
                    //设置标题的内容及颜色
                    mTvTitlebar.setText("本堂课的名称");
                    mTvTitlebar.setTextColor(Color.argb((int) alpha, 0, 0, 0));
                    //设置标题布局颜色
                    mLayoutTitle.setBackgroundColor(Color.argb((int) alpha, 255, 255, 255));
                }
            }
        };
    }


}


