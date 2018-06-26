package com.example.android.new_nds_study.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.StudentBean;
import com.example.android.new_nds_study.util.ToastUtils;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dell on 2018/6/24.
 */

public class AssignmentActivity extends AppCompatActivity {

    @BindView(R.id.assignment_title)
    TextView assignmentTitle;
    @BindView(R.id.assignment_state)
    TextView assignmentState;
    @BindView(R.id.assignment_data_title)
    TextView assignmentDataTitle;
    @BindView(R.id.assignment_data_type)
    TextView assignmentDataType;
    @BindView(R.id.assignment_data_date)
    TextView assignmentDataDate;
    @BindView(R.id.assignment_describe)
    TextView assignmentDescribe;
    @BindView(R.id.assignment_balk)
    TextView assignmentBalk;
    @BindView(R.id.assignment_data_content)
    RelativeLayout assignmentDataContent;
    @BindView(R.id.assignment_describe_content)
    TextView assignmentDescribeContent;
    private StudentBean studentBean;
    private TextView balk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_layout);
        ButterKnife.bind(this);
        initView();
        initData();

    }

    private void initView() {
        balk = findViewById(R.id.assignment_balk);
        balk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initData() {
    if(getIntent().getSerializableExtra("AssignMent")!=null){
        studentBean = (StudentBean) getIntent().getSerializableExtra("AssignMent");
        ToastUtils.showLong(this,studentBean.toString());
        assignmentDataTitle.setText(studentBean.getName());
        assignmentState.setText("待完成");
        assignmentState.setBackground(new ColorDrawable(R.drawable.course_icon_done));
        assignmentDataType.setText(studentBean.getGrading_type());
        assignmentDataDate.setText(studentBean.getLock_explanation());
//        assignmentDescribe.setText((String)studentBean.getLock_at());
        assignmentDescribeContent.setText(studentBean.getDescription());
    }

    }
}
