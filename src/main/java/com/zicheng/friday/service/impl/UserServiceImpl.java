package com.zicheng.friday.service.impl;


import com.zicheng.friday.dao.UserDao;
import com.zicheng.friday.model.SysUser;
import com.zicheng.friday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public SysUser getUser(String username) {
		return userDao.getUser(username);
	}
}
