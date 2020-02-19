package com.zicheng.friday.service.impl;

import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.dao.RoleDao;
import com.zicheng.friday.model.SysRole;
import com.zicheng.friday.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Results<SysRole> getAllRoles() {
        return Results.success(50, roleDao.getAllRoles());
    }
}
