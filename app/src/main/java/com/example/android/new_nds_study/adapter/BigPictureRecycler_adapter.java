package com.example.android.new_nds_study.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.RecommendBigPictureBean;
import com.example.android.new_nds_study.util.GlideRoundTransform;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/28.
 */
public class BigPictureRecycler_adapter extends RecyclerView.Adapter<BigPictureRecycler_adapter.MyViewHolder> {

    private static final String TAG ="BigPictureRecycler_adapter" ;
    private View view;
    private Context context;

    private List<RecommendBigPictureBean.DataBean.ListBean> list;

    public BigPictureRecycler_adapter(Context context, List<RecommendBigPictureBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.big_picture, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        for (int i = 0; i <list.size() ; i++) {
            String url = list.get(position).getUrl();
            System.out.print(url) ;
            LogUtil.i(TAG,url+"");
        }
        List<?> pictures = list.get(position).getPictures();
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
        return list.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_item;


        public MyViewHolder(View itemView) {
            super(itemView);
            iv_item = itemView.findViewById(R.id.imageView);

        }
    }
}
