package com.enzo.service.impl;

import com.enzo.dao.SystemDao;
import com.enzo.entity.CodeConstant;
import com.enzo.entity.Systems;
import com.enzo.service.SystemService;
import com.enzo.utils.TKException;
import com.enzo.utils.TKUuidManager;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemServiceIml implements SystemService {
    @Resource
    private SystemDao syetemDao;

    public void addSystem(Systems systems) {
        TKException.checkParamLoss(systems);
        systems.setSysID(TKUuidManager.getSimpleUuid());
        syetemDao.addSystem(systems);
    }

    public void deleteSystem(String sysID) {
        Systems systems = syetemDao.querySystem(sysID);
        if (null == systems){
            throw new TKException(CodeConstant.StatusCode.STATUS_PARAMERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR, "request sysID is null, please check!");
        }
        syetemDao.updateSystem(systems);
    }
    public void updateSystem(Systems systems) {
        TKException.checkParamLoss(systems);
        systems = syetemDao.querySystem(systems.getSysID());
        if (null == systems){
            throw new TKException(CodeConstant.StatusCode.STATUS_PARAMERROR, CodeConstant.ErrorCode.CODE_REQ_PARAMS_ERR, "request sysID is null, please check!");
        }
        syetemDao.updateSystem(systems);
    }

    public Systems querySystem(String sysID) {
        return  syetemDao.querySystem(sysID);
    }

    public List<Systems> querySystemList(){
        return syetemDao.querySystemList();
    }

    public List<Systems> querySystemList(String pageNumber, String pageSize){
        pageNumber = StringUtils.isEmpty(pageNumber)?"1":pageNumber;
        pageSize = StringUtils.isEmpty(pageSize)?"10":pageSize;
        PageHelper.startPage(Integer.valueOf(pageNumber), Integer.valueOf(pageSize));
        return syetemDao.querySystemList();
    }

}