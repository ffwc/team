package com.example.android.new_nds_study.logion_refister;

/**
 * Created by android on 2018/4/23.
 */

public interface NetListener<T>  {
     void onSuccess(T t);
     void onFailure(Exception e);
}
