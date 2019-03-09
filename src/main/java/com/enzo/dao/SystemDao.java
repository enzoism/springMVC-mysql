package com.enzo.dao;

import com.enzo.entity.Systems;

import java.util.List;

public interface SystemDao {
    void addSystem(Systems system);

    void updateSystem(Systems system);

    Systems querySystem(String sysID);

    List<Systems> querySystemList();

}
