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
import com.example.android.new_nds_study.m_v_p.bean.OpenClassBean;
import com.example.android.new_nds_study.util.GlideRoundTransform;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/28.
 */
public class PayClassRecycler_adapter extends RecyclerView.Adapter<PayClassRecycler_adapter.MyViewHolder> {

    private static final String TAG = "BigPictureRecycler_adapter";

    private View view;
    private Context context;

    private List<OpenClassBean.DataBean.ListBean> openclasslist;


    public PayClassRecycler_adapter(Context context, List<OpenClassBean.DataBean.ListBean> openclasslist) {
        this.context = context;
        this.openclasslist = openclasslist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        String premium = openclasslist.get(viewType).getPremium();

            view = LayoutInflater.from(context).inflate(R.layout.nopay_class, parent, false);
            return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.payclasstext.setText(openclasslist.get(position).getTitle());
        holder.peoplenum.setText(openclasslist.get(position).getExt().getStudent_num() + "人已参加");
        holder.price.setText("¥" + openclasslist.get(position).getExt().getPrice());

        List<?> pictures = openclasslist.get(position).getPictures();
        String toString = pictures.toString();
        String substring = toString.substring(1, toString.length() - 1);

        String[] strs = substring.split(",");
        for (int j = 0, len = strs.length; j < len; j++) {
            System.out.println(strs[j].toString());
            Glide.with(context).load(strs[j].toString()).centerCrop().transform(new GlideRoundTransform(context,5)).into(holder.iv_item);
        }
    }


    @Override
    public int getItemCount() {
        return openclasslist.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_item;
        TextView payclasstext;
        TextView peoplenum;
        TextView price;


        public MyViewHolder(View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.imageView);
            payclasstext = itemView.findViewById(R.id.pay_class_text);
            peoplenum = itemView.findViewById(R.id.people_num_text);
            price = itemView.findViewById(R.id.price_text);


        }
    }

}
