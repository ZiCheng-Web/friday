package com.zicheng.friday.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.dao.PermissionDao;
import com.zicheng.friday.model.SysPermission;
import com.zicheng.friday.service.PermissionService;
import com.zicheng.friday.util.TreeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public Results<JSONArray> listAllPermission() {
        log.info(getClass().getName() + ".listAllPermission()");
        List datas = permissionDao.findAll();
        JSONArray array = new JSONArray();
        log.info(getClass().getName() + ".setPermissionsTree(?,?,?)");
        TreeUtils.setPermissionsTree(0, datas, array);
        return Results.success(array);
    }

    @Override
    public Results<SysPermission> listByRoleId(Integer roleId) {
        List<SysPermission> datas = permissionDao.listByRoleId(roleId);
        return Results.success(0, datas);
    }
}
