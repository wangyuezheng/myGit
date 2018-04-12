package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Resource;

@Controller
public class FreemarkerController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("index")
	public String toIndex(ModelMap map){
		map.addAttribute("resource", resource);
		return "freemarker/index";
		
	}
	@RequestMapping("center")
	public String center(){
		return "freemarker/center/center";
	}
}
