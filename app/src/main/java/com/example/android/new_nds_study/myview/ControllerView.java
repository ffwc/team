package com.example.android.new_nds_study.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class ControllerView extends RelativeLayout {
    private int viewWidth;
    private int viewHeight;
    private Paint mPaint;
    private final String DEFALT_COLOR = "#4E5765";
    private final String SELECT_COLOR = "#35c616";
    private final int DEFALT_STROLKES = 2;

    public ControllerView(Context context) {
        super(context);

    }

    public ControllerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(DEFALT_STROLKES);
        mPaint.setColor(Color.parseColor(DEFALT_COLOR));
        mPaint.setStyle(Paint.Style.STROKE);
    }

    public ControllerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        viewWidth = getWidth();
        viewHeight = getHeight();
    }

    private boolean isClick = false;
    private int lastX, lastY;
    private boolean isCanAble = true;

    public void setCanAble(boolean canAble) {
        isCanAble = canAble;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!isCanAble) {
            return true;
        }
        int x = (int) event.getX();
        int y = (int) event.getY();
        //点击位置x坐标与圆心的x坐标的距离
        int distanceX = Math.abs(x - circleX);
        //点击位置y坐标与圆心的y坐标的距离
        int distanceY = Math.abs(y - circleY);
        //点击位置与圆心的直线距离
        int distanceZ = (int) Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
        //如果点击位置与圆心的距离xiao于圆的半径，证明点击位置没有在圆内
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (!isClick) {
                    if (distanceZ < rSmall) {
                        isClick = true;
                        invalidate();
                        if (onAreaSelcet != null) {
                            onAreaSelcet.onSelectCenter(isClick);
                        }
                    }
                }
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
               /* if (!isClick) {
                    if (distanceZ < rSmall) {
                        isClick = true;
                        invalidate();
                        if (onAreaSelcet != null) {
                            onAreaSelcet.onSelectCenter(isClick);
                        }
                    }
                } else*/
                if (isClick) {
                    if (distanceZ > rSmall) {
                        isClick = false;
                        invalidate();
                        if (onAreaSelcet != null) {
                            onAreaSelcet.onSelectCenter(isClick);
                        }
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                int xLength = Math.abs(lastX - x);
                int yLength = Math.abs(lastY - y);
                int max = Math.max(xLength, yLength);
                if (isClick) {
                    isClick = false;
                    invalidate();
                    if (onAreaSelcet != null) {
                        onAreaSelcet.onSelectCenter(isClick);
                    }
                    if (max < 5) {
                        onAreaSelcet.onChangeClick(CENTER);
                        return true;
                    }
                }
                if (max < 5) {
                 if (xLength > yLength) {
                    if (lastX > x) {
                        onAreaSelcet.onChangeClick(LEFT);
                    } else {
                        onAreaSelcet.onChangeClick(RIGHT);
                    }
                    }
                } else if (xLength <= yLength) {
                    if (lastY > y) {
                        onAreaSelcet.onChangeClick(TOP);
                    } else {
                        onAreaSelcet.onChangeClick(BOTTOM);
                    }
                }

        }
        return true;
    }

    private int rSmall, circleX, circleY;

    @Override

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int r = Math.min(viewHeight, viewWidth) / 2;
        rSmall = r * 12 / 32;
        circleX = viewWidth / 2;
        circleY = viewHeight / 2;
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor(DEFALT_COLOR));
        canvas.drawCircle(circleX, circleY, r - DEFALT_STROLKES / 2, mPaint);
        canvas.drawCircle(circleX, circleY, rSmall - DEFALT_STROLKES / 2, mPaint);
        if (isClick) {
            mPaint.setStyle(Paint.Style.FILL);
            mPaint.setColor(Color.parseColor("#38404e"));
            canvas.drawCircle(circleX, circleY, rSmall - DEFALT_STROLKES / 2, mPaint);
        }
    }

    private OnAreaSelcet onAreaSelcet;

    public void setOnAreaSelcet(OnAreaSelcet onAreaSelcet) {
        this.onAreaSelcet = onAreaSelcet;
    }

    public static final int TOP = 1, RIGHT = 2, LEFT = 0, BOTTOM = 3, CENTER = 4;

    public interface OnAreaSelcet {
        void onSelectCenter(boolean flag);

        void onChangeClick(int flag);
    }
}
