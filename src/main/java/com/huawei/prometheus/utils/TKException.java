package com.huawei.prometheus.utils;

import com.huawei.prometheus.entity.cac.CodeConstant;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;

public class TKException extends RuntimeException{
    public Integer getStatus() {
        return status;
    }

    public Integer getError_code() {
        return error_code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    private Integer status;
    private Integer error_code;
    private String message;

    public TKException(String message) {
        super(message);
    }

    public TKException(Integer status, Integer error_code, String message) {
        super(message);
        this.status = status;
        this.error_code = error_code;
        this.message = message;
    }

    public static void notNull(Object obj, String msg) {
        if (null == obj) {
            throw new TKException(CodeConstant.StatusCode.STATUS_INERERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR,msg);
        }
    }

    public static Collection isNotEmpty(Collection col, String msg) {
        if (CollectionUtils.isEmpty(col)) {
            throw new TKException(CodeConstant.StatusCode.STATUS_INERERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR,msg);
        }
        return col;
    }

    public static void requireTrue(boolean value, String message) {
        if (!value) {
            throw new TKException(CodeConstant.StatusCode.STATUS_INERERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR,message);
        }
    }
    // 检查参数是否丢失，丢失抛出：参数缺失异常
    public static void checkParamLoss(Object object, String message) {
        message = StringUtils.isEmpty(message)?"request param is loss":message;
        if (null == object) {
            throw new TKException(CodeConstant.StatusCode.STATUS_PARAMERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR, message);
        }
    }
    // 检查参数是否丢失，丢失抛出：参数缺失异常
    public static void checkParamLoss(Object object) {
        TKException.checkParamLoss(object,null);
    }
}