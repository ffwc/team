package com.example.android.new_nds_study.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.example.android.new_nds_study.Entity;


public class CourseWareViewPager extends ViewPager {

    public CourseWareViewPager(Context context) {
        super(context);
    }

    public CourseWareViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    float down_x,down_y,up_x,uo_y;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                down_x = event.getX();
                down_y = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:



                break;
            case MotionEvent.ACTION_UP:
                up_x = event.getX();
                uo_y = event.getY();

                if((up_x - down_x) > 50 ){
                    if(mSlideTowardListener != null){
                        mSlideTowardListener.slideToward(Entity.CommandType.RIGHT);
                    }
                }else if((up_x - down_x) < -50){
                    if(mSlideTowardListener != null){
                        mSlideTowardListener.slideToward(Entity.CommandType.LEFT);
                    }
                }
        }
        return true;
    }

    @Override
    public boolean isFakeDragging() {
        return super.isFakeDragging();
    }


    private slideTowardListener mSlideTowardListener;

    public void setSlideTowardListener(slideTowardListener listener){
        this.mSlideTowardListener = listener;
    }

    public interface slideTowardListener{
        void slideToward(String toward);
    }




}
