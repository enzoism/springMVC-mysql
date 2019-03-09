package com.enzo.service;

import com.enzo.entity.Systems;

import java.util.List;

public interface SystemService {
    // 添加系统信息
    void addSystem(Systems systems);

    // 删除系统信息
    void deleteSystem(String sysID);

    // 更改系统信息
    void updateSystem(Systems systems);

    // 查询系统信息
    Systems querySystem(String sysID);

    // 查询系统列表(不分页)
    List<Systems> querySystemList();

    // 查询系统列表(分页)
    List<Systems> querySystemList(String pageNumber, String pageSize);

}
