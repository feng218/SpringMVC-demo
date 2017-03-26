package com.my.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.springmvc.dao.UserMapper;
import com.my.springmvc.model.User;

@Service
public class UserService
{
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUserList()
	{
		return userMapper.getUserList();
	}
}
