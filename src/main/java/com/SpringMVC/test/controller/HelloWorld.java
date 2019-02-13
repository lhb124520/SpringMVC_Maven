package com.SpringMVC.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author liu.hb
 *
 */
@Controller
public class HelloWorld {
	/**
	 * 1. 使用 @RequestMapping 注解来映射请求的 URL
	 * @return 返回值会通过视图解析器解析为实际的物理视图,/WEB-INF/views/loginSuccess.jsp
	 */
	@RequestMapping("/HelloWorld")
	public String hello() {
		System.out.println("hello world");
		return "loginSuccess";		
	}
}
