package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/20.
 */

public class EementClassBean {


    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":5,"list":[{"unit_id":"A303","type":"2","title":"第一集：万里如画","position":"1","status":"2","start_time":"2018-06-13 10:41:00","end_time":"2018-06-13 18:55:00","classroom":[{"id":"R-06BAF376-3B0F-11E8-A153-00163E117299","title":"新维空间一教室"},{"id":"R-C2DA7D32-3B10-11E8-97BF-00163E117299","title":"新维空间二教室"},{"id":"R-2B8D61A6-6955-11E8-884D-00163E117299","title":"中关村"}],"created_at":"2018-06-12 15:31:36","desc":"长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着\u201c黄金水道\u201d的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 ","cover":"http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg","classroom_start_time":"2018-06-15 16:02:29","starter":{"uid":"37","nickname":"火燎的金刚烟熏的太岁"},"classroom_end_time":"2018-06-15 16:12:37","event_id":197}]}
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
         * total : 5
         * list : [{"unit_id":"A303","type":"2","title":"第一集：万里如画","position":"1","status":"2","start_time":"2018-06-13 10:41:00","end_time":"2018-06-13 18:55:00","classroom":[{"id":"R-06BAF376-3B0F-11E8-A153-00163E117299","title":"新维空间一教室"},{"id":"R-C2DA7D32-3B10-11E8-97BF-00163E117299","title":"新维空间二教室"},{"id":"R-2B8D61A6-6955-11E8-884D-00163E117299","title":"中关村"}],"created_at":"2018-06-12 15:31:36","desc":"长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着\u201c黄金水道\u201d的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 ","cover":"http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg","classroom_start_time":"2018-06-15 16:02:29","starter":{"uid":"37","nickname":"火燎的金刚烟熏的太岁"},"classroom_end_time":"2018-06-15 16:12:37","event_id":197}]
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
             * unit_id : A303
             * type : 2
             * title : 第一集：万里如画
             * position : 1
             * status : 2
             * start_time : 2018-06-13 10:41:00
             * end_time : 2018-06-13 18:55:00
             * classroom : [{"id":"R-06BAF376-3B0F-11E8-A153-00163E117299","title":"新维空间一教室"},{"id":"R-C2DA7D32-3B10-11E8-97BF-00163E117299","title":"新维空间二教室"},{"id":"R-2B8D61A6-6955-11E8-884D-00163E117299","title":"中关村"}]
             * created_at : 2018-06-12 15:31:36
             * desc : 长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着“黄金水道”的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。
             * cover : http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg
             * classroom_start_time : 2018-06-15 16:02:29
             * starter : {"uid":"37","nickname":"火燎的金刚烟熏的太岁"}
             * classroom_end_time : 2018-06-15 16:12:37
             * event_id : 197
             */

            private String unit_id;
            private String type;
            private String title;
            private String position;
            private String status;
            private String start_time;
            private String end_time;
            private String created_at;
            private String desc;
            private String cover;
            private String classroom_start_time;
            private Object starter;
            private String classroom_end_time;
            private int event_id;
            private Object classroom;

            public String getUnit_id() {
                return unit_id;
            }

            public void setUnit_id(String unit_id) {
                this.unit_id = unit_id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
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

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getClassroom_start_time() {
                return classroom_start_time;
            }

            public void setClassroom_start_time(String classroom_start_time) {
                this.classroom_start_time = classroom_start_time;
            }

            public Object getStarter() {
                return starter;
            }

            public void setStarter(Object starter) {
                this.starter = starter;
            }

            public String getClassroom_end_time() {
                return classroom_end_time;
            }

            public void setClassroom_end_time(String classroom_end_time) {
                this.classroom_end_time = classroom_end_time;
            }

            public int getEvent_id() {
                return event_id;
            }

            public void setEvent_id(int event_id) {
                this.event_id = event_id;
            }

            public Object getClassroom() {
                return classroom;
            }

            public void setClassroom(Object classroom) {
                this.classroom = classroom;
            }

            public static class StarterBean {
                /**
                 * uid : 37
                 * nickname : 火燎的金刚烟熏的太岁
                 */

                private String uid;
                private String nickname;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }
            }

            public static class ClassroomBean {
                /**
                 * id : R-06BAF376-3B0F-11E8-A153-00163E117299
                 * title : 新维空间一教室
                 */

                private String id;
                private String title;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
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
}
