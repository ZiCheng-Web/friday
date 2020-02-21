package com.zicheng.friday.service;

import com.alibaba.fastjson.JSONArray;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.model.SysPermission;

public interface PermissionService {

    Results<JSONArray> listAllPermission();

    Results<SysPermission> listByRoleId(Integer intValue);
}
