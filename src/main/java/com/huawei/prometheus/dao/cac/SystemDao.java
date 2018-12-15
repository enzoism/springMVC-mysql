package com.huawei.prometheus.dao.cac;

import com.huawei.prometheus.entity.cac.System;

import java.util.List;

public interface SystemDao {
    void addSystem(System system);

    void updateSystem(System system);

    System querySystem(String sysID);

    List<System> querySystemList();

}
