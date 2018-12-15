package com.huawei.prometheus.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultRespond {
    private int status = HttpStatus.SC_OK;

    private Object message;

    private int error_code = 0;

    public ResultRespond() {

    }

    public ResultRespond(Object message) {
        this.message = message;
    }

//    public ResultRespond(List list) {
//        this.status = HttpStatus.SC_OK;
//        Map<String, Object> resultMap = new HashMap<>();
//        resultMap.put("")
//
//    }


    public ResultRespond(int status, Object message, int error_code) {
        this.status = status;
        this.message = message;
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "ResultRespond{" +
                "status=" + status +
                ", message=" + message +
                ", error_code=" + error_code +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}