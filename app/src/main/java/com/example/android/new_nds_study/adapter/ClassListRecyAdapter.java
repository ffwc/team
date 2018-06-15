package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.ClassListBean;

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

       // Glide.with(context).load(list.get(position).getPictures().get(position).toString()).into(holder.iv_item);
        holder.tv_text.setText(list.get(position).getTitle());

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

        ImageView iv_item;
        TextView tv_text;
        TextView tv_data;
        TextView tv_dress;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.classlist_image);
            tv_text = itemView.findViewById(R.id.classlist_text);
            tv_data = itemView.findViewById(R.id.classlist_data);
            tv_dress = itemView.findViewById(R.id.classlist_dress);
        }
    }
}