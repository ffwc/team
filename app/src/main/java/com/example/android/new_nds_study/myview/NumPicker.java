package com.example.android.new_nds_study.myview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;


public class NumPicker extends NumberPicker {

    public NumPicker(Context context) {
        super(context);
    }

    public NumPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NumPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        updateView(child);
    }

    @Override
    public void addView(View child, int index, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        updateView(child);
    }

    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        updateView(child);
    }

    public void updateView(View view) {
        if (view instanceof EditText) {
            //这里修改字体的属性跟大小
            ((EditText) view).setTextColor(Color.parseColor("#1B1B1B"));
            ((EditText) view).setTextSize(19);
        }
    }

}

