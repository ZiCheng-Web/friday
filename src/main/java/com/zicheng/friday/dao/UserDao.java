package com.zicheng.friday.dao;


import com.zicheng.friday.model.SysUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {

	@Select("select * from sys_user t where t.username = #{username}")
	SysUser getUser(String username);
}
