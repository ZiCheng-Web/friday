package com.zicheng.friday.service;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.dto.UserDto;
import com.zicheng.friday.model.SysUser;

public interface UserService {
	SysUser getUser(String username);

    Results<SysUser> getAllUsersByPage(Integer offset, Integer limit);

    Results save(SysUser userDto, Integer roleId);

    SysUser getUserByPhone(String telephone);

    SysUser getUserById(Long id);

    Results<SysUser> updateUser(UserDto userDto, Integer roleId);

    int deleteUser(Long id);

    Results<SysUser> getUserByFuzzyUsername(String username, Integer offset, Integer limit);
}
