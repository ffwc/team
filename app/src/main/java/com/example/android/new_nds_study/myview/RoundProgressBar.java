package com.example.android.new_nds_study.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.example.android.new_nds_study.R;


public class RoundProgressBar extends View {


    private static final String TAG = "RoundProgressBar";

    private Paint paint;
    private int roundColor;
    private int roundProgressColor;
    private float roundWidth;
    //最大进度
    private int max;
    //当前进度
    private int progress;
    //进度的风格，实心或者空心
    private int style;
    public static final int STROKE = 0;
    public static final int FILL = 1;

//    Bitmap middle_image_pause, middle_image_download;

    public static final int PAUSE = 0;
    public static final int DOWNLOADING = 1;

    public static int PROGRESS_BAR_STATUS;

    public RoundProgressBar(Context context) {
        this(context, null);
    }

    public RoundProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundProgressBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        paint = new Paint();

        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.RoundProgressBar);

        //获取自定义属性和默认值
        roundColor = mTypedArray.getColor(R.styleable.RoundProgressBar_roundColor, getResources().getColor(R.color.progress_bar_bg_color));
        roundProgressColor = mTypedArray.getColor(R.styleable.RoundProgressBar_roundProgressColor, getResources().getColor(R.color.register_account_text_click_color));
        roundWidth = mTypedArray.getDimension(R.styleable.RoundProgressBar_roundWidth, 4);
        max = mTypedArray.getInteger(R.styleable.RoundProgressBar_max, 100);
        style = mTypedArray.getInt(R.styleable.RoundProgressBar_style, 0);

        mTypedArray.recycle();


//        middle_image_pause = BitmapFactory.decodeResource(getResources(), R.mipmap.arrows);
//        middle_image_download = BitmapFactory.decodeResource(getResources(), R.mipmap.square);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /**
         * 画最外层的大圆环
         */
        int centre = getWidth() / 2; //获取圆心的x坐标
        int radius = (int) (centre - roundWidth / 2); //圆环的半径
        paint.setColor(roundColor); //设置圆环的颜色
        paint.setStyle(Paint.Style.STROKE); //设置空心
        paint.setStrokeWidth(roundWidth); //设置圆环的宽度
        paint.setAntiAlias(true);  //消除锯齿
        canvas.drawCircle(centre, centre, radius, paint); //画出圆环

        //画中间的图片
//        if (PROGRESS_BAR_STATUS == PAUSE) {
//            canvas.drawBitmap(middle_image_pause, centre - middle_image_pause.getWidth() / 2, centre - middle_image_pause.getHeight() / 2, paint);
//        } else {
//            canvas.drawBitmap(middle_image_download, centre - middle_image_download.getWidth() / 2, centre - middle_image_download.getHeight() / 2, paint);
//        }


        /**
         * 画圆弧 ，画圆环的进度
         */

        //设置进度是实心还是空心
        paint.setStrokeWidth(roundWidth); //设置圆环的宽度
        paint.setColor(roundProgressColor);  //设置进度的颜色
        RectF oval = new RectF(centre - radius, centre - radius, centre + radius, centre + radius);  //用于定义的圆弧的形状和大小的界限

        switch (style) {
            case STROKE: {
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawArc(oval, -90, 360 * progress / max, false, paint);  //根据进度画圆弧
                break;
            }
            case FILL: {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                if (progress != 0)
                    canvas.drawArc(oval, -90, 360 * progress / max, true, paint);  //根据进度画圆弧
                break;
            }
        }

    }

    //获取圆形进度条当前状态
    public int getStatus(){
        return this.PROGRESS_BAR_STATUS;
    }

    /**
     * 设置状态，下载中，开始下载
     *
     * @param status
     */
    public void setStatus(int status) {
        //LogUtil.printInfo(TAG,"ProgressBar 设置状态："+status);
        this.PROGRESS_BAR_STATUS = status;
        invalidate();
    }

    /**
     * 设置进度的最大值
     *
     * @param max
     */
    public synchronized void setMax(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max not less than 0");
        }
        this.max = max;
    }

    /**
     * 设置进度，此为线程安全控件，由于考虑多线的问题，需要同步
     * 刷新界面调用postInvalidate()能在非UI线程刷新
     *
     * @param progress
     */
    public synchronized void setProgress(int progress) {
        if (progress < 0) {
            throw new IllegalArgumentException("progress not less than 0");
        }
        if (progress > max) {
            progress = max;
        }
        if (progress <= max) {
            this.progress = progress;
            postInvalidate();
        }

    }

//    private float downX,downY,upX,upY;
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                downX = event.getX();
//                downY = event.getY();
//            break;
//            case MotionEvent.ACTION_MOVE:
//
//            break;
//            case MotionEvent.ACTION_UP:
//                upX = event.getX();
//                upY = event.getY();
//                float disX = upX - downX;
//                float disY = upY - downY;
//                if(disX < getWidth() && disY < getWidth()){
//                    if(mOnBarClickListener != null){
//                        LogUtil.printInfo(TAG,"progressBar 触摸事件，回调外部, PROGRESS_BAR_STATUS = "+ PROGRESS_BAR_STATUS);
//                        mOnBarClickListener.onBarClick(PROGRESS_BAR_STATUS,this);
//                    }
//                }
//        }
//        return true;
//    }


//    OnBarClickListener mOnBarClickListener;
//
//    public void setOnBarClickListener(OnBarClickListener listener){
//        this.mOnBarClickListener = listener;
//    }
//
//    public interface OnBarClickListener{
//        void onBarClick(int status, View view);
//    }

}
