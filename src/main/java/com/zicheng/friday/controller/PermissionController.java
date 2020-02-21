package com.zicheng.friday.controller;

import com.alibaba.fastjson.JSONArray;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.dto.RoleDto;
import com.zicheng.friday.model.SysPermission;
import com.zicheng.friday.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("permission")
@Slf4j
public class PermissionController {
    @Autowired
    private PermissionService permissionService;


    @RequestMapping(value = "/listAllPermission", method = RequestMethod.GET)
    @ResponseBody
    public Results<JSONArray> listAllPermission() {
        return permissionService.listAllPermission();
    }

    @RequestMapping(value = "/listAllPermissionByRoleId", method = RequestMethod.GET)
    @ResponseBody
    public Results<SysPermission> listAllPermissionByRoleId(RoleDto roleDto) {
        log.info(getClass().getName() + " : param =  " + roleDto);
        return permissionService.listByRoleId(roleDto.getId().intValue());
    }
}
