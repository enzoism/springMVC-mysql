package com.huawei.prometheus.utils;

import java.util.UUID;

public class TKUuidManager {
    public static String getUuid() {
        return UUID.randomUUID().toString();
    }
    public static String getSimpleUuid() {
        return UUID.randomUUID().toString().replace("-","");
    }

}