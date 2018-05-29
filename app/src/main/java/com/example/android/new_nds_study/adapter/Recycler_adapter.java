package com.example.android.new_nds_study.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.m_v_p.bean.MessageListBean;
import com.example.android.new_nds_study.util.LogUtil;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/28.
 */
public class Recycler_adapter extends RecyclerView.Adapter {
    private static final String TAG = "Recycler_adapter";
    //定义三种常量  表示三种条目类型
    public static final int TYPE_PULL_IMAGE = 0;
    public static final int TYPE_RIGHT_IMAGE = 1;
    public static final int TYPE_THREE_IMAGE = 2;
    private Context context;

    private List<MessageListBean.DataBean.ListBean> list;

    public Recycler_adapter(Context context, List<MessageListBean.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == TYPE_PULL_IMAGE) {
            view = View.inflate(viewGroup.getContext(), R.layout.find_recy_item_noimage, null);
            return new PullimageHolder(view);
        } else if (i == TYPE_RIGHT_IMAGE) {
            view = View.inflate(viewGroup.getContext(), R.layout.find_recy_item_oneimage, null);
            return new RightimageHolder(view);
        } else {
            view = View.inflate(viewGroup.getContext(), R.layout.find_recy_item_threeimage, null);
            return new ThreeimageHolder(view);
        }


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i) {

        List<?> pictures = list.get(i).getPictures();
        String toString = pictures.toString();
        String substring = toString.substring(1, toString.length() - 1);

        String[] strs = substring.split(",");
        for (int j = 0, len = strs.length; j < len; j++) {
            System.out.println(strs[j].toString());
        }
        // String s = pictures.get(i).toString();
        LogUtil.i(TAG + "图片的字符串是", toString);
        int size = pictures.size();
        if (size == 0) {
            LogUtil.i(TAG, size + "");

            PullimageHolder pullimageHolder = (PullimageHolder) viewHolder;
            pullimageHolder.no_item_text.setText(list.get(i).getTitle());
            ((PullimageHolder) viewHolder).cardview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "点击了第" + i + "条", Toast.LENGTH_LONG).show();

                }
            });

        } else if (size == 1) {
            LogUtil.i(TAG, size + "");
            RightimageHolder rightimageHolder = (RightimageHolder) viewHolder;
            rightimageHolder.one_item_text.setText(list.get(i).getTitle());
            for (int j = 0, len = strs.length; j < len; j++) {
                System.out.println(strs[j].toString());
                Glide.with(context).load(strs[j].toString()).into(rightimageHolder.one_item_image);

            }
            ((RightimageHolder) viewHolder).cardview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "点击了第" + i + "条", Toast.LENGTH_LONG).show();
                }
            });

        } else {
            String url = "[http://ossstatic.ndmooc.com/mpoc/shake/upload/E-689958AF-33C0-4E0C-875D-413785B378E5.jpg]";

            LogUtil.i(TAG, size + "");
            ThreeimageHolder threeimageHolder = (ThreeimageHolder) viewHolder;
            threeimageHolder.three_item_text.setText(list.get(i).getTitle());
            for (int k = 0, len = strs.length; k < len; k++) {
                System.out.println(strs[k].toString());
                Glide.with(context).load(url).into(threeimageHolder.three_item_imageone);
                Glide.with(context).load(url).into(threeimageHolder.three_item_imagetwo);
                Glide.with(context).load(url).into(threeimageHolder.three_item_imagethree);

            }
            ((ThreeimageHolder) viewHolder).cardview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "点击了第" + i + "条", Toast.LENGTH_LONG).show();

                }
            });

        }

    }

    @Override
    public int getItemCount() {
        if (list != null && list.size() > 0) {
            return list.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        List<?> pictures = list.get(position).getPictures();
        int size = pictures.size();
        if (size == 0) {
            return TYPE_PULL_IMAGE;
        } else if (size == 1) {
            return TYPE_RIGHT_IMAGE;
        } else {
            return TYPE_THREE_IMAGE;
        }
    }

    private class PullimageHolder extends RecyclerView.ViewHolder {


        private final TextView no_item_text;
        private final CardView cardview1;

        public PullimageHolder(View itemView) {
            super(itemView);
            cardview1 = itemView.findViewById(R.id.cardview);
            no_item_text = itemView.findViewById(R.id.recy_text);
        }
    }

    private class RightimageHolder extends RecyclerView.ViewHolder {


        private final TextView one_item_text;
        private final ImageView one_item_image;
        private final CardView cardview2;

        @SuppressLint("WrongViewCast")
        public RightimageHolder(View itemView) {
            super(itemView);
            cardview2 = itemView.findViewById(R.id.cardview);
            one_item_text = itemView.findViewById(R.id.recy_text);
            one_item_image = itemView.findViewById(R.id.recy_image);
        }
    }

    @SuppressLint("WrongViewCast")
    private class ThreeimageHolder extends RecyclerView.ViewHolder {
        private final CardView cardview3;
        private final TextView three_item_text;
        private final ImageView three_item_imageone;
        private final ImageView three_item_imagetwo;
        private final ImageView three_item_imagethree;

        public ThreeimageHolder(View itemView) {
            super(itemView);
            cardview3 = itemView.findViewById(R.id.cardview);
            three_item_text = itemView.findViewById(R.id.recy_text);
            three_item_imageone = itemView.findViewById(R.id.recy_imageone);
            three_item_imagetwo = itemView.findViewById(R.id.recy_imagetwo);
            three_item_imagethree = itemView.findViewById(R.id.recy_imagethree);
        }
    }

}