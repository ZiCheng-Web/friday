package com.zicheng.friday.service;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.model.SysRole;
import com.zicheng.friday.model.SysUser;

public interface RoleService {

    Results<SysRole> getAllRoles();
}
