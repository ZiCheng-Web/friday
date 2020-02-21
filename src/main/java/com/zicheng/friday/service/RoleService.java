package com.zicheng.friday.service;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.dto.RoleDto;
import com.zicheng.friday.model.SysRole;
import com.zicheng.friday.model.SysUser;

public interface RoleService {

    Results<SysRole> getAllRoles();

    Results<SysRole> getAllRolesByPage(Integer offset, Integer limit);

    Results<SysRole> save(RoleDto roleDto);

    SysRole getRoleById(Integer id);

    Results update(RoleDto roleDto);

    Results delete(Integer id);

    Results<SysRole> getRoleByFuzzyRoleNamePage(String roleName, Integer offset, Integer limit);
}
