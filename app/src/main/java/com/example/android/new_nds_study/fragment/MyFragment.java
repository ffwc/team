package com.example.android.new_nds_study.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.IndentActivity;
import com.example.android.new_nds_study.activity.LoginActivity;
import com.example.android.new_nds_study.activity.SetActivity;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;
import com.example.android.new_nds_study.m_v_p.presnster.MyFragmentPresenter;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentPresenterListener;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;

/**
 * Created by android on 2018/4/17.
 */

public class MyFragment extends Fragment implements View.OnClickListener, MyFragmentPresenterListener {

    private View view;


    private String token;
    private MyFragmentPresenter myFragmentPresenter;
    private String uid;
    private SimpleDraweeView mMyFragmentIcon;
    /**
     * 登录账户
     */
    private TextView mMyFragmentUsername;
    /**  */
    private TextView mMyFragmentSignature;
    private ImageView mSetImageview;
    private RelativeLayout mMyFragmentLoginOruser;
    private LinearLayout mLayoutMessage;
    private LinearLayout mLayoutPlant;
    private LinearLayout mLayoutOrder;
    private RecyclerView mMyFragmentRecord;
    private LinearLayout mMyFragmentMeconstruction;
    private LinearLayout mMyFragmentMefriend;
    private LinearLayout mMyFragmentClearCache;
    private LinearLayout mMyFragmentAsregards;
    /**
     * 退出当前帐号
     */
    private TextView mMyFragmentFinsch;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        token = MyApp.sp.getString("token", "");
        uid = MyApp.sp.getString("uid", "");
        myFragmentPresenter = new MyFragmentPresenter(this);
        view = inflater.inflate(R.layout.my_fragment, container, false);


        /*  inttlistener(view);*/

        initView(view);
        return view;
    }





    /*private void inttlistener(View view) {
        mTextviewSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SetActivity.class);
                startActivity(intent);
            }
        });
        mLayoutOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OrderActivity.class);
                startActivity(intent);
            }
        });
    }*/


    @Override
    public void onResume() {
        super.onResume();

        tokenRequest();


    }

    @Override
    public void onSuccess(UserinfoBean userinfoBean) {

        if (userinfoBean != null) {
            ImagePipeline imagePipeline = Fresco.getImagePipeline();

            imagePipeline.evictFromMemoryCache(Uri.parse(userinfoBean.getAvatar()));
            imagePipeline.evictFromDiskCache(Uri.parse(userinfoBean.getAvatar()));

// combines above two lines
            imagePipeline.evictFromCache(Uri.parse(userinfoBean.getAvatar()));
            mMyFragmentIcon.setImageURI(Uri.parse(userinfoBean.getAvatar()));
            mMyFragmentUsername.setText(userinfoBean.getNickname());
            /*mMyFragmentUser.setText(userinfoBean.getUsername());*/
            String signature = userinfoBean.getSignature();
            if (signature == null) {
                mMyFragmentSignature.setText("你什么也没说~");
            } else {
                mMyFragmentSignature.setText(signature);
            }


        }
    }

    @Override
    public void onDefeated() {

    }

    private void initView(View view) {
        mMyFragmentIcon = (SimpleDraweeView) view.findViewById(R.id.my_fragment_icon);

        mMyFragmentUsername = (TextView) view.findViewById(R.id.my_fragment_username);

        mMyFragmentSignature = (TextView) view.findViewById(R.id.my_fragment_signature);

        mSetImageview = (ImageView) view.findViewById(R.id.set_imageview);

        mMyFragmentLoginOruser = (RelativeLayout) view.findViewById(R.id.my_fragment_loginOruser);
        mMyFragmentLoginOruser.setOnClickListener(this);
        mLayoutMessage = (LinearLayout) view.findViewById(R.id.layout_message);
        mLayoutMessage.setOnClickListener(this);
        mLayoutPlant = (LinearLayout) view.findViewById(R.id.layout_plant);
        mLayoutPlant.setOnClickListener(this);
        mLayoutOrder = (LinearLayout) view.findViewById(R.id.layout_order);
        mLayoutOrder.setOnClickListener(this);
        mMyFragmentRecord = (RecyclerView) view.findViewById(R.id.my_fragment_record);

        mMyFragmentMeconstruction = (LinearLayout) view.findViewById(R.id.my_fragment_meconstruction);
        mMyFragmentMeconstruction.setOnClickListener(this);
        mMyFragmentMefriend = (LinearLayout) view.findViewById(R.id.my_fragment_mefriend);
        mMyFragmentMefriend.setOnClickListener(this);
        mMyFragmentClearCache = (LinearLayout) view.findViewById(R.id.my_fragment_clearCache);
        mMyFragmentClearCache.setOnClickListener(this);
        mMyFragmentAsregards = (LinearLayout) view.findViewById(R.id.my_fragment_asregards);
        mMyFragmentAsregards.setOnClickListener(this);
        mMyFragmentFinsch = (TextView) view.findViewById(R.id.my_fragment_finsch);
        mMyFragmentFinsch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.my_fragment_icon:
                break;
            case R.id.my_fragment_username:
                break;
            case R.id.my_fragment_signature:
                break;
            case R.id.set_imageview:
                break;
            case R.id.my_fragment_loginOruser:
                String mUsername=mMyFragmentUsername.getText().toString();
                if(token.equals("")){
                    Intent loginActivity=new Intent(getActivity(),LoginActivity.class);
                    startActivity(loginActivity);
                }else{
                    Intent setActivity=new Intent(getActivity(),SetActivity.class);
                    startActivity(setActivity);
                }
                break;
            case R.id.layout_message:
                break;
            case R.id.layout_plant:
                break;
            case R.id.layout_order:

                Intent loginActivity=new Intent(getActivity(),IndentActivity.class);
                startActivity(loginActivity);
                break;
            case R.id.my_fragment_record:
                break;
            case R.id.my_fragment_meconstruction:
                break;
            case R.id.my_fragment_mefriend:
                break;
            case R.id.my_fragment_clearCache:
                break;
            case R.id.my_fragment_asregards:
                break;
            case R.id.my_fragment_finsch:

                exit();

                break;
        }
    }

    public void tokenRequest(){
        token = MyApp.sp.getString("token", "");
        if (token.equals("")){

            if (!mMyFragmentUsername.getText().toString().equals("登陆账户")){
                mMyFragmentUsername.setText("登录账户");
                mMyFragmentIcon.setImageURI("");
                mMyFragmentSignature.setText("你什么也没说~");
            }

        }else{
            myFragmentPresenter.getData(token);
        }
    }

    public void exit(){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("退出登录");
        builder.setMessage("是否退出登录");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                MyApp.edit.clear().commit();
                token = MyApp.sp.getString("token", "");
                tokenRequest();
                Toast.makeText(MyApp.applicationInstance(),"已退出",Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
