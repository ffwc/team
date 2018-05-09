package com.example.android.new_nds_study.logion_refister.bean;

/**
 * Created by android on 2018/4/23.
 */

public class RegisterBean {

    /**
     * errcode : 0
     * data : {"access_token":"767dd21c359410bf63dfdcb9e228e312cddf0d96","refresh_token":"b025ad622a3d32a5a81aee5d73a5826adb8cbcd1","scope":"basic","token_type":"Bearer","expires_in":3600}
     * errmsg : ok
     */
    private int errcode;
    private DataEntity data;
    private String errmsg;

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrcode() {
        return errcode;
    }

    public DataEntity getData() {
        return data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public class DataEntity {
        /**
         * access_token : 767dd21c359410bf63dfdcb9e228e312cddf0d96
         * refresh_token : b025ad622a3d32a5a81aee5d73a5826adb8cbcd1
         * scope : basic
         * token_type : Bearer
         * expires_in : 3600
         */
        private String access_token;
        private String refresh_token;
        private String scope;
        private String token_type;
        private int expires_in;

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public void setRefresh_token(String refresh_token) {
            this.refresh_token = refresh_token;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public void setToken_type(String token_type) {
            this.token_type = token_type;
        }

        public void setExpires_in(int expires_in) {
            this.expires_in = expires_in;
        }

        public String getAccess_token() {
            return access_token;
        }

        public String getRefresh_token() {
            return refresh_token;
        }

        public String getScope() {
            return scope;
        }

        public String getToken_type() {
            return token_type;
        }

        public int getExpires_in() {
            return expires_in;
        }
    }
}
