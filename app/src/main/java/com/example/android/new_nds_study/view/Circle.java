package com.example.android.new_nds_study.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.nfc.Tag;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import com.example.android.new_nds_study.R;

/**
 * @Author J & J
 * @Time 2018/4/28.
 */

public class Circle extends View {


    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setTextSize(1);
        paint.setColor(R.color.circle_black);


        DisplayMetrics dm = getResources().getDisplayMetrics();
        int heigth = dm.heightPixels;
        int width = dm.widthPixels;
        Log.i("circle", String.valueOf(heigth));
        Log.i("circle", String.valueOf(width));
        int bigradius=(width-350)/2;
        int smallradius=bigradius-350;
        int circlex=width/2;
        int circley=heigth/4;


        paint.setStyle(Style.STROKE);
        canvas.drawCircle(circlex, circley, bigradius, paint);
        canvas.drawCircle(circlex, circley, smallradius, paint);


    }
}