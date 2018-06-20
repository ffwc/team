package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */

public class UnitBean {

    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":16,"list":[{"uid":"183","identity":"2","created_at":"2018-06-15 11:04:02","nickname":"学员2","avatar":"https://file.ndmooc.com/user/87/2f/183/avatar.jpg","tpuid_1":"138","signature":"","introduce":""},{"uid":"184","identity":"2","created_at":"2018-06-15 10:57:24","nickname":"学员3","avatar":"https://file.ndmooc.com/user/00/45/184/avatar.jpg","tpuid_1":"139","signature":"","introduce":""}]}
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
         * total : 16
         * list : [{"uid":"183","identity":"2","created_at":"2018-06-15 11:04:02","nickname":"学员2","avatar":"https://file.ndmooc.com/user/87/2f/183/avatar.jpg","tpuid_1":"138","signature":"","introduce":""},{"uid":"184","identity":"2","created_at":"2018-06-15 10:57:24","nickname":"学员3","avatar":"https://file.ndmooc.com/user/00/45/184/avatar.jpg","tpuid_1":"139","signature":"","introduce":""}]
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
             * uid : 183
             * identity : 2
             * created_at : 2018-06-15 11:04:02
             * nickname : 学员2
             * avatar : https://file.ndmooc.com/user/87/2f/183/avatar.jpg
             * tpuid_1 : 138
             * signature :
             * introduce :
             */

            private String uid;
            private String identity;
            private String created_at;
            private String nickname;
            private String avatar;
            private String tpuid_1;
            private String signature;
            private String introduce;

            public String getUid() {
                return uid;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "uid='" + uid + '\'' +
                        ", identity='" + identity + '\'' +
                        ", created_at='" + created_at + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", avatar='" + avatar + '\'' +
                        ", tpuid_1='" + tpuid_1 + '\'' +
                        ", signature='" + signature + '\'' +
                        ", introduce='" + introduce + '\'' +
                        '}';
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getIdentity() {
                return identity;
            }

            public void setIdentity(String identity) {
                this.identity = identity;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getTpuid_1() {
                return tpuid_1;
            }

            public void setTpuid_1(String tpuid_1) {
                this.tpuid_1 = tpuid_1;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
            }
        }
    }
}
