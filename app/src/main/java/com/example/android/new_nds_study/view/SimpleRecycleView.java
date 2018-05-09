package com.example.android.new_nds_study.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;


public class SimpleRecycleView extends RecyclerView {
    private static final String TAG = SimpleRecycleView.class.getSimpleName();
    // 一个滚动对象
    private Scroller mScroller;
    private int mLastX = 0;

    public SimpleRecycleView(Context context) {
        super(context);
        init(context);
    }

    public SimpleRecycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SimpleRecycleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    // 一个初始化方法，传入了一个上下文对象，用来初始化滚动对象
    private void init(Context context){
        mScroller = new Scroller(context);
    }

    // 重写了计算滚动方法
    @Override
    public void computeScroll() {
        if(mScroller!=null && mScroller.computeScrollOffset()){
            scrollBy(mLastX - mScroller.getCurrX(), 0);
            mLastX = mScroller.getCurrX();
            postInvalidate();
        }
    }



    /**
     * 调用此方法滚动到目标位置,其中(fx, fy)表示最终要滚到的目标位置的坐标值
     * duration表示期间滚动的耗时。
     *
     * @param fx 目标位置的X向坐标值
     * @param fy 目标位置的Y向坐标值
     * @param duration 滚动到目标位置所消耗的时间毫秒值
     */
    @SuppressWarnings("unused")
    public void smoothScrollTo(int fx, int fy,int duration) {
        int dx = 0;
        int dy = 0;
        // 计算变化的位移量
        if(fx != 0) {
            dx = fx - mScroller.getFinalX();
        }
        if(fy!=0) {
            dy = fy - mScroller.getFinalY();
        }
        smoothScrollBy(dx, dy, duration);
    }

    /**
     * 调用此方法设置滚动的相对偏移
     */
    public void smoothScrollBy(int dx, int dy, int duration) {
        if(duration > 0) {
            mScroller.startScroll(mScroller.getFinalX(), mScroller.getFinalY(), dx, dy, duration);
        } else {
            // 设置mScroller的滚动偏移量
            mScroller.startScroll(mScroller.getFinalX(), mScroller.getFinalY(), dx, dy);
        }
        // 重绘整个view，重绘过程会调用到computeScroll()方法。
        // 这里必须调用invalidate()才能保证computeScroll()会被调用，否则不一定会刷新界面，看不到滚动效果
        invalidate();
    }

    /**
     * 此方法用来检查自动调节
     *
     * @param position 要检查的位置
     */
    @SuppressWarnings("unused")
    public void checkAutoAdjust(int position){
        int childCount = getChildCount();
        // 获取可视范围内的选项的头尾位置
        int firstVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
        int lastVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        if(position == (firstVisibleItemPosition + 1) || position == firstVisibleItemPosition){
            // 当前位置需要向右平移
            leftScrollBy(position, firstVisibleItemPosition);
        } else if (position == (lastVisibleItemPosition - 1) || position == lastVisibleItemPosition){
            // 当前位置需要向左平移
            rightScrollBy(position, lastVisibleItemPosition);
        }
    }

    private void leftScrollBy(int position, int firstVisibleItemPosition){
        View leftChild = getChildAt(0);
        if(leftChild != null){
            int startLeft = leftChild.getLeft();
            int endLeft = (position == firstVisibleItemPosition ? leftChild.getWidth() : 0);
            autoAdjustScroll(startLeft, endLeft);
        }
    }

    private void rightScrollBy(int position, int lastVisibleItemPosition){
        int childCount = getChildCount();
        View rightChild = getChildAt(childCount - 1);
        if(rightChild != null){
            int startRight = rightChild.getRight() - getWidth();
            int endRight = (position == lastVisibleItemPosition ? (-1 * rightChild.getWidth()) : 0);
            autoAdjustScroll(startRight, endRight);
        }
    }

    /**
     *
     * @param start 滑动起始位置
     * @param end 滑动结束位置
     */
    private void autoAdjustScroll(int start, int end){
        mLastX = start;
        mScroller.startScroll(start, 0, end - start, 0);
        postInvalidate();
    }


    /**
     * 将指定item平滑移动到整个view的中间位置
     * @param position 指定的item的位置
     */
    public void smoothScrollMaster(int position) {
        // 这个方法是为了设置Scroller的滚动的，需要根据业务需求，编写算法。
    }

}
