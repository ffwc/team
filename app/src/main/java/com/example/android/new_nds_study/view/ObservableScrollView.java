package com.example.android.new_nds_study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * @Author J & J
 * @Time 2018/5/9.
 */

public class ObservableScrollView extends ScrollView {
    public ObservableScrollView(Context context) {
        this(context, null);
    }

    public ObservableScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ObservableScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    public interface ScrollViewListener {
        //ScrollView自动滑动监听,对其进行覆写    参数 : 1.监听的VIew对象  2,3 新的坐标   4,5 旧的坐标
        void onScrollChanged(ObservableScrollView scrollView, int l, int t, int oldl, int oldt);
    }

    //自己的监听对象
    private ScrollViewListener mScrollViewListener = null;

    //提供方法,让外界可以设置ScrollView的监听对象
    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        mScrollViewListener = scrollViewListener;
    }

    //提供一个覆写的滑动监听方法,让外界可以设置ScrollView的监听对象
    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mScrollViewListener != null) {
            mScrollViewListener.onScrollChanged(this, l, t, oldl, oldt);
        }
    }
}
