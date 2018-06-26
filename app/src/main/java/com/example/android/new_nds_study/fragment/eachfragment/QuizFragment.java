package com.example.android.new_nds_study.fragment.eachfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.new_nds_study.MyApp;
import com.example.android.new_nds_study.R;
import com.example.android.new_nds_study.adapter.QuizAdapter;
import com.example.android.new_nds_study.m_v_p.bean.QuizBean;
import com.example.android.new_nds_study.m_v_p.presnster.ClassQuizPresenter;
import com.example.android.new_nds_study.m_v_p.view.QuizPresenterListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class QuizFragment extends Fragment implements QuizPresenterListener {

    private View view;
    private RecyclerView recycle;
    List<QuizBean.DataBean.ListBean> quizList=new ArrayList<>();
    private QuizAdapter quizAdapter;
    private TextView tlak_size;
    private TextView titleText;
    private String token;
    private String unit_id;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.quiz_layout, container, false);
        initView();
        initData();
        return view;
    }

    private void initData() {
        LinearLayoutManager manager = new LinearLayoutManager(MyApp.applicationInstance());
        quizAdapter = new QuizAdapter(getActivity(), quizList);
        titleText = view.findViewById(R.id.leaguer_title);
        titleText.setText("测验");
        recycle.setLayoutManager(manager);
        recycle.setAdapter(quizAdapter);

        ClassQuizPresenter classQuizPresenter = new ClassQuizPresenter(this);

        token = MyApp.sp.getString("token", null);
        unit_id = MyApp.sp.getString("unit_id", null);
        classQuizPresenter.getData("A304",token);

    }

    public void initView() {
        recycle = this.view.findViewById(R.id.quiz_recy);
        tlak_size = view.findViewById(R.id.tlak_size);
    }

    @Override
    public void successe(QuizBean quizBean) {
        if(quizBean.getData()!=null){
            List<QuizBean.DataBean.ListBean> list = quizBean.getData().getList();
            for (int i = 0; i <list.size() ; i++) {
//                LogUtil.i("list",list.get(i).toString());
            }
            quizList.addAll(list);
            tlak_size.setText("("+quizBean.getData().getTotal()+")");
            quizAdapter.notifyDataSetChanged();
        }
    }
}
