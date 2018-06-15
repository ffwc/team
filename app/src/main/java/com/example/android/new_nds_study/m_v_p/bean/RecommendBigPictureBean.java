package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/6/8.
 */

public class RecommendBigPictureBean {


    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":6,"list":[{"weight":9,"title":"PMP项目管理认证重难点全解析","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0317/1527216207_219__6631624118582409648.jpg"],"created_at":"2018-05-25 10:56:55","recommend_type":2,"id":15,"url":"ndmapp://course/15"},{"weight":9,"title":"区块链革命：比特币底层技术如何改变货币、商业和世界","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0319/1527216974_816__timg_(2).jpeg"],"created_at":"2018-05-25 10:56:55","recommend_type":2,"id":14,"url":"ndmapp://course/14"},{"weight":8,"title":"交互式PPT","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0234/1526537903_222__asset-v1-CIE_CIE2017011_sp_type@asset_block@图片1.png"],"created_at":"2018-05-22 17:30:19","recommend_type":2,"id":13,"url":"ndmapp://course/13"},{"weight":7,"title":"PPT菜鸟的逆袭秘籍（视频+辅导）","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0236/1526547119_245__6.jpg"],"created_at":"2018-05-22 17:13:21","recommend_type":2,"id":12,"url":"ndmapp://course/12"},{"weight":6,"title":"人力资源管理","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-05-31 10:28:41","recommend_type":2,"id":16,"url":"ndmapp://course/16"},{"weight":4,"title":"手机摄影实战技巧与修图秘籍","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0262/1526870603_849__8AFB172F734350353BCA6A57687032BC.jpg"],"created_at":"2018-05-22 17:08:24","recommend_type":2,"id":9,"url":"ndmapp://course/9"}]}
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
         * total : 6
         * list : [{"weight":9,"title":"PMP项目管理认证重难点全解析","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0317/1527216207_219__6631624118582409648.jpg"],"created_at":"2018-05-25 10:56:55","recommend_type":2,"id":15,"url":"ndmapp://course/15"},{"weight":9,"title":"区块链革命：比特币底层技术如何改变货币、商业和世界","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0319/1527216974_816__timg_(2).jpeg"],"created_at":"2018-05-25 10:56:55","recommend_type":2,"id":14,"url":"ndmapp://course/14"},{"weight":8,"title":"交互式PPT","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0234/1526537903_222__asset-v1-CIE_CIE2017011_sp_type@asset_block@图片1.png"],"created_at":"2018-05-22 17:30:19","recommend_type":2,"id":13,"url":"ndmapp://course/13"},{"weight":7,"title":"PPT菜鸟的逆袭秘籍（视频+辅导）","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0236/1526547119_245__6.jpg"],"created_at":"2018-05-22 17:13:21","recommend_type":2,"id":12,"url":"ndmapp://course/12"},{"weight":6,"title":"人力资源管理","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-05-31 10:28:41","recommend_type":2,"id":16,"url":"ndmapp://course/16"},{"weight":4,"title":"手机摄影实战技巧与修图秘籍","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0262/1526870603_849__8AFB172F734350353BCA6A57687032BC.jpg"],"created_at":"2018-05-22 17:08:24","recommend_type":2,"id":9,"url":"ndmapp://course/9"}]
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
             * weight : 9
             * title : PMP项目管理认证重难点全解析
             * pictures : ["https://canvas.ndmooc.com/tmp/files/0000/0317/1527216207_219__6631624118582409648.jpg"]
             * created_at : 2018-05-25 10:56:55
             * recommend_type : 2
             * id : 15
             * url : ndmapp://course/15
             */

            private int weight;
            private String title;
            private String created_at;
            private int recommend_type;
            private int id;
            private String url;
            private List<String> pictures;

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
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

            public int getRecommend_type() {
                return recommend_type;
            }

            public void setRecommend_type(int recommend_type) {
                this.recommend_type = recommend_type;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<String> getPictures() {
                return pictures;
            }

            public void setPictures(List<String> pictures) {
                this.pictures = pictures;
            }
        }
    }
}
