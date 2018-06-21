package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.QuizBean;

import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class QuizAdapter extends RecyclerView.Adapter {
    Context context;
    List<QuizBean.DataBean.ListBean> list;

    public QuizAdapter(Context context, List<QuizBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.quizitem_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder= (MyViewHolder) holder;
        viewHolder.quiz_title.setText((position+1)+"、"+list.get(position).getTitle());
//        viewHolder.quiz_name.setText(list.get(position).getTitle());
//        viewHolder.quiz_time.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView quiz_title;
        private final TextView quiz_name;
        private final TextView quiz_time;
//        private final ImageView icon;
//        private final TextView teacher;
//        private final ImageView connect;

        public MyViewHolder(View itemView) {
            super(itemView);
            quiz_title = itemView.findViewById(R.id.quiz_title);
            quiz_name = itemView.findViewById(R.id.quiz_name);
            quiz_time = itemView.findViewById(R.id.quiz_time);
//            icon = itemView.findViewById(R.id.leagueritem_icon);
//            teacher = itemView.findViewById(R.id.leaguer_teacher);
//            connect = itemView.findViewById(R.id.leaguer_connect);
        }
    }
}
