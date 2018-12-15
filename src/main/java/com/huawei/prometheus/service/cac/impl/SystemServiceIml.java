package com.huawei.prometheus.service.cac.impl;

import com.github.pagehelper.PageHelper;
import com.huawei.prometheus.dao.cac.SystemDao;
import com.huawei.prometheus.entity.cac.CodeConstant;
import com.huawei.prometheus.entity.cac.System;
import com.huawei.prometheus.service.cac.SystemService;
import com.huawei.prometheus.utils.TKException;
import com.huawei.prometheus.utils.TKUuidManager;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SystemServiceIml implements SystemService {
    @Resource
    private SystemDao syetemDao;

    public void addSystem(System system) {
        TKException.checkParamLoss(system);
        system.setSysID(TKUuidManager.getSimpleUuid());
        syetemDao.addSystem(system);
    }

    public void deleteSystem(String sysID) {
        System system = syetemDao.querySystem(sysID);
        if (null == system){
            throw new TKException(CodeConstant.StatusCode.STATUS_PARAMERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR, "request sysID is null, please check!");
        }
        syetemDao.updateSystem(system);
    }

    public void updateSystem(System system) {
        TKException.checkParamLoss(system);
        system = syetemDao.querySystem(system.getSysID());
        if (null == system){
            throw new TKException(CodeConstant.StatusCode.STATUS_PARAMERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR, "request sysID is null, please check!");
        }
        syetemDao.updateSystem(system);
    }

    public System querySystem(String sysID) {
        return  syetemDao.querySystem(sysID);
    }

    public List<System> querySystemList(){
        return syetemDao.querySystemList();
    }

    public List<System> querySystemList(String pageNumber,String pageSize){
        pageNumber = StringUtils.isEmpty(pageNumber)?"1":pageNumber;
        pageSize = StringUtils.isEmpty(pageSize)?"10":pageSize;
        PageHelper.startPage(Integer.valueOf(pageNumber), Integer.valueOf(pageSize));
        return syetemDao.querySystemList();
    }

}