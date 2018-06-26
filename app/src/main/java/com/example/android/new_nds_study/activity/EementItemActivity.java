package com.example.android.new_nds_study.activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.ClassPageAdapter;
import com.example.android.new_nds_study.m_v_p.bean.EementClassBean;
import com.example.android.new_nds_study.util.ToastUtils;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dell on 2018/6/26.
 */

public class EementItemActivity extends FragmentActivity {
    @BindView(R.id.title_icon)
    SimpleDraweeView titleIcon;
    @BindView(R.id.class_name)
    TextView className;
    @BindView(R.id.class_type)
    TextView classType;
    @BindView(R.id.class_price)
    TextView classPrice;
    @BindView(R.id.class_roomNmae)
    TextView classRoomNmae;
    @BindView(R.id.class_size)
    TextView classSize;

    @BindView(R.id.class_vp)
    ViewPager classVp;
    List<TextView> list;
    @BindView(R.id.class_XQ)
    TextView classXQ;
    @BindView(R.id.class_Eement)
    TextView classEement;
    @BindView(R.id.class_shop)
    TextView classShop;
    private EementClassBean.DataBean.ListBean data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eementitem_layout);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        list.add(classXQ);
        list.add(classEement);
        list.get(0).setBackgroundColor(Color.YELLOW);
        classVp.setAdapter(new ClassPageAdapter(getSupportFragmentManager()));
        Intent intent = getIntent();
        if (intent.getSerializableExtra("data") != null) {
            data = (EementClassBean.DataBean.ListBean) intent.getSerializableExtra("data");
            titleIcon.setImageURI(Uri.parse(data.getCover()));
            className.setText(data.getTitle());
            if (data.getType().equals("0")) {
                classType.setText("已过期");
            } else if (data.getType().equals("1")) {
                classType.setText("暂未开始");
            }else{
                classType.setText("开放");
            }
//            classPrice.setText(data.getEvent_id());
            classRoomNmae.setText("南开大学");

            classSize.setText(data.getPosition() + "");
        }
    }

    @OnClick({R.id.class_XQ, R.id.class_Eement, R.id.class_shop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.class_XQ:
                classVp.setCurrentItem(0);
        ClickState(1);

                break;
            case R.id.class_Eement:
        ClickState(0);
                classVp.setCurrentItem(1);
                break;
            case R.id.class_shop:
                ToastUtils.showLong(this,"加入成功");
                break;
        }
    }

    public void ClickState(int postion) {
        for (int i = 0; i <list.size() ; i++) {
            if(postion==i) {
                list.get(postion).setBackgroundColor(Color.YELLOW);
            }else{
                list.get(i).setBackgroundColor(Color.BLACK);
            }
        }
    }
}
