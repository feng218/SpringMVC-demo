package com.my.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.springmvc.model.User;
import com.my.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/toUser")
	public String toUser()
	{
		return "main";
	}
	
	@RequestMapping("/userList")
	public String userList(Model model)
	{
		List<User> userlist = userService.getUserList();
		model.addAttribute("userList", userlist);
		return "/user/userList";
	}
	
	@RequestMapping("/getUserList")
	@ResponseBody
	public Map<String, Object> getUserList(Model model)
	{
		List<User> userlist = userService.getUserList();
		Map<String, Object> map = new HashMap<>();
		map.put("aaData", userlist);
		return map;
	}
}
