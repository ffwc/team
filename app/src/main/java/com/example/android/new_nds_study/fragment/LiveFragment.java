package com.example.android.new_nds_study.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.activity.ClassnameActivity;

import java.util.List;


/**
 * Created by android on 2018/4/17.
 */

public class LiveFragment extends Fragment {


    private View view;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private NestedScrollView mNestedScrollView;
    private TextView textView;
    private Toolbar toolbar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.live_fragment, container, false);
        initview(view);
        return view;
    }


    private void initview(View view) {

        mTabLayout = (TabLayout) view.findViewById(R.id.tabs);
        textView = view.findViewById(R.id.dianji);
       /* toolbar = view.findViewById(R.id.toolbar);*/
        mNestedScrollView = (NestedScrollView)view.findViewById(R.id.nestedScrollView);
        /*mNestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                toolbar.setVisibility(View.VISIBLE);
            }
        });*/

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassnameActivity.class);
                startActivity(intent);

            }
        });
        //设置 NestedScrollView 的内容是否拉伸填充整个视图，
        //这个设置是必须的，否者我们在里面设置的ViewPager会不可见
        mNestedScrollView.setFillViewport(true);


    }

        class MyListAdapter extends RecyclerView.Adapter {
            private List<String> mStrings;
            public MyListAdapter(List<String> strings) {
                this.mStrings = strings;
            }
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View convertView = LayoutInflater.from(getActivity()).inflate(R.layout.item, parent, false);
                return new MyListViewHolder(convertView);
            }
            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                MyListViewHolder viewHolder = (MyListViewHolder) holder;
                viewHolder.mTextView.setText(mStrings.get(position));
            }
            @Override
            public int getItemCount() {
                return 3;
            }
        }

        class MyListViewHolder extends RecyclerView.ViewHolder {
            private TextView mTextView;
            public MyListViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView.findViewById(R.id.tv_content);
            }
        }
    }






