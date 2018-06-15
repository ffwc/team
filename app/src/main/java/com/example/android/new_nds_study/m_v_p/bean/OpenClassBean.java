package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * @Author J & J
 * @Time 2018/6/8.
 */

public class OpenClassBean {


    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":15,"list":[{"premium":"1","weight":1,"title":"大数据时代","url":"ndmapp://course/96","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152724186737152724186737.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"199.00","student_num":2},"id":"96"},{"premium":"1","weight":1,"title":"交互式PPT","url":"ndmapp://course/64","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0234/1526537903_222__asset-v1-CIE_CIE2017011_sp_type@asset_block@图片1.png"],"created_at":"2018-5-31 15:15:30","ext":{"price":"0.01","student_num":2},"id":"64"},{"premium":"1","weight":1,"title":"开始新课程","url":"ndmapp://course/58","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"100.00","student_num":1},"id":"58"},{"premium":"1","weight":1,"title":"公开课B","url":"ndmapp://course/7","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"188.00","student_num":2},"id":"7"},{"premium":"1","weight":100,"title":"PhotoReading快速阅读深度课","url":"ndmapp://course/97","pictures":["https://file.ndmooc.com/resource/100/2018/05/31/5e11fe561c085b86eae8d9de3c3ec78c.jpg"],"created_at":"2018-5-31 17:45:10","ext":{"price":"99.00","student_num":5},"id":"97"},{"premium":"1","weight":1,"title":"区块链革命：比特币底层技术如何改变货币、商业和世界","url":"ndmapp://course/90","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0319/1527216974_816__timg_(2).jpeg"],"created_at":"2018-6-4 16:48:41","ext":{"price":"10.00","student_num":3},"id":"90"},{"premium":"1","weight":1,"title":"测试课","url":"ndmapp://course/86","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 10:7:43","ext":{"price":"123.00","student_num":1},"id":"86"},{"premium":"1","weight":1,"title":"创造你的音乐生活","url":"ndmapp://course/107","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0429/1528167062_858__22.jpg"],"created_at":"2018-6-11 12:12:29","ext":{"price":"99.00","student_num":6},"id":"107"},{"premium":"0","weight":1,"title":"测试讨论","url":"ndmapp://course/108","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 12:46:42","ext":{"price":"0.00","student_num":11},"id":"108"},{"premium":"0","weight":1,"title":"人人都能画素描","url":"ndmapp://course/85","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152721783314152721783314.jpg"],"created_at":"2018-6-11 13:3:32","ext":{"price":"0.00","student_num":7},"id":"85"},{"premium":"1","weight":1,"title":"公开课CC","url":"ndmapp://course/8","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/1528355548215283555482.jpg"],"created_at":"2018-6-11 13:4:22","ext":{"price":"1.00","student_num":3},"id":"8"},{"premium":"0","weight":1,"title":"你也能做动画","url":"ndmapp://course/55","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0235/1526547072_116__1525846090(1).jpg"],"created_at":"2018-6-11 14:12:11","ext":{"price":"0.00","student_num":13},"id":"55"},{"premium":"0","weight":1,"title":"管理会计学","url":"ndmapp://course/49","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0210/1526294980_265__E-494de69a-49f0-11e8-9a07-00163e117299.jpg"],"created_at":"2018-6-11 14:12:11","ext":{"price":"0.00","student_num":7},"id":"49"},{"premium":"0","weight":1,"title":"应用写作技能与规范","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0465/1528449501_365__1c9b1bee-67c2-40fc-9473-eae87b898b43.jpg"],"created_at":"2018-6-11 14:28:18","id":"110","ext":{"price":"0.00","student_num":5},"url":"ndmapp://course/110"},{"premium":"1","weight":1,"title":"人力资源管理","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 14:28:18","id":"98","ext":{"price":"190.98","student_num":2},"url":"ndmapp://course/98"}]}
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
         * total : 15
         * list : [{"premium":"1","weight":1,"title":"大数据时代","url":"ndmapp://course/96","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152724186737152724186737.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"199.00","student_num":2},"id":"96"},{"premium":"1","weight":1,"title":"交互式PPT","url":"ndmapp://course/64","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0234/1526537903_222__asset-v1-CIE_CIE2017011_sp_type@asset_block@图片1.png"],"created_at":"2018-5-31 15:15:30","ext":{"price":"0.01","student_num":2},"id":"64"},{"premium":"1","weight":1,"title":"开始新课程","url":"ndmapp://course/58","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"100.00","student_num":1},"id":"58"},{"premium":"1","weight":1,"title":"公开课B","url":"ndmapp://course/7","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-5-31 15:15:30","ext":{"price":"188.00","student_num":2},"id":"7"},{"premium":"1","weight":100,"title":"PhotoReading快速阅读深度课","url":"ndmapp://course/97","pictures":["https://file.ndmooc.com/resource/100/2018/05/31/5e11fe561c085b86eae8d9de3c3ec78c.jpg"],"created_at":"2018-5-31 17:45:10","ext":{"price":"99.00","student_num":5},"id":"97"},{"premium":"1","weight":1,"title":"区块链革命：比特币底层技术如何改变货币、商业和世界","url":"ndmapp://course/90","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0319/1527216974_816__timg_(2).jpeg"],"created_at":"2018-6-4 16:48:41","ext":{"price":"10.00","student_num":3},"id":"90"},{"premium":"1","weight":1,"title":"测试课","url":"ndmapp://course/86","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 10:7:43","ext":{"price":"123.00","student_num":1},"id":"86"},{"premium":"1","weight":1,"title":"创造你的音乐生活","url":"ndmapp://course/107","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0429/1528167062_858__22.jpg"],"created_at":"2018-6-11 12:12:29","ext":{"price":"99.00","student_num":6},"id":"107"},{"premium":"0","weight":1,"title":"测试讨论","url":"ndmapp://course/108","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 12:46:42","ext":{"price":"0.00","student_num":11},"id":"108"},{"premium":"0","weight":1,"title":"人人都能画素描","url":"ndmapp://course/85","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152721783314152721783314.jpg"],"created_at":"2018-6-11 13:3:32","ext":{"price":"0.00","student_num":7},"id":"85"},{"premium":"1","weight":1,"title":"公开课CC","url":"ndmapp://course/8","pictures":["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/1528355548215283555482.jpg"],"created_at":"2018-6-11 13:4:22","ext":{"price":"1.00","student_num":3},"id":"8"},{"premium":"0","weight":1,"title":"你也能做动画","url":"ndmapp://course/55","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0235/1526547072_116__1525846090(1).jpg"],"created_at":"2018-6-11 14:12:11","ext":{"price":"0.00","student_num":13},"id":"55"},{"premium":"0","weight":1,"title":"管理会计学","url":"ndmapp://course/49","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0210/1526294980_265__E-494de69a-49f0-11e8-9a07-00163e117299.jpg"],"created_at":"2018-6-11 14:12:11","ext":{"price":"0.00","student_num":7},"id":"49"},{"premium":"0","weight":1,"title":"应用写作技能与规范","pictures":["https://canvas.ndmooc.com/tmp/files/0000/0465/1528449501_365__1c9b1bee-67c2-40fc-9473-eae87b898b43.jpg"],"created_at":"2018-6-11 14:28:18","id":"110","ext":{"price":"0.00","student_num":5},"url":"ndmapp://course/110"},{"premium":"1","weight":1,"title":"人力资源管理","pictures":["https://file.ndmooc.com/resource/course_default.jpg"],"created_at":"2018-6-11 14:28:18","id":"98","ext":{"price":"190.98","student_num":2},"url":"ndmapp://course/98"}]
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
             * premium : 1
             * weight : 1
             * title : 大数据时代
             * url : ndmapp://course/96
             * pictures : ["http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152724186737152724186737.jpg"]
             * created_at : 2018-5-31 15:15:30
             * ext : {"price":"199.00","student_num":2}
             * id : 96
             */

            private String premium;
            private int weight;
            private String title;
            private String url;
            private String created_at;
            private ExtBean ext;
            private String id;
            private List<String> pictures;

            public String getPremium() {
                return premium;
            }

            public void setPremium(String premium) {
                this.premium = premium;
            }

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public ExtBean getExt() {
                return ext;
            }

            public void setExt(ExtBean ext) {
                this.ext = ext;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getPictures() {
                return pictures;
            }

            public void setPictures(List<String> pictures) {
                this.pictures = pictures;
            }

            public static class ExtBean {
                /**
                 * price : 199.00
                 * student_num : 2
                 */

                private String price;
                private int student_num;

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getStudent_num() {
                    return student_num;
                }

                public void setStudent_num(int student_num) {
                    this.student_num = student_num;
                }
            }
        }
    }
}
