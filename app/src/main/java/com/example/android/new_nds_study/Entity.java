package com.example.android.new_nds_study;

import android.Manifest;

/**
 * Created by Administrator on 2017/3/13.
 */

public class Entity {



    /**
     * 日志打印开关
     */
    public static boolean LOG_PRINT = true;

    public static boolean LOG_SAVE = false;

    public static boolean CRASH_SAVE = false;

    public static final int PERMISSION_BLUE_CODE = 1;

    public static final int PERMISSION_REQUEST_CODE = 0;//请求码

    public static final String app_name = "NDS-Student-Android-Phone";

    public static final String APP_ID ="mpoc" ;
    public static final String APP_KEY ="7Ng2Zh7Zn1Lf" ;

    //APP需要获得的权限（需要动态申请的）
    public static final String[] PERMISSIONS = new String[]{
            Manifest.permission.WRITE_EXTERNAL_STORAGE,// 写入权限
            Manifest.permission.READ_EXTERNAL_STORAGE,  //读取权限
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_PHONE_STATE,
    };


    /**
     * recyclerView的页头，正常位，页尾
     */
    public static final int ITEM_VIEW_HEADER = 0;
    public static final int ITEM_VIEW_NORMAL = 1;
    public static final int ITEM_VIEW_FOOTER = 2;


    public class AliyunInfo {
        public static final String ACCESS_KEY_ID = "LTAITCEDARIg6zZC";
        public static final String ACCESS_KEY_SECRET = "VuldhpXzZV8O4J1nKSJnjDYRhgQBLI";
        public static final String ENDPOINT = "http://oss-cn-qingdao.aliyuncs.com";
        public static final String REGION_ID = "cn-qingdao";
        public static final String BUCKET_NAME = "ndmooc-nds";
        public static final String HOST = "http://ossstatic.ndmooc.com";
        public static final String OSS_UPLOAD_HOST = "http://ossstatic.ndmooc.com";
    }



    //头像允许的最大大小128kb
    public static final int AVATAR_IMAGE_MAX_LENGTH = 128;

    //其他图片允许的最大大小512kb
    public static final int COURSE_COVER_IMAGE_MAX_LENGTH = 256;

    /**
     * 图片缓存路径
     */
    public static final String CACHE_PATH_IMG = "/xinjie/cache";

    public static final String CACHE_PATH_LOG = "/xinjie/log/";

    /**
     * 文件缓存路径
     */
    public static final String CACHE_PATH_FILE = "/xinjie/cachefile";

    /**
     * 存储路径
     */
    public static final String DOWNLOAD_PATH = "/xinjie/download";

    /**
     * 用户名：838564516@qq.com，密码:123456
     * 用户名：admin@ndmooc.com 密码：ndmooc
     * 用户名：ldl1  密码：123456
     * 登录用unique_id 和 password
     */
    public static final String TEST_USER_NAME = "admin@ndmooc.com";
    public static final String TEST_PASS_WORD = "ndmooc";

    public class WeChat {
        public static final String WECHAT_ID = "wx316c4b2e932c1f7a";
        public static final String WECHAT_SECRET = "f4b93163f15bc0f32267e578fba22abe";
    }


    /**
     * 要打开的activity名称
     */
    public class ActivityName {
        public static final String ACTIVITY_NAME = "ACTIVITY_NAME";
        public static final String ACTIVITY_REGISTER_ACCOUNT = "ACTIVITY_REGISTER_ACCOUNT";
        public static final String ACTIVITY_FORGET_PASSWORD = "ACTIVITY_FORGET_PASSWORD";
        public static final String ACTIVITY_WEB_SITE_PERVIEW = "ACTIVITY_WEB_SITE_PERVIEW";
    }

     public static final String ACTIVITY_H5_URL = "ACTIVITY_H5_URL";

    public static final String MODULE_ID = "MODULE_ID";
    public static final String MODULE_INFO = "MODULE_INFO";

    public static final String LOGIN_STATUS = "LOGIN_STATUS";
    public static final String LOGIN_SINGLE_H5 = "LOGIN_SINGLE_H5";
    public static final String LOGIN_HOME_PAGE = "LOGIN_HOME_PAGE";

