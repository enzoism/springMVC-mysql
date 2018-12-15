package com.huawei.prometheus.entity.cac;

public interface CodeConstant {

    interface StatusCode {
        Integer STATUS_OK = 200;
        Integer STATUS_ACCEPT = 201;
        Integer STATUS_ACCEPT2 = 204;
        Integer STATUS_INERERROR = 500;
        Integer STATUS_RATELIMIT_EXCEED = 507;
        Integer STATUS_PARAMERROR = 400;
        Integer UNAUTHORIZED = 401;
    }

    interface  HttpContentType{
        String APPLICATION_FORM_URLENCODED="application/x-www-form-urlencoded";
        String APPLICATION_JSON="application/json";
        String MULTIPART_FORM_DATA="multipart/form-data";
        String STRATEGIC_MERGE_PATCH = "application/strategic-merge-patch+json";
    }

    interface ErrorCode {
        Integer CODE_SUCCESS = 0;
        Integer CODE_FAILD = 40000;

        //1.1 token错误码：40001~40020
        Integer CODE_GET_TOKEN_ERROR = 40001;  // 获取token错误
        Integer CODE_TOKEN_INVALID_ERROR = 40002;  // token 无效
        Integer CODE_AUTH_ERROR = 40003;

        //1.2 数据库增删改查错误码：40021~40040
        Integer CODE_DATABASE_ADD_ERROR = 40021;
        Integer CODE_DATABASE_DELETE_ERROR = 40022;
        Integer CODE_DATABASE_UPDATE_ERROR = 40023;
        Integer CODE_DATABASE_FILTER_ERROR = 40024;

        Integer CODE_MODEL_HAS_EXISTED_ERR = 40025;
        Integer CODE_MODEL_UNIQUENESS_ERR = 40026;

        // 1.3 请求参数相关错误码
        Integer CODE_REQ_PARAMS_ERR = 40100;
        Integer CODE_REQ_PARAMS_ABSENCE = 40101;
        Integer CODE_REQ_REGION_PARAMS_ABSENCE = 40102;

        // 2. 部署流程错误码：42000~43999
        Integer CODE_DEPLOY_ERR = 42000;
        Integer CODE_DEPLOY_ERR_REPEATED_STACK = 42301;
        Integer CODE_DEPLOY_MODEL_NOT_EXIST = 42001;
        Integer CODE_DEPLOY_TASK_NOT_EXIST = 42002;
        Integer CODE_DEPLOY_TASK_ID_INVALID = 42003;
        Integer CODE_DEPLOY_READ_TASK_LOG_ERROR = 42004;
        Integer CODE_DEPLOY_GET_PKG_PARAMS_ERR = 42005;
        Integer CODE_DEPLOY_PKG_NOT_EXIT_ERR = 42006;
        Integer CODE_DEPLOY_MACROVAR_ERR = 42007;
        Integer CODE_DEPLOY_CFG_NOTEXIST_ERR = 42008;
        Integer CODE_CONFIG_RENDER_ERR = 42009;
        Integer CODE_UPGRADE_ERR = 42010;
        Integer CODE_DEPLOY_CREATE_STACK_ERR = 42011;
        Integer CODE_DEPLOY_ACTIVATE_STACK_ERR = 42011;
        Integer CODE_ROLLBACK_ERR = 43010;
        Integer CODE_GET_TEMPLATE_INPUTS_ERR = 43011;
        //  3. 主机业务错误码：44000~45999
        Integer CODE_DELETE_HOST_ERROR = 44001;

        // 4. 包业务错误码: 46000~47999
        Integer CODE_MULTI_PACKAGES_ERROR = 46001;  //# 查询得到多个包
        Integer CODE_PACKAGE_NOT_EXIT_IN_DB_ERR = 46002;
        Integer CODE_PACKAGE_MISSING_CLEAN_ERR = 46003;

        Integer CODE_SEND_ROLLBACK_MESSAGE_ERROR = 40022;  //# 发送回滚信息失败

