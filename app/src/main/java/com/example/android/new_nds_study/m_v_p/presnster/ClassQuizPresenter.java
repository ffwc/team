package com.example.android.new_nds_study.m_v_p.presnster;

import com.example.android.new_nds_study.m_v_p.bean.QuizBean;
import com.example.android.new_nds_study.m_v_p.modle.ClassQuizModel;
import com.example.android.new_nds_study.m_v_p.view.QuizModelListener;
import com.example.android.new_nds_study.m_v_p.view.QuizPresenterListener;

import java.util.HashMap;

/**
 * Created by dell on 2018/6/19.
 */

public class ClassQuizPresenter {
    QuizPresenterListener quizPresenterListener;
    ClassQuizModel quizModel;

    public ClassQuizPresenter(QuizPresenterListener quizPresenterListener) {
        this.quizPresenterListener = quizPresenterListener;
        this.quizModel = new ClassQuizModel();
    }
    public void getData(String unit_id,String token){
        HashMap<String, String> map = new HashMap<>();
        //上拉加载，下拉刷新需要的page
//取出Shareprence里面的token
//map.put("token", MyApp.sp.getString("login_token",""));
        map.put("token",token);
        quizModel.getQuizModel(unit_id,map, new QuizModelListener() {
               @Override
               public void successe(QuizBean quizBean) {
                   quizPresenterListener.successe(quizBean);
               }
           });
    }
    public void Dech(){
        quizPresenterListener=null;
    }
}
