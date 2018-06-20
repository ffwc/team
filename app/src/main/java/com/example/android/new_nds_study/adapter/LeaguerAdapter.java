package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.UnitBean;
import com.example.android.new_nds_study.util.GlideRoundTransform;

import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class LeaguerAdapter extends RecyclerView.Adapter<LeaguerAdapter.MyLearguerHolder> {
    Context context;
    List<UnitBean.DataBean.ListBean> list;

    public LeaguerAdapter(Context context, List<UnitBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyLearguerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.leagueritem_layout, parent, false);
        MyLearguerHolder holder = new MyLearguerHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyLearguerHolder holder, int position) {
        Glide.with(context).load(list.get(position).getAvatar()).into(holder.icon);
        holder.nickNmae.setText(list.get(position).getNickname());
        Glide.with(context).load(list.get(position).getAvatar())
                .transform(new GlideRoundTransform(context, 60))
                .into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyLearguerHolder extends RecyclerView.ViewHolder {

        private final ImageView icon;
        private final TextView nickNmae;
        private final TextView teacher;
        private final ImageView connect;

        public MyLearguerHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.leagueritem_icon);
            nickNmae = itemView.findViewById(R.id.leaguer_nickNmae);
            teacher = itemView.findViewById(R.id.leaguer_teacher);
            connect = itemView.findViewById(R.id.leaguer_connect);
        }
    }
}
