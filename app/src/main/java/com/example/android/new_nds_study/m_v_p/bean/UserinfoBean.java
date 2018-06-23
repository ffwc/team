package com.example.android.new_nds_study.m_v_p.bean;

import java.util.List;

public class UserinfoBean {


    /**
     * sub : ndm_520
     * uid : 520
     * tpuid_1 : 1024
     * tpuid_2 : a1bf-sde0-ea45-9daa
     * tpuid_3 : 100
     * scope : basic openid
     * username : larrys
     * phone : 159****4567
     * email : 066066@gmail.com
     * nickname : 小新
     * name : 小新
     * sex : 1
     * birthdate : 1994-02-24
     * avatar : https://file.ndmooc.com/face/c8/8f/c88fa8bd6b46b9c6515c45338759f2e6.jpg
     * faces : {"status":2,"upstatus":1,"updated_at":"2018-01-20 09:15:01"}
     * district : {"country":{"id":0,"name":"中国"},"province":{"id":110000,"name":"北京"},"city":{"id":110100,"name":"北京市"},"county":{"id":110101,"name":"海淀区"}}
     * tag : 眼镜男,选择恐惧症, 欧皇
     * signature : 学霸也会不想学习，学渣也会勇敢向前
     * ext : {"introduce":"三无人员"}
     * permission : {"organization":[{"oid":1,"role":1,"attribute":[{"id":1,"name":"院系","sub":{"id":3,"name":"社会科学学院","sub":{"id":4,"name":"国际关系学系系"}}},{"id":2,"name":"级别","sub":{"id":5,"name":"教授"}}]},{"oid":2,"role":2}]}
     */

    private String sub;
    private String uid;
    private String tpuid_1;
    private String tpuid_2;
    private String tpuid_3;
    private String scope;
    private String username;
    private String phone;
    private String email;
    private String nickname;
    private String name;
    private int sex;
    private String birthdate;
    private String avatar;
    private FacesBean faces;
    private DistrictBean district;
    private String tag;
    private String signature;
    private ExtBean ext;
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

    public String getTpuid_1() {
        return tpuid_1;
    }

    public void setTpuid_1(String tpuid_1) {
        this.tpuid_1 = tpuid_1;
    }

    public String getTpuid_2() {
        return tpuid_2;
    }

    public void setTpuid_2(String tpuid_2) {
        this.tpuid_2 = tpuid_2;
    }

    public String getTpuid_3() {
        return tpuid_3;
    }

    public void setTpuid_3(String tpuid_3) {
        this.tpuid_3 = tpuid_3;
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

    public FacesBean getFaces() {
        return faces;
    }

    public void setFaces(FacesBean faces) {
        this.faces = faces;
    }

    public DistrictBean getDistrict() {
        return district;
    }

    public void setDistrict(DistrictBean district) {
        this.district = district;
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

    public ExtBean getExt() {
        return ext;
    }

    public void setExt(ExtBean ext) {
        this.ext = ext;
    }

    public PermissionBean getPermission() {
        return permission;
    }

    public void setPermission(PermissionBean permission) {
        this.permission = permission;
    }

    public static class FacesBean {
        /**
         * status : 2
         * upstatus : 1
         * updated_at : 2018-01-20 09:15:01
         */

        private int status;
        private int upstatus;
        private String updated_at;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getUpstatus() {
            return upstatus;
        }

        public void setUpstatus(int upstatus) {
            this.upstatus = upstatus;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }

    public static class DistrictBean {
        /**
         * country : {"id":0,"name":"中国"}
         * province : {"id":110000,"name":"北京"}
         * city : {"id":110100,"name":"北京市"}
         * county : {"id":110101,"name":"海淀区"}
         */

        private CountryBean country;
        private ProvinceBean province;
        private CityBean city;
        private CountyBean county;

        public CountryBean getCountry() {
            return country;
        }

        public void setCountry(CountryBean country) {
            this.country = country;
        }

        public ProvinceBean getProvince() {
            return province;
        }

        public void setProvince(ProvinceBean province) {
            this.province = province;
        }

        public CityBean getCity() {
            return city;
        }

        public void setCity(CityBean city) {
            this.city = city;
        }

        public CountyBean getCounty() {
            return county;
        }

        public void setCounty(CountyBean county) {
            this.county = county;
        }

        public static class CountryBean {
            /**
             * id : 0
             * name : 中国
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class ProvinceBean {
            /**
             * id : 110000
             * name : 北京
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CityBean {
            /**
             * id : 110100
             * name : 北京市
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CountyBean {
            /**
             * id : 110101
             * name : 海淀区
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class ExtBean {
        /**
         * introduce : 三无人员
         */

        private String introduce;

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }
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
             * role : 1
             * attribute : [{"id":1,"name":"院系","sub":{"id":3,"name":"社会科学学院","sub":{"id":4,"name":"国际关系学系系"}}},{"id":2,"name":"级别","sub":{"id":5,"name":"教授"}}]
             */

            private int oid;
            private int role;
            private List<AttributeBean> attribute;

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

            public List<AttributeBean> getAttribute() {
                return attribute;
            }

            public void setAttribute(List<AttributeBean> attribute) {
                this.attribute = attribute;
            }

            public static class AttributeBean {
                /**
                 * id : 1
                 * name : 院系
                 * sub : {"id":3,"name":"社会科学学院","sub":{"id":4,"name":"国际关系学系系"}}
                 */

                private int id;
                private String name;
                private SubBeanX sub;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public SubBeanX getSub() {
                    return sub;
                }

                public void setSub(SubBeanX sub) {
                    this.sub = sub;
                }

                public static class SubBeanX {
                    /**
                     * id : 3
                     * name : 社会科学学院
                     * sub : {"id":4,"name":"国际关系学系系"}
                     */

                    private int id;
                    private String name;
                    private SubBean sub;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public SubBean getSub() {
                        return sub;
                    }

                    public void setSub(SubBean sub) {
                        this.sub = sub;
                    }

                    public static class SubBean {
                        /**
                         * id : 4
                         * name : 国际关系学系系
                         */

                        private int id;
                        private String name;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }
                    }
                }
            }
        }
    }
}
