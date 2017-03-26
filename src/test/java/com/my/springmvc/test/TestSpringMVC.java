package com.my.springmvc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.my.springmvc.dao.UserMapper;
import com.my.springmvc.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestSpringMVC
{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testMy()
	{
//		User user = new User();
//		user.setId(5);
//		user.setName("huqi");
//		userMapper.saveUser(user);
	}
	
	// 测试事务，出现异常会回滚
	@Test
//	@Transactional
	public void testMyTransaction()
	{
		User user = new User();
		user.setId(10);
		user.setName("Z--Hsan");
		userMapper.saveUser(user);
		
		// 抛出异常，数据不能插入到数据库中则表示事务起作用
		throw new RuntimeException();
	}
	
}
