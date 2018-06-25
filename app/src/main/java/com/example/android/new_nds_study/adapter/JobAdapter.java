package com.example.android.new_nds_study.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.AssignmentActivity;
import com.example.android.new_nds_study.m_v_p.bean.StudentBean;

import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.MyJOBHodler> implements View.OnClickListener {
    private Context context;
    private List<StudentBean> list;

    public JobAdapter(Context context, List<StudentBean> list) {

        this.context = context;
        this.list = list;
    }

    @Override
    public MyJOBHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jobfrag_lauyout, parent, false);
        MyJOBHodler myJOBHodler = new MyJOBHodler(view);
        return myJOBHodler;
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(MyJOBHodler holder, int position) {
        /**
         * 根据请求过来的数据改变背景及状态
         * 这里我简单的让他相隔一个改变
         */
        if (position % 2 == 0) {
            holder.jobitemState.setText("待完成");
            holder.jobitemState.setBackground(new ColorDrawable(R.drawable.course_icon_done));
        } else if (position % 3 == 0) {
            holder.jobitemState.setText("已过期");
            holder.jobitemState.setBackground(new ColorDrawable(R.drawable.course_icon_past));
        } else {
            holder.jobitemState.setText("已完成");
            holder.jobitemState.setBackground(new ColorDrawable(R.drawable.course_icon_readier));
        }
        String startTime = (String) list.get(position).getLock_at();
        holder.jobitemTitle.setText(list.get(position).getName());
        holder.jobitemType.setText("类别注明:" + list.get(position).getGrading_type());
        holder.jobitemTime.setText("日期时间:" + startTime);
        holder.jobitemContent.setText("内容" + list.get(position).getDescription());
        holder.itemView.setOnClickListener(this);

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    @Override
    public void onClick(View v) {
        context.startActivity(new Intent(context, AssignmentActivity.class));
    }

    class MyJOBHodler extends RecyclerView.ViewHolder {

        @BindView(R.id.jobitem_state)
        TextView jobitemState;
        @BindView(R.id.jobitem_title)
        TextView jobitemTitle;
        @BindView(R.id.jobitem_content)
        TextView jobitemContent;
        @BindView(R.id.jobitem_type)
        TextView jobitemType;
        @BindView(R.id.jobitem_time)
        TextView jobitemTime;

        MyJOBHodler(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
