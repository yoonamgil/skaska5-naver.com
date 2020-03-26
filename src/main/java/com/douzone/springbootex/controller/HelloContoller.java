package com.douzone.springbootex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContoller {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "/WEB-INF/views/hello.jsp";
	}
}