    /**
     * 课件类型
     */
    public class ContentType {
        public static final String DOC = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        public static final String PPT = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
        public static final String PPT_2 = "application/vnd.ms-powerpoint";
        public static final String PDF = "application/pdf";
        public static final String MP4 = "video/mp4";
        public static final String JPG = "image/jpeg";
    }

    public class FileType {

        public static final String JPG = "jpg";
        public static final String JPEG = "jpeg";
        public static final String PNG = "png";

        public static final String NDI = "ndi";
        public static final String PDF = "pdf";
        public static final String MP4 = "mp4";

        public static final String PPT = "ppt";
        public static final String PPT_X = "pptx";

        public static final String EXCEL = "xls";
        public static final String EXCEL_X = "xlsx";

        public static final String DOC = "doc";
        public static final String DOC_X = "docx";


    }

    public class upLoadFileType{
        public static final String FILE_TYPE = "FILE_TYPE";
        public static final String FILE = "file";
        public static final String BRAIN = "brain";
    }

    public static final String projectName = "test";

    public class TcpCommand{
        public static final String DEV_NDMOOC = "DEV_ndmooc";
    }


    /**
     * #define  DEV        @"nds_0_dev_server"
     #define  TEST       @"nds_0_test_server"
     #define  ONLINE     @"nds_0_online_server"
     */

    public class ProjectStatus{
        public static final String UDP_SPOC_DEV = "nds_0_online_server";
        public static final String UDP_BROADCASR_DEV = "nds_0_online_server";

    }



    public class CommandClass{
        public static final String CLASSES_ONLINE_REGISTER = "classes_online_register";

    }

    public class CommandType{
        public static final String UP = "up";
        public static final String DOWN = "down";
        public static final String LEFT = "left";
        public static final String RIGHT = "right";
        public static final String CANCEL = "cancel";
        public static final String OK = "ok";
        public static final String ZOOMIN = "zoomin";
        public static final String ZOOMOUT = "zoomout";
        public static final String MENU = "menu";
        public static final String HOME = "home";
        public static final String TOUCH = "touch";
    }

    public class CommandAction{
        public static final String SIGN = "SIGN";
        public static final String DEBATE_JOIN = "DEBATE-JOIN";
        public static final String DEBATE_SUPPORT_A = "DEBATE-SUPPORT-A";
        public static final String DEBATE_SUPPORT_B = "DEBATE-SUPPORT-B";

        public static final String QUESTION_ANSWER = "QUESTION-ANSWER";

        public static final String DISPLAY = "DISPLAY";

        public static final String QUIZ_SUBMIT = "QUIZ-SUBMIT";
    }

    public class CommandLevel{
        public static final String NOMAL = "NOMAL";
        public static final String HIGH = "HIGH";
    }

    public class ResourceItemType{
        public static final String IMAGE = "1";
        public static final String VIDEO = "2";
        public static final String PPT = "3";
        public static final String WEBSITE = "4";
        public static final String PDF = "5";
        public static final String WORD = "6";
        public static final String EXCEL = "7";
        public static final String OTHER = "8";
    }

    /*********************************************************************************************/

    /**BASE_URL**/
//    public static final String BASE_URL = "http://10.1.1.200:3000";
//        public static final String BASE_URL = "http://192.168.0.188:3000";
    public static final String BASE_URL = "http://omcp.ndmooc.com";


    /**登录 ： 公网/局域网切换时，同步修改登录的json解析**/
//    public static final String LOGIN_URL = "/api/v2/auth/login";
    public static final String LOGIN_URL = "/api/v1/auth/mpoc/login";


    /**忘记密码时，获取机构的域名**/
    public static final String GET_DOMAIN_URL = "http://omcp.ndmooc.com/api/v1/user/domain";

    /**忘记密码URL,动态拼接机构的域名**/
    public static final String FORGOT_PASSWORD_URL = "/nds_app/user/tel_verify";

    /**APP检测更新url**/
    public static final String CHECK_UPDATE_APP_URL = BASE_URL + "/api/v1/version_check/app_name/NDS-Student-Android-Phone/app_ver";

