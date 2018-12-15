package com.huawei.prometheus.service.cac;

import com.huawei.prometheus.entity.cac.System;

import java.math.BigDecimal;
import java.util.List;

public interface SystemService {
    // 添加系统信息
    void addSystem(System system);

    // 删除系统信息
    void deleteSystem(String sysID);

    // 更改系统信息
    void updateSystem(System system);

    // 查询系统信息
    System querySystem(String sysID);

    // 查询系统列表(不分页)
    List<System> querySystemList();

    // 查询系统列表(分页)
    List<System> querySystemList(String pageNumber,String pageSize);

}
