package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/22.
 */

public class ClassListRecyAdapter extends RecyclerView.Adapter<ClassListRecyAdapter.MyViewHolder> {
    private static final String TAG = "ClassListRecyAdapter";
    private View view;
    private Context context;

    private List<ClassListBean.DataBean.ListBean> list;

    public ClassListRecyAdapter(Context context, List<ClassListBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.class_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_text.setText(list.get(position).getTitle());
        String start_time = list.get(position).getStart_time();

        String description = list.get(position).getDescription();
        if (!description.isEmpty()){
            holder.classlist_course.setText(description);

        }else{
            holder.classlist_course.setText("暂未开放");
        }

        if (start_time!=null){

            holder.tv_data.setText(start_time);
        }
        int live = list.get(position).getLive();
        if (live==0) {
            holder.tv_dress.setText("未开始");
        }else{
            holder.tv_data.setText("正在进行");
        }
        holder.simpleDraweeView.setImageURI(Uri.parse(list.get(position).getCover()));
    }

    @Override
    public int getItemCount() {

        return list.size();

    }

    @Override
    public int getItemViewType(int position) {
        if (list.size() <= 0) {
            return -1;
        }
        return super.getItemViewType(position);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {


        private final TextView classlist_course;
        TextView tv_text;
        TextView tv_data;
        TextView tv_dress;
        SimpleDraweeView simpleDraweeView;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_text = itemView.findViewById(R.id.classlist_text);
            tv_data = itemView.findViewById(R.id.classlist_data);
            tv_dress = itemView.findViewById(R.id.classlist_dress);
            simpleDraweeView = itemView.findViewById(R.id.class_list_item_img);
            classlist_course = itemView.findViewById(R.id.classlist_course);
        }
    }
}