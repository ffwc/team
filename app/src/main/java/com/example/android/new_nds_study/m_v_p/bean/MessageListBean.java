package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * Created by android on 2018/4/23.
 */

public class MessageListBean {


    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":2,
     * "list":[{
     * "publisher":"ndsmooc",
     * "title":"234234",
     * "pictures":[],
     * "created_at":"2018-05-11 11:52:31",
     * "url":"http://admin.ndmooc.com/news/content?content_id=13"},
     * {"publisher":"ndsmooc",
     * "title":"sdasd",
     * "pictures":["http://ossstatic.ndmooc.com/mpoc/shake/uploadE-9A3F5034-8ECE-4BC6-88A7-58752EC98ED8.jpg"],
     * "created_at":"2018-05-08 16:15:20",
     * "url":"http://admin.ndmooc.com/news/content?content_id=13"}]}
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
         * total : 2
         * list : [{"publisher":"ndsmooc",
         * "title":"234234","pictures":[],
         * "created_at":"2018-05-11 11:52:31",
         * "url":"http://admin.ndmooc.com/news/content?content_id=13"},
         * {"publisher":"ndsmooc",
         * "title":"sdasd",
         * "pictures":["http://ossstatic.ndmooc.com/mpoc/shake/uploadE-9A3F5034-8ECE-4BC6-88A7-58752EC98ED8.jpg"],
         * "created_at":"2018-05-08 16:15:20",
         * "url":"http://admin.ndmooc.com/news/content?content_id=13"}]
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
             * publisher : ndsmooc
             * title : 234234
             * pictures : []
             * created_at : 2018-05-11 11:52:31
             * url : http://admin.ndmooc.com/news/content?content_id=13
             */

            private String publisher;
            private String title;
            private String created_at;
            private String url;
            private List<?> pictures;

            public String getPublisher() {
                return publisher;
            }

            public void setPublisher(String publisher) {
                this.publisher = publisher;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getPictures() {
                return pictures;
            }

            public void setPictures(List<?> pictures) {
                this.pictures = pictures;
            }
        }
    }
}
