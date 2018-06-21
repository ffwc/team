package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.EementClassBean;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.List;

/**
 * Created by dell on 2018/6/20.
 */

public class EementClassRecyAdapter extends RecyclerView.Adapter<EementClassRecyAdapter.MyEemnetClassHolder> {
    private Context context;
    private List<EementClassBean.DataBean.ListBean> list;

    public EementClassRecyAdapter(Context context, List<EementClassBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public MyEemnetClassHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.eementadapter_item, parent, false);
        MyEemnetClassHolder myEemnetClassHolder = new MyEemnetClassHolder(view);
        return myEemnetClassHolder;
    }

    @Override
    public void onBindViewHolder(MyEemnetClassHolder holder, int position) {

        holder.item_each_class_study_title.setText(list.get(position).getTitle());
        int type = Integer.parseInt(list.get(position).getStatus());
        switch (type) {
            case 0:
                holder.item_each_class_study_type.setText("未开始");
                holder.item_each_class_study_type.setTextColor(Color.CYAN);
                break;
            case 1:
                holder.item_each_class_study_type.setText("进行中");
                holder.item_each_class_study_type.setTextColor(Color.RED);
                break;
            case 2:
                holder.item_each_class_study_type.setText("以结束");
                holder.item_each_class_study_type.setTextColor(Color.BLUE);
                break;
        }
        String[] split = list.get(position).getClassroom_start_time().split(" ");
        String[] split1 = list.get(position).getClassroom_end_time().split(" ");
        holder.item_each_class_study_starttime.setText(split[0]);
        holder.item_each_class_study_stoptime.setText(split[1] + "~" + split1[1]);
        holder.item_each_class_study_g.setText("|");
    }

    @Override
    public int getItemCount() {
        LogUtil.i("adapter_size", list.size() + "");
        return list.size() == 0 ? 0 : list.size();
    }

    class MyEemnetClassHolder extends RecyclerView.ViewHolder {

        private final TextView item_each_class_study_title;
        private final TextView item_each_class_study_type;
        private final TextView item_each_class_study_starttime;
        private final TextView item_each_class_study_g;
        private final TextView item_each_class_study_stoptime;

        public MyEemnetClassHolder(View itemView) {
            super(itemView);
            item_each_class_study_title = itemView.findViewById(R.id.item_each_class_study_title);
            item_each_class_study_type = itemView.findViewById(R.id.item_each_class_study_type);
            item_each_class_study_starttime = itemView.findViewById(R.id.item_each_class_study_starttime);
            item_each_class_study_g = itemView.findViewById(R.id.item_each_class_study_g);
            item_each_class_study_stoptime = itemView.findViewById(R.id.item_each_class_study_stoptime);

        }
    }
}
