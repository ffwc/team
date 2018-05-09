package com.example.android.new_nds_study.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.new_nds_study.R;

/**
 * Created by Administrator on 2017/6/26.
 */

public class WebSiteSlideRecyclerViewHolder extends RecyclerView.ViewHolder {

    public ImageView icon;
    public TextView url;
    public LinearLayout itemlayout;

    public WebSiteSlideRecyclerViewHolder(View itemView) {
        super(itemView);

        icon = (ImageView) itemView.findViewById(R.id.web_site_icon);
        url = (TextView) itemView.findViewById(R.id.web_site_url);
        itemlayout = (LinearLayout) itemView.findViewById(R.id.added_web_site_item);
    }

}