    /**专家端url**/
    public static final String EXPERT_URL = "http://eduadmin.ndmooc.com";

    public static final String API_LEVEL = "/api/v2";

    /******************************************老师端接口*******************************************/

    //刷新Token
    public static final String REFRESH_TOKEN_URL = API_LEVEL + "/auth/token";

    //编辑课程时，选择课程列表
    public static final String GET_PLANS_COURSE_LIST_URL = API_LEVEL + "/plans/courses";

    public static final String UNDER_COURSE_INFO_URL = API_LEVEL + "/courses";

    public static final String CLASS_ROOM_URL = API_LEVEL + "/classrooms";

    public static final String GET_UPLOAD_FILE_URL = API_LEVEL + "/auth/create_upload_code";


    /*******************************************学生端接口*************************************************/

    //学生未加入的课程
    public static final String STUDENT_UNJOIN_COURSE_URL = "/nds_app/courses/student_courses";

    public static final String MODULE_BASE_URL = API_LEVEL + "/modules";

    public static final String STUDENT_SIGN_URL = API_LEVEL + "/signs";

    //***************************************查询和保存音频文件***********************************************
    public static final String SAVE_AUDIO="/users/self/panels";
    ///modules/:module_id/panels
    public static final String GET_AUDIO="/modules/";
    public static final String COURSE_EXAM_URL = BASE_URL + "/courses_quizzes";
    public static final String COMMENT_URL = BASE_URL + "/list_discussion_topics";
    public static final String COMMENT_REPLY_URL = BASE_URL + "/get_the_full_topic";
    public static final String COMMENT_AGREE_URL = BASE_URL + "/like_topic_entries";
    public static final String COMMENT_CREATE_REPLY_URL = BASE_URL + "/create_topic_entries";
    public static final String ALL_STUDENTS_URL = BASE_URL + "/courses_students";
    public static final String ALL_QUESTIONS_URL = BASE_URL + "/courses_quizzes_questions";
    public static final String ALL_QUESTIONS_STATISTICS_URL = BASE_URL + "/courses_quizzes_statistics";
    public static final String STUDENT_HISTORY_EXAM_INFO = BASE_URL + "/courses_quizzes_history";



    public static final String ACTION_FILE_DOWNLOAD_PROGRESS = "ACTION_FILE_DOWNLOAD_PROGRESS";
    public static final String FILE_DOWNLOAD = "FILE_DOWNLOAD";


    public static final String ACTION_FILE_UPLOAD_ALIYUN_PROGRESS = "ACTION_FILE_UPLOAD_ALIYUN_PROGRESS";
    public static final String FILE_UPLOAD_ALIYUN = "FILE_UPLOAD_ALIYUN";
    public static final String FILE_UPLOAD_ALIYUN_FILE_PATH = "FILE_UPLOAD_ALIYUN_FILE_PATH";

    /**微软转码url*/
    public static final String MICROSOFT_TRANSCODING_URL = "https://view.officeapps.live.com/op/view.aspx?src=";

    /**
     * message分类
     */
    //登录
    public static final int MESSAGE_LOGIN_SUCCESS = 1;
    public static final int MESSAGE_LOGIN_FAILD = 2;
    public static final int MESSAGE_LOGIN_ERROR = 3;

    //登录
    public static final int MESSAGE_CHECK_UPDATE_SUCCESS = 4;

    public static final int MESSAGE_GENERAL_EDIT_SAVE_CONTENT_SUCCESS = 5;
    public static final int MESSAGE_GENERAL_EDIT_SAVE_CONTENT_FAILD = 6;
    public static final int MESSAGE_GENERAL_EDIT_SAVE_CONTENT_ERROR = 7;


    //获取随堂测验
    public static final int MESSAGE_GET_COURSE_EXAM_SUCCESS = 11;
    public static final int MESSAGE_GET_COURSE_EXAM_FAILD = 12;
    public static final int MESSAGE_GET_COURSE_EXAM_ERROR = 13;

    //获取讨论信息
    public static final int MESSAGE_GET_COMMENT_SUCCESS = 14;
    public static final int MESSAGE_GET_COMMENT_FAILD = 15;
    public static final int MESSAGE_GET_COMMENT_ERROR = 16;

