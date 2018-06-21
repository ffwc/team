package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class QuizBean {
    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":1,"list":[{"quiz_id":"90","title":"行政能力测验","description":"","time_limit":null,"show_correct_answers":true,"question_count":"4"}]}
     */

    private int errcode;
    private String errmsg;
    private DataBean data;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * total : 1
         * list : [{"quiz_id":"90","title":"行政能力测验","description":"","time_limit":null,"show_correct_answers":true,"question_count":"4"}]
         */

        private int total;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * quiz_id : 90
             * title : 行政能力测验
             * description :
             * time_limit : null
             * show_correct_answers : true
             * question_count : 4
             */

            private String quiz_id;
            private String title;
            private String description;
            private Object time_limit;
            private boolean show_correct_answers;
            private String question_count;

            public String getQuiz_id() {
                return quiz_id;
            }

            public void setQuiz_id(String quiz_id) {
                this.quiz_id = quiz_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public Object getTime_limit() {
                return time_limit;
            }

            public void setTime_limit(Object time_limit) {
                this.time_limit = time_limit;
            }

            public boolean isShow_correct_answers() {
                return show_correct_answers;
            }

            public void setShow_correct_answers(boolean show_correct_answers) {
                this.show_correct_answers = show_correct_answers;
            }

            public String getQuestion_count() {
                return question_count;
            }

            public void setQuestion_count(String question_count) {
                this.question_count = question_count;
            }
        }
    }
}
