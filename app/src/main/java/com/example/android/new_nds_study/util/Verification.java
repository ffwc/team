package com.example.android.new_nds_study.util;

import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;

import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verification {

    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            Toast.makeText(MyApp.applicationInstance(),"手机号应为11位数",Toast.LENGTH_SHORT).show();
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();

            if (!isMatch) {
                Toast.makeText(MyApp.applicationInstance(),"请填入正确的手机号",Toast.LENGTH_SHORT).show();
            }
            return isMatch;
        }
    }

    public static boolean isUserName(String username){


        Pattern p = Pattern.compile("^[\\w{1,}|(\\d{1,}|_)]{6,20}$");
        Matcher m =  p.matcher(username);
        boolean b = m.find();
        if (username.length()>20||username.length()<6){
            Toast.makeText(MyApp.applicationInstance(),"用户名6-20位字符。",Toast.LENGTH_SHORT).show();
            return false;

        }else{


            if (!b){
                Toast.makeText(MyApp.applicationInstance(),"用户名6-20位字符，必须以字母开头，只能包含数字、字母、下划线，不区分大小写。",Toast.LENGTH_SHORT).show();
                return false;

            }else{
                return b;
            }
        }
    }

    public static  boolean isPassWord(String password){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,32}");
        Matcher matcher = pattern.matcher(password);
        boolean b = matcher.find();
        if (password.length()>32||password.length()<8){

            Toast.makeText(MyApp.applicationInstance(),"密码8-32位字符。",Toast.LENGTH_SHORT).show();
            return false;
        }else{
            if (!b){
                Toast.makeText(MyApp.applicationInstance(),"密码。8-32位字符，需包括数字与英文字母。",Toast.LENGTH_SHORT).show();
                return false;
            }else{

                return  b;
            }

        }

    }
    public static boolean isPassWordEquality(String password,String toPassword){

        if (password.equals(toPassword)){
            return true;
        }else {
            Toast.makeText(MyApp.applicationInstance(),"两次输入密码不一致，请检查",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public static boolean isNote(String note){
/*        Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher = pattern.matcher(note);
        boolean b = matcher.find();*/
            boolean b ;
            if (note.length()>0){
                b = false;
            }else{
                b= true;
            }
        if (!b){
            Toast.makeText(MyApp.applicationInstance(),"验证码不正确",Toast.LENGTH_SHORT).show();
            return false;
        }else {

            return true;

        }
    }
    public static boolean isNickName(String nickName){

        Pattern compile = Pattern.compile("[\\s\\S]{1,20}");
        Matcher matcher = compile.matcher(nickName);
        boolean b = matcher.find();
        if (!b){
            Toast.makeText(MyApp.applicationInstance(),"昵称不能大于20位,不能为空",Toast.LENGTH_SHORT).show();
            return false;
        }else{

            return b;
        }


    }
    public static String getMacAddr() {
        try {
            List<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface nif : all) {
                if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                byte[] macBytes = nif.getHardwareAddress();
                if (macBytes == null) {
                    return "";
                }

                StringBuilder res1 = new StringBuilder();
                for (byte b : macBytes) {
                    res1.append(String.format("%02X:",b));
                }

                if (res1.length() > 0) {
                    res1.deleteCharAt(res1.length() - 1);
                }
                return res1.toString();
            }
        } catch (Exception ex) {
        }
        return "02:00:00:00:00:00";
    }

}