    //获取讨论信息的回复
    public static final int MESSAGE_GET_COMMENT_REPLY_SUCCESS = 17;
    public static final int MESSAGE_GET_COMMENT_REPLY_FAILD = 18;
    public static final int MESSAGE_GET_COMMENT_REPLY_ERROR = 19;

    //获取点赞信息的回复
    public static final int MESSAGE_GET_COMMENT_AGREE_SUCCESS = 20;
    public static final int MESSAGE_GET_COMMENT_AGREE_FAILD = 21;
    public static final int MESSAGE_GET_COMMENT_AGREE_ERROR = 22;

    //创建话题的回复
    public static final int MESSAGE_GET_COMMENT_CREATE_REPLY_SUCCESS = 23;
    public static final int MESSAGE_GET_COMMENT_CREATE_REPLY_FAILD = 24;
    public static final int MESSAGE_GET_COMMENT_CREATE_REPLY_ERROR = 25;


    //获取所有学员
    public static final int MESSAGE_GET_ALL_STUDENT_SUCCESS = 26;
    public static final int MESSAGE_GET_ALL_STUDENT_FAILD = 27;
    public static final int MESSAGE_GET_ALL_STUDENT_ERROR = 28;


    //获取某课程下的所有问题
    public static final int MESSAGE_GET_ALL_QUESTION_SUCCESS = 29;
    public static final int MESSAGE_GET_ALL_QUESTION_FAILD = 30;
    public static final int MESSAGE_GET_ALL_QUESTION_ERROR = 31;

    //获取某课程下的所有问题答案的统计
    public static final int MESSAGE_GET_ALL_QUESTION_STATISTICS_SUCCESS = 32;
    public static final int MESSAGE_GET_ALL_QUESTION_STATISTICS_FAILD = 33;
    public static final int MESSAGE_GET_ALL_QUESTION_STATISTICS_ERROR = 34;

    //获取某个学生的历史测验列表
    public static final int MESSAGE_GET_STUDENT_HISTORY_EXAM_SUCCESS = 35;
    public static final int MESSAGE_GET_STUDENT_HISTORY_EXAM_FAILD = 36;
    public static final int MESSAGE_GET_STUDENT_HISTORY_EXAM_ERROR = 37;


    //老师获取可选课程
    public static final int MESSAGE_GET_PLAN_COURSE_LIST_SUCCESS = 38;
    public static final int MESSAGE_GET_PLAN_COURSE_LIST_FAILD = 39;
    public static final int MESSAGE_GET_PLAN_COURSE_LIST_ERROR = 40;

    //老师创建课程
    public static final int MESSAGE_CREATE_COURSE_SUCCESS = 41;
    public static final int MESSAGE_CREATE_COURSE_FAILD = 42;
    public static final int MESSAGE_CREATE_COURSE_ERROR = 43;

    //获取课件列表
    public static final int MESSAGE_GET_COURSE_UNIT_LIST_SUCCESS = 44;
    public static final int MESSAGE_GET_COURSE_UNIT_LIST_FAILD = 45;
    public static final int MESSAGE_GET_COURSE_UNIT_LIST_ERROR = 46;

    //获取单元下可选的教室
    public static final int MESSAGE_GET_AVAILABLE_CLASSROOM_SUCCESS = 47;
    public static final int MESSAGE_GET_AVAILABLE_CLASSROOM_FAILD = 48;
    public static final int MESSAGE_GET_AVAILABLE_CLASSROOM_ERROR = 49;

    //获取学生签到消息
    public static final int MESSAGE_GET_STUDENT_SIGN_IN_SUCCESS = 50;
    public static final int MESSAGE_GET_STUDENT_SIGN_IN_FAILD = 51;
    public static final int MESSAGE_GET_STUDENT_SIGN_IN_ERROR = 52;


    //删除阿里云文件消息
    public static final int MESSAGE_DELETE_FILE_FORM_ALIYUN_SUCCESS = 53;
    public static final int MESSAGE_DELETE_FILE_FORM_ALIYUN_FAILD = 54;