        //sync模块错误码48000~49999
        Integer CODE_CLOUDOPS_RSP_ERR = 40006;
        Integer CODE_SEND_CLOUDOPS_REQUEST_ERR = 40007;
        Integer CODE_SEND_AGENT_REQUEST_ERR = 40008;
        Integer CODE_AGENT_RSP_ERR = 40009;
        Integer CODE_AGENT_TIME_OUT = 40010;
        Integer CODE_AGENT_SERVICE_ERR = 40030;
        Integer CODE_HTTP_COMMUNICATION_ERROR = 40040;
        Integer CODE_SDK_AGENT_COMMUNICATION_ERROR = 40041;

        // 文件错误码：50000~59999
        Integer CODE_FILE_SIZE_ERR = 50000;
        Integer CODE_FILE_OPEN_ERR = 50001;
        Integer CODE_KEY_FILE_ERR = 50002;
        Integer CODE_FILE_CONTENT_ERR = 50003;
        Integer CODE_KEY_NAME_ERR = 50004;
        Integer CODE_FILE_SHA256_ERR = 50005;

        //文件上传错误
        Integer UPLOAD_PKG_ERR = 60000;
        Integer UPLOAD_PKG_IO_ERR = 60006;
        Integer UPLOAD_PKG_BASE_IMG_ERR = 60001;
        Integer UPLOAD_PKG_IMG_ERR = 60002;
        Integer UPLOAD_PKG_CHART_ERR = 60003;
        Integer UPLOAD_PKG_BP_ERR = 60004;
        Integer UPLOAD_PKG_EXISTED= 60006;

        Integer UPLOAD_PKG_TEMLE_NOTFOUND= 60007;
        Integer UPLOAD_PKG_DB_REPEAT= 60008;

        //shell
        Integer UPLOAD_PKG_SHELL_ERR = 70001;


        Integer TEMPLATES_DELELE_ERR = 60005;



        //http上传错误
        Integer HTTP_MIIS_CONTENT_TYPE = 70001;


        //CMDB
        Integer GET_REGION_ERR = 80001;
        Integer GET_MY_SERVICE_TREE_ERR = 80002;
        Integer GET_NODE_INSTANCE_ERR = 80003;
        Integer GET_SERVICE_TREE_ERR = 80004;

        //namespace
        Integer GET_NAMESPACE_ERR = 90001;

        //DCM
        Integer GET_KV_ERR = 100001;

        Integer CODE_CMDB_SCHEMA_NOTFOUND_ERR= 10000001;
        Integer CODE_CMDB_PUSH_SCHEMA_FAILED= 10000002;

        //接口限流错误
        Integer ERROR_STATUS_RATELIMIT_EXCEED = 70001;


    }

    interface DP_STATUS {
        String ING = "ING";
        String SUCCEEDED = "SUCCEEDED";
        String FAILED = "FAILED";
    }

    interface RESTART_STATUS {
        String ING = "ING";
        String SUCCEEDED = "SUCCEEDED";
        String FAILED = "FAILED";
    }

    interface DP_TYPE {
        String INSTALL = "INSTALL";
        String UPGRADE = "UPGRADE";
        String RETRY = "RETRY";
        String CANCEL = "CANCEL";
        String ROLLBACK = "ROLLBACK";
        String UNINSTALL = "UNINSTALL";
    }

    interface PKG_STATUS {
        String UPLOADING = "UPLOADING";
        String FINISH = "FINISH";
        String FAILED = "FAILED";
        String FORMAT_ERR = "FORMAT_ERR";
        String NETWORK_ERR = "NETWORK_ERR";
        String LOCALFILE_ERR = "LOCALFILE_ERR";
        String ANALYZE_ERR = "ANALYZE_ERR";
        String SHA256_ERR = "SHA256_ERR";
    }

    interface PKG_TYPE {
        String SINGLE_SERVICE = "SINGLE_SERVICE";
    }

    interface STACK_ERR {
        String STACK_NAME_EXISTED = "0203000";
    }

    interface REAPEAT_PACKAGE_TYPE {
        String IMAGE = "images";
        String CHART = "chart";
        String BLUEPRINT = "blueprint";
    }

    interface OPERATION_LEVEL {
        String LOW = "low";
        String HIGH = "high";
        String MIDDLE = "middle";
    }

    interface Domain {
        String PUBLIC = "om";
    }

    interface AgingPackage {
        int templateNum = 5;
        int month = 5;
    }

    interface BaseLine {
        String TRUE = "true";
        String FALSE = "false";
    }
}