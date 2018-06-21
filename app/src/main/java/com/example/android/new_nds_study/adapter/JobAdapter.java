package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public class JobAdapter extends RecyclerView.Adapter {
    private Context context;

    public JobAdapter(Context context) {
        this.context = context;
    }

//    List<JobBean> list=new ArrayList<>();
//    public void setData(List<> list){
//        this.list.add(list);
//        notifyDataSetChanged();
//    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