    //获取课件列表
    public static final int MESSAGE_GET_COURSE_DETAIL_SUCCESS = 55;
    public static final int MESSAGE_GET_COURSE_DETAIL_FAILD = 56;
    public static final int MESSAGE_GET_COURSE_DETAIL_ERROR = 57;


    //创建一个单元
    public static final int MESSAGE_CREATE_MODULE_SUCCESS = 58;
    public static final int MESSAGE_CREATE_MODULE_FAILD = 59;
    public static final int MESSAGE_CREATE_MODULE_ERROR = 60;


    //获取单元下可选的班级
    public static final int MESSAGE_GET_AVAILABLE_CLASS_SUCCESS = 61;
    public static final int MESSAGE_GET_AVAILABLE_CLASS_FAILD = 62;
    public static final int MESSAGE_GET_AVAILABLE_CLASS_ERROR = 63;


    //保存编辑后的教室
    public static final int MESSAGE_SAVE_CLASS_ROOM_SUCCESS = 64;
    public static final int MESSAGE_SAVE_CLASS_ROOM_FAILD = 65;
    public static final int MESSAGE_SAVE_CLASS_ROOM_ERROR = 66;

    //上传单个文件到阿里云
    public static final int MESSAGE_SAVE_SINGLE_FILE_TO_ALIYUN_SUCCESS = 67;
    public static final int MESSAGE_SAVE_SINGLE_FILE_TO_ALIYUN_FAILD = 68;


    //获取在pc端上传文件的暗号和url
    public static final int MESSAGE_GET_UPLOAD_FILE_CODE_AND_URL_SUCCESS = 69;
    public static final int MESSAGE_GET_UPLOAD_FILE_CODE_AND_URL_FAILD = 70;
    public static final int MESSAGE_GET_UPLOAD_FILE_CODE_AND_URL_ERROR = 71;

    //上传单个文件到阿里云
    public static final int MESSAGE_UPLOAD_WEBSITE_URL_SUCCESS = 72;
    public static final int MESSAGE_UPLOAD_WEBSITE_URL_FAILD = 73;
    public static final int MESSAGE_UPLOAD_WEBSITE_URL_ERROR = 74;

    //获取单元下的资源列表
    public static final int MESSAGE_GET_RESOURCE_UNDER_MODULE_SUCCESS = 75;
    public static final int MESSAGE_GET_RESOURCE_UNDER_MODULE_FAILD = 76;
    public static final int MESSAGE_GET_RESOURCE_UNDER_MODULE_ERROR = 77;

    //把上传阿里云成功的url保存到服务器
    public static final int MESSAGE_SAVE_ALIYUN_FILE_PATH_SUCCESS = 78;
    public static final int MESSAGE_SAVE_ALIYUN_FILE_PATH_FAILD = 79;
    public static final int MESSAGE_SAVE_ALIYUN_FILE_PATH_ERROR = 80;

    public static final int MESSAGE_GET_ORGANIZATION_DOMAIN_SUCCESS = 81;
    public static final int MESSAGE_GET_ORGANIZATION_DOMAIN_FAILD = 82;
    public static final int MESSAGE_GET_ORGANIZATION_DOMAIN_ERROR = 83;

    public static final int MESSAGE_GET_EXPERT_COMMENT_SUCCESS = 84;
    public static final int MESSAGE_GET_EXPERT_COMMENT_FAILD = 85;
    public static final int MESSAGE_GET_EXPERT_COMMENT_ERROR = 86;

    public static final int MESSAGE_UPLOAD_IMAGE_TO_SERVER_SUCCESS = 87;
    public static final int MESSAGE_UPLOAD_IMAGE_TO_SERVER_FAILD = 88;

    public static final int MESSAGE_GET_MEETING_FOLDERS_SUCCESS = 89;
    public static final int MESSAGE_GET_MEETING_FOLDERS_FAILD = 90;
    public static final int MESSAGE_GET_MEETING_FOLDERS_ERROR = 91;

    public static final int MESSAGE_GET_MEETING_FILES_SUCCESS = 92;
    public static final int MESSAGE_GET_MEETING_FILES_FAILD = 93;
    public static final int MESSAGE_GET_MEETING_FILES_ERROR = 94;

