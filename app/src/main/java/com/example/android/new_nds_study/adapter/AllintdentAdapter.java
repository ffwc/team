package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.MineBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

public class AllintdentAdapter extends RecyclerView.Adapter<AllintdentAdapter.MyViewAdapter> {
    private Context context;
    private List<MineBean.DataBean.ListBean> list = new ArrayList<>();

    @Override
    public MyViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.allindent_item, null);

        return new MyViewAdapter(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewAdapter holder, int position) {


        holder.allindent_item_icon.setImageURI(Uri.parse(list.get(position).getProduct_cover()));
        /*holder.allindent_item_number.setText(list.get(position).getNickname());*/
        holder.allindent_item_stata.setText(list.get(position).getNickname());
        holder.allindent_item_title.setText(list.get(position).getProduct_title());
        holder.allindent_item_yprice.setText(list.get(position).getAmount());
        holder.allindent_item_price.setText(list.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewAdapter extends RecyclerView.ViewHolder{

        private final TextView allindent_item_number;
        private final TextView allindent_item_stata;
        private final TextView allindent_item_title;
        private final TextView allindent_item_yprice;
        private final TextView allindent_item_price;
        private final SimpleDraweeView allindent_item_icon;

        public MyViewAdapter(View itemView) {
            super(itemView);
            allindent_item_number = itemView.findViewById(R.id.allindent_item_number);
            allindent_item_stata = itemView.findViewById(R.id.allindent_item_stata);
            allindent_item_icon = itemView.findViewById(R.id.allindent_item_icon);
            allindent_item_title = itemView.findViewById(R.id.allindent_item_title);
            allindent_item_yprice = itemView.findViewById(R.id.allindent_item_yprice);
            allindent_item_price = itemView.findViewById(R.id.allindent_item_price);
        }
    }
}
