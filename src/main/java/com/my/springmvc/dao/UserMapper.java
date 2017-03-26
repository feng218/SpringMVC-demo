package com.my.springmvc.dao;

import java.util.List;
import com.my.springmvc.model.User;

public interface UserMapper
{
	// 查询所有用户
	public List<User> getUserList();
	
	// 保存用户
	public Integer saveUser(User user);
	
	// 更新
	public Integer updateUser(User user);
	
	// 删除
	public Integer deleteUser(String id);
}
