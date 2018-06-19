package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

public class OpenUser {

    /**
     * errcode : 0
     * errmsg : OK
     * data : {"total":1,"list":[{"id":"301","username":"aaaaaaaaaa1","nickname":"aaaaaaaaaa1","sex":null,"avatar":"https://file.ndmooc.com/user/f3/78/301/avatar.jpg","tpuid_1":"241","tag":"","signature":""}]}
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
         * list : [{"id":"301","username":"aaaaaaaaaa1","nickname":"aaaaaaaaaa1","sex":null,"avatar":"https://file.ndmooc.com/user/f3/78/301/avatar.jpg","tpuid_1":"241","tag":"","signature":""}]
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
             * id : 301
             * username : aaaaaaaaaa1
             * nickname : aaaaaaaaaa1
             * sex : null
             * avatar : https://file.ndmooc.com/user/f3/78/301/avatar.jpg
             * tpuid_1 : 241
             * tag :
             * signature :
             */

            private String id;
            private String username;
            private String nickname;
            private Object sex;
            private String avatar;
            private String tpuid_1;
            private String tag;
            private String signature;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Object getSex() {
                return sex;
            }

            public void setSex(Object sex) {
                this.sex = sex;
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

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }
        }
    }
}
