package com.cloud.server.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.server.service.impl.BaseServiceImpl;
import com.cloud.server.system.entity.User;
import com.cloud.server.system.mapper.UserMapper;
import com.cloud.server.system.service.IUserService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author leim
 * @since 2020-05-20
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getById(String id) {
		return userMapper.getById(id);
	}

}