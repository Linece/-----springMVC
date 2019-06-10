package com.zdc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zdc.mvc.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		String helllo = helloService.sayHello("tommcat.................");
		return helllo;
	}
	
	@RequestMapping("/suc")
	public String success(){
		return "success";
	}
}
