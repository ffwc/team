package com.example.android.new_nds_study.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by android on 2018/4/24.
 */

public class ToastUtils {
    private static Toast TOAST;
    private static final String TAG = "ToastUtil";


    //短时间吐司
    public static void show(Context context, int resourceID) {
        show(context, resourceID, Toast.LENGTH_SHORT);
    }

    //短时间吐司
    public static void show(Context context, String text) {
        show(context, text, Toast.LENGTH_SHORT);
    }

    //自定义时长吐司
    public static void show(Context context, Integer resourceID, int duration) {
        String text = context.getResources().getString(resourceID);// 用于显示的文字
        show(context, text, duration);
    }

    //自定义时长吐司
    public static void show(final Context context, final String text, final int duration) {

        if (TOAST == null) {
            TOAST = Toast.makeText(context, text, duration);
        } else {
            TOAST.setText(text);
            TOAST.setDuration(duration);
        }

        TOAST.show();
    }

}
