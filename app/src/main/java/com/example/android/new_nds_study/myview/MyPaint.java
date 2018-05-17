package com.example.android.new_nds_study.myview;

import android.graphics.Color;
import android.graphics.Paint;

public class MyPaint extends Paint {
    private String color;
    public MyPaint() {
        super();
    }

    public MyPaint(int flags) {
        super(flags);
    }

    public void setStrokeColor(String color) {
        this.color = color;
        //setColor(Color.parseColor(color));
        try {
            setColor(Color.parseColor(color));
        } catch (Exception e) {
            return;
        }

    }

    public String getMyPaintColor() {
        return color;
    }
}
