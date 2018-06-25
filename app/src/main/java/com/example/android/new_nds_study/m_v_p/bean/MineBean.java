package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

public class MineBean {


    /**
     * errcode : 0
     * errmsg : ok
     * data : {"total":1,"list":[{"orderid":2018022832121,"uid":1001,"nickname":"小新","type":2,"product_id":1001,"product_title":"30天认知训练营","product_cover":"https://file.ndmooc.com/1001/2018/02/01/c88fa8bd6b46b9c6515c45338759f2e6.jpg","amount":"99.00","paytype":2,"transaction_id":"1217752501201407033233368018","payaccount":"wxd930ea5d5a258f4f","status":1,"created_at":"2018-01-20 09:15:01","completed_at":"2018-01-23 17:11:32"}]}
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
         * list : [{"orderid":2018022832121,"uid":1001,"nickname":"小新","type":2,"product_id":1001,"product_title":"30天认知训练营","product_cover":"https://file.ndmooc.com/1001/2018/02/01/c88fa8bd6b46b9c6515c45338759f2e6.jpg","amount":"99.00","paytype":2,"transaction_id":"1217752501201407033233368018","payaccount":"wxd930ea5d5a258f4f","status":1,"created_at":"2018-01-20 09:15:01","completed_at":"2018-01-23 17:11:32"}]
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
             * orderid : 2018022832121
             * uid : 1001
             * nickname : 小新
             * type : 2
             * product_id : 1001
             * product_title : 30天认知训练营
             * product_cover : https://file.ndmooc.com/1001/2018/02/01/c88fa8bd6b46b9c6515c45338759f2e6.jpg
             * amount : 99.00
             * paytype : 2
             * transaction_id : 1217752501201407033233368018
             * payaccount : wxd930ea5d5a258f4f
             * status : 1
             * created_at : 2018-01-20 09:15:01
             * completed_at : 2018-01-23 17:11:32
             */

            private long orderid;
            private int uid;
            private String nickname;
            private int type;
            private int product_id;
            private String product_title;
            private String product_cover;
            private String amount;
            private int paytype;
            private String transaction_id;
            private String payaccount;
            private int status;
            private String created_at;
            private String completed_at;

            public long getOrderid() {
                return orderid;
            }

            public void setOrderid(long orderid) {
                this.orderid = orderid;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getProduct_id() {
                return product_id;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public String getProduct_title() {
                return product_title;
            }

            public void setProduct_title(String product_title) {
                this.product_title = product_title;
            }

            public String getProduct_cover() {
                return product_cover;
            }

            public void setProduct_cover(String product_cover) {
                this.product_cover = product_cover;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public int getPaytype() {
                return paytype;
            }

            public void setPaytype(int paytype) {
                this.paytype = paytype;
            }

            public String getTransaction_id() {
                return transaction_id;
            }

            public void setTransaction_id(String transaction_id) {
                this.transaction_id = transaction_id;
            }

            public String getPayaccount() {
                return payaccount;
            }

            public void setPayaccount(String payaccount) {
                this.payaccount = payaccount;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getCompleted_at() {
                return completed_at;
            }

            public void setCompleted_at(String completed_at) {
                this.completed_at = completed_at;
            }
        }
    }
}
