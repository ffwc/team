package com.example.android.new_nds_study.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment_layout);
        ButterKnife.bind(this);

    }
}
