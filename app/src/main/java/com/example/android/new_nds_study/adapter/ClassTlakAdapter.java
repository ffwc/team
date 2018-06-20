package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

/**
 * Created by dell on 2018/6/18.
 */

public class ClassTlakAdapter extends RecyclerView.Adapter<ClassTlakAdapter.MyTlakAdapter> {
 Context context;

 @Override
    public MyTlakAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.tlakadapter_layout, parent, false);
     MyTlakAdapter myTlakAdapter = new MyTlakAdapter(view);

     return myTlakAdapter;

 }

    @Override
    public void onBindViewHolder(MyTlakAdapter holder, int position) {
        if(position!=0){
        holder.firstView.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyTlakAdapter extends RecyclerView.ViewHolder{

        private final TextView createTime;
        private final ImageView zan;
        private final TextView tlakSize;
        private final TextView content;
        private final TextView nickName;
        private final ImageView icon;
        private final View firstView;

        public MyTlakAdapter(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.tlakitem_icon);
            nickName = itemView.findViewById(R.id.tlakNick_name);
            content = itemView.findViewById(R.id.tlakItem_cotent);
            tlakSize = itemView.findViewById(R.id.tlakCotent_size);
            createTime = itemView.findViewById(R.id.tlakItem_time);
            zan = itemView.findViewById(R.id.tlakItem_zan);
            firstView = itemView.findViewById(R.id.tlakFirst_view);
        }
    }
}
