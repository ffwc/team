package com.example.android.new_nds_study.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

import java.util.ArrayList;
import java.util.List;


public class TabView extends ViewGroup {
    public TabView(Context context) {
        super(context);
    }

    private List<TabItemVeiw> views;

    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TabView);
        textColor = typedArray.getColor(R.styleable.TabView_tab_text_color, Color.parseColor("#000000"));
        textColorPress = typedArray.getColor(R.styleable.TabView_tab_text_color_press, Color.parseColor("#000000"));
        textSize = typedArray.getResourceId(R.styleable.TabView_tab_text_size, R.dimen.tab_text_size);
        typedArray.recycle();
        for (int i = 0; i < projectSize; i++) {
            TabItemVeiw tabItemVeiw = new TabItemVeiw(context);
            tabItemVeiw.setTextColor(textColor);
            tabItemVeiw.setTextSize((int) (getResources().getDimension(textSize) / getResources().getDisplayMetrics().density + 0.5f));
            addView(tabItemVeiw);
            if (views == null) {
                views = new ArrayList<>();
            }
            views.add(tabItemVeiw);
        }
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int size = getChildCount();
        int itemWidth = getMeasuredWidth() / projectSize;
        for (int i = 0; i < size; i++) {
            View view = getChildAt(i);
            view.layout(i * itemWidth, 0, i * itemWidth + view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public static int projectSize = 3;
    private int textSize, textColor, textColorPress;
    private int[] selectIcons;
    private int[] normalIcons;
    private String[] tabTexts;

    public void setSelectIcons(int[] selectIcons) {
        this.selectIcons = selectIcons;
    }

    public void setNormalIcons(int[] normalIcons) {
        this.normalIcons = normalIcons;
        for (int i = 0; i < normalIcons.length; i++) {
            views.get(i).setImageView(normalIcons[i]);
        }

    }

    public void setBg(int[] res) {
        for (int i = 0; i < res.length; i++) {
            views.get(i).setBG(res[i]);
        }
    }

    public void setTabTexts(String[] tabTexts) {
        this.tabTexts = tabTexts;
        for (int i = 0; i < tabTexts.length; i++) {
            views.get(i).setText(tabTexts[i]);
        }
    }

    public void setTextColor(String color) {
        for (int i = 0; i < views.size(); i++) {
            views.get(i).setTextColor(color);
        }
    }

    public void setTextColor(ColorStateList color) {
        for (int i = 0; i < views.size(); i++) {
            views.get(i).setTextColor(color);
        }
    }

    private int width, height;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);
        LayoutParams layoutParams = new ViewGroup.LayoutParams(width / projectSize, height);
        for (int i = 0; i < projectSize; i++) {
            views.get(i).setLayoutParams(layoutParams);
        }
        measureChildren(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


    public class TabItemVeiw extends ViewGroup {
        private TextView textView;
        private ImageView imageView;
        private Context context;

        public TabItemVeiw(Context context) {
            super(context);
            this.context = context;
            textView = new TextView(context);
            imageView = new ImageView(context);
            addView(imageView);
            addView(textView);
        }

        public TabItemVeiw(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);

        }

        public TabItemVeiw(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        private int width, height;
        private int imageWidth, textHeight;

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            width = MeasureSpec.getSize(widthMeasureSpec);
            height = MeasureSpec.getSize(heightMeasureSpec);
            imageWidth = height * 32 / 49;
            ViewGroup.LayoutParams param = new ViewGroup.LayoutParams(imageWidth, imageWidth);
            imageView.setLayoutParams(param);
            textHeight = height * 12 / 49;
            ViewGroup.LayoutParams paramText = new ViewGroup.LayoutParams(width, textHeight);
            textView.setLayoutParams(paramText);
            textView.setGravity(Gravity.CENTER);
            measureChildren(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        }

        @Override
        protected void onLayout(boolean changed, int l, int t, int r, int b) {
            int paddingRight = (width - imageWidth) / 2;
            int paddingTop = (height * 5 / 49) / 2;
            imageView.layout(paddingRight, paddingTop, paddingRight + imageWidth, paddingTop + imageWidth);
            textView.layout(0, imageWidth + paddingTop, width, imageWidth + paddingTop + textHeight);

        }

        public void setBG(int id) {
            imageView.setBackgroundResource(id);
        }

        public void setTextSize(int a) {
            textView.setTextSize(a);
        }

        public void setText(String a) {
            textView.setText(a);
        }

        public void setTextColor(String a) {
            textView.setTextColor(Color.parseColor(a));
        }

        public void setTextColor(ColorStateList a) {
            textView.setTextColor(a);
        }

        public void setTextColor(int a) {
            textView.setTextColor(a);
        }

        public void setImageView(int a) {
            imageView.setBackgroundResource(a);
        }
    }

    private OnClickListener onClickListener;

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    private int currentIndex = -1;

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        for (int i = 0; i < views.size(); i++) {
            final int index = i;
            View view = views.get(i);
            view.setTag(i);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int in = (int) v.getTag();
                    if (currentIndex == in) {
                        return;
                    }
                    currentIndex = in;
                    setItemSelect(in);
                    if (onClickListener != null) {
                        onClickListener.onItemClick(in);
                    }
                }
            });
        }
    }

    public void setItemSelect(int index) {
        if (selectIcons == null || normalIcons == null) {
            return;
        }
        for (int i = 0; i < views.size(); i++) {
            if (i == index) {
                views.get(i).setImageView(selectIcons[i]);
                views.get(i).setTextColor(textColorPress);
            } else {
                views.get(i).setImageView(normalIcons[i]);
                views.get(i).setTextColor(textColor);
            }
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onItemClick(int position);
    }
}