    public static final int MESSAGE_GET_SCREEN_VUUID_SUCCESS = 95;
    public static final int MESSAGE_GET_SCREEN_VUUID_FAILD = 96;
    public static final int MESSAGE_GET_SCREEN_VUUID_ERROR = 97;

    public static final int MESSAGE_REFRESH_MEETING_FOLDER_LIST = 98;

    //老师获取大屏幕uuid
    public static final int MESSAGE_TEACHER_GET_NUUID_ERROW = 100;
    public static final int MESSAGE_TEACHER_GET_NUUID_SUCCESS = 1000;

    public static final int MESSAGE_SAVE_CAVAS_SUCCESS = 101;
    public static final int MESSAGE_UPDATE_CAVAS_SUCCESS = 1010;

    public static final int MESSAGE_GET_CAVARS_REFRESH_SUCCESS = 102;
    public static final int MESSAGE_GET_CAVARS_REFRESH_ERROW = 103;
    public static final int MESSAGE_GET_CAVARS_REFRESH_FAIL = 104;
    public static final int MESSAGE_GET_CAVARS_LOAD_SUCCESS = 105;
    public static final int MESSAGE_GET_CAVARS_LOAD_ERROW = 106;
    public static final int MESSAGE_GET_CAVARS_LOAD_FAIL = 107;
    //单个画板历史记录
    public static final int MESSAGE_HISTORY_SINGLE_CSNVSD_SUCCESS = 108;
    public static final int MESSAGE_HISTORY_SINGLE_CSNVSD_ERROW = 109;
    public static final int MESSAGE_HISTORY_SINGLE_CSNVSD_FAIL = 110;
    public static final int MESSAGE_HISTORY_SINGLE_RETURN = 111;
    public static final  int MESSAGE_GET_BLUETOOTH=112;
    public static final  int MESSAGE_GET_BOND_BLUETOOTH=113;
    //j0 state
    public static final  int MESSAGE_BLUETOOTH_CONNECT_SUCCESS=114;
    public static final  int MESSAGE_BLUETOOTH_DISCONNECT_SUCCESS=115;
    //texting tcp
    public static final  int MESSAGE_TCP_RECEIVE=116;
    //开始课程
    public static final  int MESSAGE_START_CALSS_SUCCESS=117;
    public static final  int MESSAGE_START_CALSS_ERROW=118;
    //获取课程
    public static final  int MESSAGE_GET_COURSE_SUCCESS=119;

    //stop课程
    public static final  int MESSAGE_CLOSE_CALSS_SUCCESS = 120;
    public static final  int MESSAGE_CLOSE_CALSS_ERROW = 121;
    //获取问题
    public static final  int MESSAGE_GET_ALLSTUDENT_SUCCESS=122;
    public static final  int MESSAGE_GET_ALLSTUDENT_ERROW=123;
    //删除画板
    public static final  int MESSAGE_DELETE_PANEL_SUCCESS=124;
    public static final  int MESSAGE_DELETE_PANEL_ERROW=125;
    //webheart
    public static final  int WEB_HEART=126;
    public static final  int WEB_ERROW_REPEAT=127;
    //全员投屏获取udp
    public static final  int MESSAGE_STUDENT_ALL_PAINT=128;
    //upload progress
    public static final  int MESSAGE_SAVE_SINGLE_FILE_TO_ALIYUN_PROGRESS=129;
    //获取音频uuid
    public static final  int MESSAGE_GET_AUDIO_UUID_FAIL=130;
    public static final  int MESSAGE_GET_AUDIO_UUID_SUCCESS=131;
    public static final  int MESSAGE_GET_AUDIO_UUID_ERROW=134;
    //获取音频uuid
    public static final  int MESSAGE_SAVE_AUDIO_UUID_FAIL=132;
    public static final  int MESSAGE_SAVE_AUDIO_UUID_SUCCESS=133;

    /*************************************https证书*************************************/

