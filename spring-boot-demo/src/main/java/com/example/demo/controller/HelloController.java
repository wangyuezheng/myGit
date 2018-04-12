package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Resource;
import com.example.demo.pojo.User;


@RestController
public class HelloController {
	@Autowired
	private Resource resource;
	
	@RequestMapping("getUserJson")
	public User getUserJson(){
		User user = new User();
		BeanUtils.copyProperties(resource,user );
		return user;
	}
	
	
	@RequestMapping("getUser")
	public User getUser(){
		User user = new User();
		user.setAge(20);
		user.setJob("java");
		user.setName("王五");
		return  user;
	}
	
}
