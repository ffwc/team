package com.example.android.new_nds_study.util;

import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verification {

    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            Toast.makeText(MyApp.applicationInstance(),"手机号应为11位数",Toast.LENGTH_SHORT);
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();

            if (!isMatch) {
                Toast.makeText(MyApp.applicationInstance(),"请填入正确的手机号",Toast.LENGTH_SHORT);
            }
            return isMatch;
        }
    }

    public static boolean isUserName(String username){

        String regex = "";
        if (username.length()<20&&username.length()>6){


        }

        return false;
    }
}
