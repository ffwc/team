package com.example.android.new_nds_study.m_v_p.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyCoursesBean {

    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":2,"list":[{"course_id":"121","title":"新棋局·瞰长江","oid":"1","start_time":"2018-06-12 15:22:19","end_time":"2018-12-31 23:59:59","public":"1","published":"1","premium":"0","price":"0.00","creator":"37","grades":"0.0","comment_num":0,"created_at":"2018-06-12 15:22:03","updated_at":"2018-06-14 16:55:47","description":"长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着\u201c黄金水道\u201d的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 ","cover":"http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg","requirement":"","live":0,"student_num":16,"identity":"2","unit":{"unit_id":"A304","unit_title":"第二集：众生之愿","unit_description":"","unit_cover":""},"teachers":[{"teacher_uid":"37","teacher_identity":"1","teacher_created_at":"2018-06-12 15:22:03","teacher_nickname":"火燎的金刚烟熏的太岁","teacher_avatar":"https://file.ndmooc.com/user/79/64/37/avatar.jpg","teacher_tpuid_1":"47","teacher_signature":"我什么都没说~","teacher_introduce":""}],"config":{"period":6},"userinfo":{"user_identity":"2","user_created_at":"2018-06-15 21:41:40"}},{"course_id":"120","title":"计算机网络","oid":"1","start_time":"2018-06-12 11:59:00","end_time":"2018-10-31 11:59:00","public":"1","published":"1","premium":"0","price":"0.00","creator":"36","grades":"0.0","comment_num":0,"created_at":"2018-06-12 14:39:55","updated_at":"2018-06-13 09:32:11","description":"是计算机类专业的学位必修课程，是研究生入学统一考试中的计综科目之一。围绕参考模型，用7张思维导图，带你探讨信息从源到目的，穿越中间交换设备所遇到的问题和解决办法；涵盖基本原理和重要协议。不管你是对计算机网络感兴趣，还是考研，亦或是考取相关证书，本课程都是你不错的选择!\n\u2014\u2014 课程团队\n\n 课程概述\n      以层次模型为线索，一层一章（数据链路层两章），将内容有机地串在一起；主要包括网络相关术语和协议（TCP/IP协议栈）、网络标准、OSI参考模型、局域网技术（重点以太网）、物理层、数据链路层、网络层、传输层和应用层的基本功能和基本原理；重点学习网络层内容，包括各种路由协议的工作原理及其特点。在学习理论的基础上，初步培养网络编程、网络抓包工具使用、交换机和路由器操作等实际动手能力。\n      7张（章）思维导图，既有清晰的脉络，又有技术细节，收放自如，带你深入计算机网络的背后，看清信息的流转，囊括重要的原理、技术和协议。\n      除了满满的干货，你还将在课程中了解到网络发展进程中的名人及背后的奇闻轶事，比如：互联网之父温顿\u2022瑟夫（Vinton Gray Cerf）、以太网之父罗伯特\u2022梅特卡夫（Robert Metcalfe）、万维网之父蒂姆\u2022伯纳斯\u2022李（Tim Berners Lee）、CDMA之母海蒂\u2022拉玛（Hedy Lamarr）、第一台路由器发明者和思科创始者昂纳德\u2022波萨克（Leonard Bosack）和桑德拉\u2022勒纳（Sandy Lerner）夫妇、高锟、拉迪雅\u2022铂尔曼（Radia perlman）......也许没有他们的发明，网络世界会是另外一个样子，这些名字背后的传奇故事，是网络知识宝塔上闪亮的珠缀，将带给你无限的感叹和畅想。","cover":"https://canvas.ndmooc.com/tmp/files/0000/0486/1528853517_393__37428157-3b37-4494-9205-eb014108e995.jpg","requirement":"","live":0,"student_num":12,"identity":"2","unit":{"unit_id":"A317","unit_title":"10、物理层设备","unit_description":"","unit_cover":""},"teachers":[{"teacher_uid":"36","teacher_identity":"1","teacher_created_at":"2018-06-12 14:39:55","teacher_nickname":"古月","teacher_avatar":"https://file.ndmooc.com/user/ea/63/36/avatar.jpg","teacher_tpuid_1":"46","teacher_signature":"","teacher_introduce":""}],"config":{"period":30},"userinfo":{"user_identity":"2","user_created_at":"2018-06-18 20:49:03"}}]}
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
        @Override
        public String toString() {
            return "DataBean{" +
                    "total=" + total +
                    ", list=" + list +
                    '}';
        }

        /**
         * total : 2
         * list : [{"course_id":"121","title":"新棋局·瞰长江","oid":"1","start_time":"2018-06-12 15:22:19","end_time":"2018-12-31 23:59:59","public":"1","published":"1","premium":"0","price":"0.00","creator":"37","grades":"0.0","comment_num":0,"created_at":"2018-06-12 15:22:03","updated_at":"2018-06-14 16:55:47","description":"长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着\u201c黄金水道\u201d的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 ","cover":"http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg","requirement":"","live":0,"student_num":16,"identity":"2","unit":{"unit_id":"A304","unit_title":"第二集：众生之愿","unit_description":"","unit_cover":""},"teachers":[{"teacher_uid":"37","teacher_identity":"1","teacher_created_at":"2018-06-12 15:22:03","teacher_nickname":"火燎的金刚烟熏的太岁","teacher_avatar":"https://file.ndmooc.com/user/79/64/37/avatar.jpg","teacher_tpuid_1":"47","teacher_signature":"我什么都没说~","teacher_introduce":""}],"config":{"period":6},"userinfo":{"user_identity":"2","user_created_at":"2018-06-15 21:41:40"}},{"course_id":"120","title":"计算机网络","oid":"1","start_time":"2018-06-12 11:59:00","end_time":"2018-10-31 11:59:00","public":"1","published":"1","premium":"0","price":"0.00","creator":"36","grades":"0.0","comment_num":0,"created_at":"2018-06-12 14:39:55","updated_at":"2018-06-13 09:32:11","description":"是计算机类专业的学位必修课程，是研究生入学统一考试中的计综科目之一。围绕参考模型，用7张思维导图，带你探讨信息从源到目的，穿越中间交换设备所遇到的问题和解决办法；涵盖基本原理和重要协议。不管你是对计算机网络感兴趣，还是考研，亦或是考取相关证书，本课程都是你不错的选择!\n\u2014\u2014 课程团队\n\n 课程概述\n      以层次模型为线索，一层一章（数据链路层两章），将内容有机地串在一起；主要包括网络相关术语和协议（TCP/IP协议栈）、网络标准、OSI参考模型、局域网技术（重点以太网）、物理层、数据链路层、网络层、传输层和应用层的基本功能和基本原理；重点学习网络层内容，包括各种路由协议的工作原理及其特点。在学习理论的基础上，初步培养网络编程、网络抓包工具使用、交换机和路由器操作等实际动手能力。\n      7张（章）思维导图，既有清晰的脉络，又有技术细节，收放自如，带你深入计算机网络的背后，看清信息的流转，囊括重要的原理、技术和协议。\n      除了满满的干货，你还将在课程中了解到网络发展进程中的名人及背后的奇闻轶事，比如：互联网之父温顿\u2022瑟夫（Vinton Gray Cerf）、以太网之父罗伯特\u2022梅特卡夫（Robert Metcalfe）、万维网之父蒂姆\u2022伯纳斯\u2022李（Tim Berners Lee）、CDMA之母海蒂\u2022拉玛（Hedy Lamarr）、第一台路由器发明者和思科创始者昂纳德\u2022波萨克（Leonard Bosack）和桑德拉\u2022勒纳（Sandy Lerner）夫妇、高锟、拉迪雅\u2022铂尔曼（Radia perlman）......也许没有他们的发明，网络世界会是另外一个样子，这些名字背后的传奇故事，是网络知识宝塔上闪亮的珠缀，将带给你无限的感叹和畅想。","cover":"https://canvas.ndmooc.com/tmp/files/0000/0486/1528853517_393__37428157-3b37-4494-9205-eb014108e995.jpg","requirement":"","live":0,"student_num":12,"identity":"2","unit":{"unit_id":"A317","unit_title":"10、物理层设备","unit_description":"","unit_cover":""},"teachers":[{"teacher_uid":"36","teacher_identity":"1","teacher_created_at":"2018-06-12 14:39:55","teacher_nickname":"古月","teacher_avatar":"https://file.ndmooc.com/user/ea/63/36/avatar.jpg","teacher_tpuid_1":"46","teacher_signature":"","teacher_introduce":""}],"config":{"period":30},"userinfo":{"user_identity":"2","user_created_at":"2018-06-18 20:49:03"}}]
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
            @Override
            public String toString() {
                return "ListBean{" +
                        "course_id='" + course_id + '\'' +
                        ", title='" + title + '\'' +
                        ", oid='" + oid + '\'' +
                        ", start_time='" + start_time + '\'' +
                        ", end_time='" + end_time + '\'' +
                        ", publicX='" + publicX + '\'' +
                        ", published='" + published + '\'' +
                        ", premium='" + premium + '\'' +
                        ", price='" + price + '\'' +
                        ", creator='" + creator + '\'' +
                        ", grades='" + grades + '\'' +
                        ", comment_num=" + comment_num +
                        ", created_at='" + created_at + '\'' +
                        ", updated_at='" + updated_at + '\'' +
                        ", description='" + description + '\'' +
                        ", cover='" + cover + '\'' +
                        ", requirement='" + requirement + '\'' +
                        ", live=" + live +
                        ", student_num=" + student_num +
                        ", identity='" + identity + '\'' +
                        ", unit=" + unit +
                        ", config=" + config +
                        ", userinfo=" + userinfo +
                        ", teachers=" + teachers +
                        '}';
            }

            /**
             * course_id : 121
             * title : 新棋局·瞰长江
             * oid : 1
             * start_time : 2018-06-12 15:22:19
             * end_time : 2018-12-31 23:59:59
             * public : 1
             * published : 1
             * premium : 0
             * price : 0.00
             * creator : 37
             * grades : 0.0
             * comment_num : 0
             * created_at : 2018-06-12 15:22:03
             * updated_at : 2018-06-14 16:55:47
             * description : 长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着“黄金水道”的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 
             * cover : http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg
             * requirement : 
             * live : 0
             * student_num : 16
             * identity : 2
             * unit : {"unit_id":"A304","unit_title":"第二集：众生之愿","unit_description":"","unit_cover":""}
             * teachers : [{"teacher_uid":"37","teacher_identity":"1","teacher_created_at":"2018-06-12 15:22:03","teacher_nickname":"火燎的金刚烟熏的太岁","teacher_avatar":"https://file.ndmooc.com/user/79/64/37/avatar.jpg","teacher_tpuid_1":"47","teacher_signature":"我什么都没说~","teacher_introduce":""}]
             * config : {"period":6}
             * userinfo : {"user_identity":"2","user_created_at":"2018-06-15 21:41:40"}
             */

            private String course_id;
            private String title;
            private String oid;
            private String start_time;
            private String end_time;
           
            private String publicX;
            private String published;
            private String premium;
            private String price;
            private String creator;
            private String grades;
            private int comment_num;
            private String created_at;
            private String updated_at;
            private String description;
            private String cover;
            private String requirement;
            private int live;
            private int student_num;
            private String identity;
            private UnitBean unit;
            private ConfigBean config;
            private UserinfoBean userinfo;
            private List<TeachersBean> teachers;

            public String getCourse_id() {
                return course_id;
            }

            public void setCourse_id(String course_id) {
                this.course_id = course_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getOid() {
                return oid;
            }

            public void setOid(String oid) {
                this.oid = oid;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getPublicX() {
                return publicX;
            }

            public void setPublicX(String publicX) {
                this.publicX = publicX;
            }

            public String getPublished() {
                return published;
            }

            public void setPublished(String published) {
                this.published = published;
            }

            public String getPremium() {
                return premium;
            }

            public void setPremium(String premium) {
                this.premium = premium;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCreator() {
                return creator;
            }

            public void setCreator(String creator) {
                this.creator = creator;
            }

            public String getGrades() {
                return grades;
            }

            public void setGrades(String grades) {
                this.grades = grades;
            }

            public int getComment_num() {
                return comment_num;
            }

            public void setComment_num(int comment_num) {
                this.comment_num = comment_num;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getRequirement() {
                return requirement;
            }

            public void setRequirement(String requirement) {
                this.requirement = requirement;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public int getStudent_num() {
                return student_num;
            }

            public void setStudent_num(int student_num) {
                this.student_num = student_num;
            }

            public String getIdentity() {
                return identity;
            }

            public void setIdentity(String identity) {
                this.identity = identity;
            }

            public UnitBean getUnit() {
                return unit;
            }

            public void setUnit(UnitBean unit) {
                this.unit = unit;
            }

            public ConfigBean getConfig() {
                return config;
            }

            public void setConfig(ConfigBean config) {
                this.config = config;
            }

            public UserinfoBean getUserinfo() {
                return userinfo;
            }

            public void setUserinfo(UserinfoBean userinfo) {
                this.userinfo = userinfo;
            }

            public List<TeachersBean> getTeachers() {
                return teachers;
            }

            public void setTeachers(List<TeachersBean> teachers) {
                this.teachers = teachers;
            }

            public static class UnitBean {
                /**
                 * unit_id : A304
                 * unit_title : 第二集：众生之愿
                 * unit_description : 
                 * unit_cover : 
                 */

                private String unit_id;
                private String unit_title;
                private String unit_description;
                private String unit_cover;

                public String getUnit_id() {
                    return unit_id;
                }

                public void setUnit_id(String unit_id) {
                    this.unit_id = unit_id;
                }

                public String getUnit_title() {
                    return unit_title;
                }

                public void setUnit_title(String unit_title) {
                    this.unit_title = unit_title;
                }

                public String getUnit_description() {
                    return unit_description;
                }

                public void setUnit_description(String unit_description) {
                    this.unit_description = unit_description;
                }

                public String getUnit_cover() {
                    return unit_cover;
                }

                public void setUnit_cover(String unit_cover) {
                    this.unit_cover = unit_cover;
                }
            }

            public static class ConfigBean {
                /**
                 * period : 6
                 */

                private int period;

                public int getPeriod() {
                    return period;
                }

                public void setPeriod(int period) {
                    this.period = period;
                }
            }

            public static class UserinfoBean {
                /**
                 * user_identity : 2
                 * user_created_at : 2018-06-15 21:41:40
                 */

                private String user_identity;
                private String user_created_at;

                public String getUser_identity() {
                    return user_identity;
                }

                public void setUser_identity(String user_identity) {
                    this.user_identity = user_identity;
                }

                public String getUser_created_at() {
                    return user_created_at;
                }

                public void setUser_created_at(String user_created_at) {
                    this.user_created_at = user_created_at;
                }
            }

            public static class TeachersBean {
                /**
                 * teacher_uid : 37
                 * teacher_identity : 1
                 * teacher_created_at : 2018-06-12 15:22:03
                 * teacher_nickname : 火燎的金刚烟熏的太岁
                 * teacher_avatar : https://file.ndmooc.com/user/79/64/37/avatar.jpg
                 * teacher_tpuid_1 : 47
                 * teacher_signature : 我什么都没说~
                 * teacher_introduce : 
                 */

                private String teacher_uid;
                private String teacher_identity;
                private String teacher_created_at;
                private String teacher_nickname;
                private String teacher_avatar;
                private String teacher_tpuid_1;
                private String teacher_signature;
                private String teacher_introduce;

                public String getTeacher_uid() {
                    return teacher_uid;
                }

                public void setTeacher_uid(String teacher_uid) {
                    this.teacher_uid = teacher_uid;
                }

                public String getTeacher_identity() {
                    return teacher_identity;
                }

                public void setTeacher_identity(String teacher_identity) {
                    this.teacher_identity = teacher_identity;
                }

                public String getTeacher_created_at() {
                    return teacher_created_at;
                }

                public void setTeacher_created_at(String teacher_created_at) {
                    this.teacher_created_at = teacher_created_at;
                }

                public String getTeacher_nickname() {
                    return teacher_nickname;
                }

                public void setTeacher_nickname(String teacher_nickname) {
                    this.teacher_nickname = teacher_nickname;
                }

                public String getTeacher_avatar() {
                    return teacher_avatar;
                }

                public void setTeacher_avatar(String teacher_avatar) {
                    this.teacher_avatar = teacher_avatar;
                }

                public String getTeacher_tpuid_1() {
                    return teacher_tpuid_1;
                }

                public void setTeacher_tpuid_1(String teacher_tpuid_1) {
                    this.teacher_tpuid_1 = teacher_tpuid_1;
                }

                public String getTeacher_signature() {
                    return teacher_signature;
                }

                public void setTeacher_signature(String teacher_signature) {
                    this.teacher_signature = teacher_signature;
                }

                public String getTeacher_introduce() {
                    return teacher_introduce;
                }

                public void setTeacher_introduce(String teacher_introduce) {
                    this.teacher_introduce = teacher_introduce;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "MyCoursesBean{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                ", data=" + data +
                '}';
    }
}
