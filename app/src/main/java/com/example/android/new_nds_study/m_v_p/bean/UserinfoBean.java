package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

public class UserinfoBean {


    /**
     * sub : ndm_301
     * uid : 301
     * scope : basic profile faces
     * username : aaaaaaaaaa1
     * phone :
     * email : tmp_aaaaaaaaaa1_ydzl@ndmooc.com
     * nickname : aaaaaaaaaa1
     * name :
     * sex : 0
     * birthdate :
     * avatar : https://file.ndmooc.com/user/f3/78/301/avatar.jpg
     * tpuid_1 : 241
     * faces : {}
     * permission : {"organization":[{"oid":1,"role":2}]}
     */

    private String sub;
    private String uid;
    private String scope;
    private String username;
    private String phone;
    private String email;
    private String nickname;
    private String name;
    private int sex;
    private String birthdate;
    private String avatar;
    private String tpuid_1;
    private FacesBean faces;
    private PermissionBean permission;

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public FacesBean getFaces() {
        return faces;
    }

    public void setFaces(FacesBean faces) {
        this.faces = faces;
    }

    public PermissionBean getPermission() {
        return permission;
    }

    public void setPermission(PermissionBean permission) {
        this.permission = permission;
    }

    public static class FacesBean {
    }

    public static class PermissionBean {
        private List<OrganizationBean> organization;

        public List<OrganizationBean> getOrganization() {
            return organization;
        }

        public void setOrganization(List<OrganizationBean> organization) {
            this.organization = organization;
        }

        public static class OrganizationBean {
            /**
             * oid : 1
             * role : 2
             */

            private int oid;
            private int role;

            public int getOid() {
                return oid;
            }

            public void setOid(int oid) {
                this.oid = oid;
            }

            public int getRole() {
                return role;
            }

            public void setRole(int role) {
                this.role = role;
            }
        }
    }
}
