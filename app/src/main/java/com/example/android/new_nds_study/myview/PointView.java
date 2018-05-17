package com.example.android.new_nds_study.myview;

import android.graphics.Point;

public class PointView extends Point {
    //用于转化密码的下标
    public int index;

    public PointView(int x, int y) {
        super(x, y);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}