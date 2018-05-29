package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/5/17.
 */

public class TabLayoutBean {

    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":9,"list":
     * [{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-86a026da-49ef-11e8-9a07-00163e117299.jpg",
     * "id":2,"title":"教育"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-8d21c8ce-49ef-11e8-be8a-00163e117299.jpg",
     * "id":3,"title":"财经"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-e760f6d0-4ea8-11e8-88ef-00163e117299.png",
     * "id":6,"title":"留学"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-8f69b9c2-5339-11e8-9125-00163e117299.jpg",
     * "id":9,"title":"娱乐"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-e21ae71c-533a-11e8-ad05-00163e117299.jpg",
     * "id":10,"title":"股票"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-35ad7bb0-533b-11e8-ad05-00163e117299.jpg",
     * "id":13,"title":"体育"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-37473420-533b-11e8-ad05-00163e117299.jpg",
     * "id":14,"title":"学术"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-954d1788-533b-11e8-ad05-00163e117299.jpg",
     * "id":16,"title":"音乐"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-85d26e52-54ee-11e8-a95f-00163e117299.jpg",
     * "id":17,"title":"11"}]}
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
         * total : 9
         * list : [{"
         * icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-86a026da-49ef-11e8-9a07-00163e117299.jpg","
         * id":2,"title":"教育"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-8d21c8ce-49ef-11e8-be8a-00163e117299.jpg",
         * "id":3,"title":"财经"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-e760f6d0-4ea8-11e8-88ef-00163e117299.png",
         * "id":6,"title":"留学"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-8f69b9c2-5339-11e8-9125-00163e117299.jpg",
         * "id":9,"title":"娱乐"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-e21ae71c-533a-11e8-ad05-00163e117299.jpg",
         * "id":10,"title":"股票"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-35ad7bb0-533b-11e8-ad05-00163e117299.jpg",
         * "id":13,"title":"体育"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-37473420-533b-11e8-ad05-00163e117299.jpg",
         * "id":14,"title":"学术"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-954d1788-533b-11e8-ad05-00163e117299.jpg",
         * "id":16,"title":"音乐"},{"icon":"http://ossstatic.ndmooc.com/mpoc/shake/upload/E-85d26e52-54ee-11e8-a95f-00163e117299.jpg",
         * "id":17,"title":"11"}]
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
             * icon : http://ossstatic.ndmooc.com/mpoc/shake/upload/E-86a026da-49ef-11e8-9a07-00163e117299.jpg
             * id : 2
             * title : 教育
             */

            private String icon;
            private int id;
            private String title;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
