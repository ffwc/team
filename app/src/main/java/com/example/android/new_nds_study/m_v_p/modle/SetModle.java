package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.ProvinceandCity;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.view.SetModleListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManager;

import java.io.File;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class SetModle {

    public void getData(String token, final SetModleListener setModleListener) {
        HashMap<String, String> map = new HashMap<>();
        final String url = "/v1/oauth2/userinfo?token=" + token;
        RetrofitManager.get(url, map, new BaseObserver<UserinfoBean>() {
            @Override
            public void success(UserinfoBean userinfoBean) {
                if (setModleListener != null) {
                    setModleListener.success(userinfoBean);
                }
            }

            @Override
            public void failure(int code) {

            }
        });


    }
    public void accountUpdata(String token , String parameter, String type, String uid, String oid, final SetModleListener setModleListener){

        String url = "/v1/users/"+uid+"/update?token="+token;
        HashMap<String, String> map = new HashMap<>();
        map.put(type,parameter);

        map.put("oid",oid);

        RetrofitManager.post(url, map, new BaseObserver<UserUpdate>() {
            @Override
            public void success(UserUpdate userUpdate) {

                setModleListener.accountUpdata(userUpdate);

            }

            @Override
            public void failure(int code) {

            }
        });

    }

    public void district(final SetModleListener setModleListener){

        String url = "/v1/district/china";
        HashMap<String, String> map = new HashMap<>();
        RetrofitManager.get(url, map, new BaseObserver<ProvinceandCity>() {
            @Override
            public void success(ProvinceandCity provinceandCity) {
                setModleListener.district(provinceandCity);
            }

            @Override
            public void failure(int code) {

            }
        });
    }
        public void updataAvatar(String token , File parameter, String type, String uid, String oid, final SetModleListener setModleListener){


           String url  = "/v1/users/"+uid+"/update?token="+token;
            HashMap<String, RequestBody> map = new HashMap<>();

            RequestBody rtoken = RequestBody.create(MediaType.parse("text/plain"), token);

            RequestBody roid = RequestBody.create(MediaType.parse("text/plain"), oid);

            RequestBody file = RequestBody.create(MediaType.parse("application/octet-stream"), parameter);

            MultipartBody.Part formData = MultipartBody.Part.createFormData(type, parameter.getName(), file);

            map.put("token",rtoken);
            map.put("oid",roid);
            RetrofitManager.updataAvatar(url, map, formData,new BaseObserver<UserUpdate>() {
                @Override
                public void success(UserUpdate userUpdate) {

                    setModleListener.accountUpdata(userUpdate);



                }

                @Override
                public void failure(int code) {

                }
            });
/*

            RequestBody.create(MediaType.parse())
            RetrofitManager.updataAvatar(url,map,);*/

        }



}