    public static final String SERVER_CERTIFICATION = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEAsC/IqPvKBr6/5hllnI4KWFnYUPZL1p6hSJ7q4hEa73A8xsXY\n" +
            "VvsPh+fLnn2U+8DIlyS4iU1ydJLHp5DVxbNHozJzBpbJqFQg+GNVnX3ni3WR/RDI\n" +
            "vuv0DVeD+uMY2fANYBXXHI2VO3uBAsxz1Qy2WcMeYXwsKcV+P6KjpygupqPUo6d9\n" +
            "fh3O94YhY5p6Vmx2YiSSYBeK/4fK3K/EZK+9QTAOrzQpEv8Fn0b9fDBwvcPV0hUX\n" +
            "+m8Zr5gVN9+HlegvIit2naSGOsG3HaEv/pHT++ALSKDcNAnxVRnBDcQSlLV13lUJ\n" +
            "F3fZ2YWnw9X8anqUC7hsEWx5GY3kuEqvJYVe/QIDAQABAoIBAHbDbx7Bw5gyYsbn\n" +
            "ncAfW0fdIFzK+aotegiq3ygOYbq/TKis2r0fNYPmMzKd8pyVgmGn5iDfrOR5wM3q\n" +
            "ar9+ry6KJlFtuXeXZjYpN6AXK8qtMQCGnNtd0EBiGtw20xytnUaE0mEz60GSag+J\n" +
            "5BbcH9t4FHWgL2Dk+MpKhsh55KB8ttlq5Okex5hmDkKDE1YOESbRvwRejvQ2hROM\n" +
            "0B4RZkw9G7lG1jnWOxPr7S6AXL9D/YkHsJzXDsIDa5vhUH0iouYW2LDr2EGCJh04\n" +
            "cBV/WCLQb3uGDvM+7ljcRPG8SJ3wb+qGvgJmgA2D02i/qOEcGF/EdzdSxhqep4jK\n" +
            "loO/ScECgYEA1ZMdCQ6BjAt+2TKoNXoRWIcgKiKEEoH52Lvvb8tlMwIOXNntu5SD\n" +
            "L4vTFKpNRw7t4QIfMB4qeUBZAbkoOOtuEsCRR8Pw9UhSOJHaOH5qzPix7IGu8E97\n" +
            "u5XytkbGmCFzN4gCVwk1ZvN42kQ1ZKvEE4NwuFUJdkTiF626sCCOR1ECgYEA0y9h\n" +
            "89v7aLcQusgOqLAw3XI6ql70/CDIGfkaejbH+r6ZWmjSI53+XELZV58BV1BdDx71\n" +
            "8sZfBNSNISPhw6CCU+pDodDxOPwQcvRBapw7XphdpGmyVONnLBl0yYbrtY5+jTMm\n" +
            "b98k8ctsXE9PLU5eLf2yWdpVr6kVXvoI6QCzie0CgYBnvsWc76H4QGFG6neROpGQ\n" +
            "elsifI/BWcffAzPFD31CMN5/NhFoTDUJdJd9c1iEivj8kwZJXm3tZleWIbYrKBnZ\n" +
            "HBe2T7UNwSrHdfoV9Tq2BJyRMVGkREfrkGRNLMYtghowwG26j6uULfLnu7hgBZwC\n" +
            "ipfHwu8Mt1tIe0izY60ZcQKBgQCCr9PCAOP3zTHBJIRNx5q1rza2r8STMgYibJEC\n" +
            "CFyAwupLlIpWGDOMDKJLIs7Fpamw7cvtzOyIJLChTX8sfGuqWlI4FQDx7qqPOLAy\n" +
            "tTPYOhnY4L/G4GK8W5R2EdRTqjaOUpT6rfBC4UvRZBLvSovlkhWInSBhcBUVjU1u\n" +
            "Q0zXkQKBgFwNJaOj/12RTQlaV5CYvV7ySDZ02TjQebGR+FJM+jd2kFl13Ub1TYb8\n" +
            "7k/5qM9DBTHL73XTz5VT97G0sohj6cV5luns3Opfhe7XveIrXb0F0/B7YRIYl86G\n" +
            "oAVLevOkPMFTBd30RNx9hH/SAs/7kj+kFfFyBfSoy0dXZ3S6jqyF\n" +
            "-----END RSA PRIVATE KEY-----\n";


}
