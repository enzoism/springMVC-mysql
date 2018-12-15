package com.huawei.prometheus.controller.cac;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huawei.prometheus.entity.cac.System;
import com.huawei.prometheus.service.cac.SystemService;
import com.huawei.prometheus.utils.TKPrintUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/api/v1/system")
@Api(tags = "系统管理") //swagger分类标题注解
public class SystemController {

    @Resource
    private SystemService systemService;


    //swagger返回值注解
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "系统错误"),
            @ApiResponse(code = 200, message = "0 成功,其它为错误,返回格式：{code:0,data[{}]},data中的属性参照下方Model")})
    @ApiOperation(httpMethod = "GET", value = "个人信息")//swagger 当前接口注解
    @RequestMapping(value = "/systems1", method = RequestMethod.GET)
    @ResponseBody
    public Object querySystemList(@RequestBody System system, HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<System> systemList = systemService.querySystemList();
        PageInfo<System> pageInfo = new PageInfo<System>(systemList);
        TKPrintUtils.printList(systemList);
        return pageInfo;
    }

    @RequestMapping(value = "/systems2", method = RequestMethod.GET)
    @ResponseBody
    public Object querySystemList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<System> systemList = systemService.querySystemList();
        PageInfo<System> pageInfo = new PageInfo<System>(systemList);
        TKPrintUtils.printList(systemList);
        return pageInfo;
    }

    @RequestMapping(value = "/systems3", method = RequestMethod.GET)
    @ResponseBody
    public Object querySystemList2(@RequestParam(value = "pageNumber",required = false) String pageNumber,
                                   @RequestParam(value = "pageSize",required = false) String pageSize,
                                   HttpServletRequest request,
                                   HttpServletResponse response) throws IOException {
        List<System> systemList = systemService.querySystemList(pageNumber,pageSize);
        PageInfo<System> pageInfo = new PageInfo<System>(systemList);
        TKPrintUtils.printList(systemList);
        return pageInfo;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object addSystem(System system, HttpServletRequest request, HttpServletResponse response) throws IOException {
        TKPrintUtils.printObject(system);
        systemService.addSystem(system);
        return "SUCCESS";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSystem(String sysID, HttpServletRequest request, HttpServletResponse response) throws IOException {
        systemService.deleteSystem(sysID);
        return "SUCCESS";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PATCH)
    @ResponseBody
    public Object updateSystem(System system, HttpServletRequest request, HttpServletResponse response) throws IOException {
        TKPrintUtils.printObject(system);
        systemService.addSystem(system);
        return "SUCCESS";
    }
}