package com.example.android.new_nds_study.m_v_p.modle;

import com.example.android.new_nds_study.m_v_p.bean.QuizBean;
import com.example.android.new_nds_study.m_v_p.view.QuizModelListener;
import com.example.android.new_nds_study.network.BaseObserver;
import com.example.android.new_nds_study.network.RetrofitManagerAPI;

import java.util.Map;

import static com.example.android.new_nds_study.network.API.QUIZPATH;

/**
 * Created by dell on 2018/6/19.
 */

public class ClassQuizModel {

    public void getQuizModel(String unit_id, Map<String, String> map, final QuizModelListener quizModelListener) {

        String BasePath = QUIZPATH + unit_id + "/quizzes/list";
        RetrofitManagerAPI.get(BasePath, map, new BaseObserver<QuizBean>() {
            @Override
            public void success(QuizBean quizBean) {
                quizModelListener.successe(quizBean);
            }
            @Override
            public void failure(int code) {

            }
        });
    }
}
