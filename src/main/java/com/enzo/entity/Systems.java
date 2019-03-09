package com.enzo.entity;

import java.io.Serializable;

public class Systems implements Serializable {
    private String sysID;
    private String sysName;
    private String sysDescribe;

    public String getSysID() {
        return sysID;
    }

    public void setSysID(String sysID) {
        this.sysID = sysID;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysDescribe() {
        return sysDescribe;
    }

    public void setSysDescribe(String sysDescribe) {
        this.sysDescribe = sysDescribe;
    }

    @Override
    public String toString() {
        return "Systems{" +
                "sysID=" + sysID +
                ", sysName='" + sysName + '\'' +
                ", sysDescribe='" + sysDescribe + '\'' +
                '}';
    }
}