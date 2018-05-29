package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.MessageListBean;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/22.
 */

public class MyRecyAdapter extends RecyclerView.Adapter<MyRecyAdapter.MyViewHolder> {
    private static final String TAG = "MyRecyAdapter";
    private View view;
    private Context context;
    private List<MessageListBean.DataBean.ListBean> list;

    public MyRecyAdapter(Context context, List<MessageListBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
       // LogUtil.i(TAG, "listbean的长度" + list.size());
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //LogUtil.i(TAG, "开始加载布局");

            view = LayoutInflater.from(context).inflate(R.layout.find_recy_item_oneimage, parent, false);
            return new MyViewHolder(view);



    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //LogUtil.i("开始赋值", "");
        //LogUtil.i(TAG, list.get(position).getPictures().get(position).toString());
        List<?> pictures = list.get(position).getPictures();
        LogUtil.i(TAG+"pictures的长度",pictures.size()+"");
       // Glide.with(context).load(list.get(position).getPictures().get(position).toString()).into(holder.iv_item);
        holder.tv_item.setText(list.get(position).getTitle());

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
        TextView tv_item;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.recy_image);
            tv_item = itemView.findViewById(R.id.recy_text);
        }
    }
}