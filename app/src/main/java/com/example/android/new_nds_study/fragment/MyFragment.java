package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.LoginActivity;
import com.example.android.new_nds_study.activity.OrderActivity;
import com.example.android.new_nds_study.activity.SetActivity;
import com.example.android.new_nds_study.m_v_p.bean.OpenUser;
import com.example.android.new_nds_study.m_v_p.presnster.MyFragmentPresenter;
import com.example.android.new_nds_study.m_v_p.view.MyFragmentPresenterListener;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by android on 2018/4/17.
 */

public class MyFragment extends Fragment implements View.OnClickListener,MyFragmentPresenterListener {

    private View view;

    /**
     * my
     */
    private TextView mMyFragmentMe;
    /**
     * set
     */
    private TextView mTextviewSet;
    private SimpleDraweeView mMyFragmentIcon;
    /**
     * 昵称
     */
    private TextView mMyFragmentUsername;
    /**
     * 账号ID
     */
    private TextView mMyFragmentUser;
    /**
     * 你什么都没说~
     */
    private TextView mMyFragmentSignature;
    private LinearLayout mMyFragmentLoginOruser;
    private LinearLayout mLayoutMessage;
    private LinearLayout mLayoutPlant;
    private LinearLayout mLayoutOrder;
    private RecyclerView mMyFragmentRecord;
    private RelativeLayout mMyFragmentMeconstruction;
    private RelativeLayout mMyFragmentMefriend;
    private String token;
    private MyFragmentPresenter myFragmentPresenter;
    private String uid;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        token = MyApp.sp.getString("token", "");
        uid = MyApp.sp.getString("uid", "");
        myFragmentPresenter = new MyFragmentPresenter(this);
        view = inflater.inflate(R.layout.my_fragment, container, false);

        initView(view);
      /*  inttlistener(view);*/

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

    private void initView(View view) {
        mMyFragmentMe = (TextView) view.findViewById(R.id.my_fragment_me);
        mMyFragmentMe.setOnClickListener(this);
        mTextviewSet = (TextView) view.findViewById(R.id.textview_set);
        mTextviewSet.setOnClickListener(this);
        mMyFragmentIcon = (SimpleDraweeView) view.findViewById(R.id.my_fragment_icon);

        mMyFragmentUsername = (TextView) view.findViewById(R.id.my_fragment_username);

        mMyFragmentUser = (TextView) view.findViewById(R.id.my_fragment_user);

        mMyFragmentSignature = (TextView) view.findViewById(R.id.my_fragment_signature);

        mMyFragmentLoginOruser = (LinearLayout) view.findViewById(R.id.my_fragment_loginOruser);
        mMyFragmentLoginOruser.setOnClickListener(this);
        mLayoutMessage = (LinearLayout) view.findViewById(R.id.layout_message);
        mLayoutMessage.setOnClickListener(this);
        mLayoutPlant = (LinearLayout) view.findViewById(R.id.layout_plant);
        mLayoutPlant.setOnClickListener(this);
        mLayoutOrder = (LinearLayout) view.findViewById(R.id.layout_order);
        mLayoutOrder.setOnClickListener(this);
        mMyFragmentRecord = (RecyclerView) view.findViewById(R.id.my_fragment_record);
        mMyFragmentRecord.setOnClickListener(this);
        mMyFragmentMeconstruction = (RelativeLayout) view.findViewById(R.id.my_fragment_meconstruction);
        mMyFragmentMeconstruction.setOnClickListener(this);
        mMyFragmentMefriend = (RelativeLayout) view.findViewById(R.id.my_fragment_mefriend);
        mMyFragmentMefriend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.my_fragment_me:
                break;
            case R.id.textview_set:

                break;
            case R.id.my_fragment_icon:
                break;
            case R.id.my_fragment_username:
                break;
            case R.id.my_fragment_user:
                break;
            case R.id.my_fragment_signature:
                break;
            case R.id.my_fragment_loginOruser:
                String mUsername = mMyFragmentUsername.getText().toString();
                if (mUsername.equals("登录账户")){
                    Intent loginActivity = new Intent(getActivity(), LoginActivity.class);
                    startActivity(loginActivity);
                }else{
                    Intent setActivity = new Intent(getActivity(), SetActivity.class);
                    startActivity(setActivity);
                }

                break;
            case R.id.layout_message:
                break;
            case R.id.layout_plant:
                break;
            case R.id.layout_order:
                Intent orderActivity = new Intent(getActivity(), OrderActivity.class);
                startActivity(orderActivity);
                break;
            case R.id.my_fragment_record:
                break;
            case R.id.my_fragment_meconstruction:
                break;
            case R.id.my_fragment_mefriend:
                break;
        }
    }



    @Override
    public void onResume() {
        super.onResume();
        myFragmentPresenter.getData(uid);



    }

    @Override
    public void onSuccess(OpenUser openUser) {

        if (openUser!=null) {
            OpenUser.DataBean.ListBean listBean = openUser.getData().getList().get(0);
            mMyFragmentIcon.setImageURI(Uri.parse(listBean.getAvatar()));
            mMyFragmentUsername.setText(listBean.getNickname());
            mMyFragmentUser.setText(listBean.getUsername());
            String signature = listBean.getSignature();
            if (signature.equals("") || signature == null) {
                mMyFragmentSignature.setText("你什么也没说~");
            } else {
                mMyFragmentSignature.setText(signature);
            }



        }
    }

    @Override
    public void onDefeated() {

    }
}
