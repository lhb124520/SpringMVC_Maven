package com.SpringMVC.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author liu.hb
 *类定义处标记的@RequestMapping 限定了处理器类可以处理所有 URI 为 /SpringMVC 的请求，它相对于 WEB 容器部署的根路径
 */
@RequestMapping("/SpringMVC")
@Controller
public class SpringMVCTest {
	/**
	 * 处理器类可以定义多个处理方法，处理来自/SpringMVC 下的所有请求
	 * @return 返回值会通过视图解析器解析为实际的物理视图,/WEB-INF/views/loginSuccess.jsp
	 */
	@RequestMapping("/HelloWorld")
	public String hello() {
		System.out.println("hello world");
		return "loginSuccess";		
	}
	/**
	 * @RequestMapping 的 value、method、params 及 heads 分别表示请求 URL、请求方法、请求参数及请求头的映射条件
	 * @return 返回值会通过视图解析器解析为实际的物理视图,/WEB-INF/views/loginSuccess.jsp
	 * ,headers = { "ContentType=text/*" }
	 */
	@RequestMapping(value = "/TestRequestMapping",method = RequestMethod.GET, params = {"username"})
	public String TestRequestMapping() {
		System.out.println("TestRequestMapping");
		return "loginSuccess";		
	}
	/*-----------------------------------------------------------------------------------------------
	@PathVariable、@RequestParam、@RequestHeader 等）
	Spring MVC 框架会将 HTTP 请求的信息绑定到相应的方法入参
	中，并根据方法的返回值类型做出相应的后续处理。
	-----------------------------------------------------------------------------------------------*/
	/**
	 * 通过 @PathVariable 可以将 URL 中占位符参数绑定到控制器处理方法的入参中
	 * @param id  方法的入参
	 * @return 返回值会通过视图解析器解析为实际的物理视图,/WEB-INF/views/loginSuccess.jsp
	 */
	@RequestMapping(value = "/TestPathVariable/{id}")
	public String TestPathVariable(@PathVariable("id") String id) {
		System.out.println("TestPathVariable Put: " + id);
		return "loginSuccess";		
	}
	/**
	 * 使用 @RequestParam 绑定请求参数值
	 * @param username
	 * @param age
	 * @return
	 * required：是否必须。默认为 true, 表示请求参数中必须包含对应的参数，若不存在，将抛出异常
	 */
	@RequestMapping(value = "/TestRequestParam")
	public String TestRequestParam(
			@RequestParam(value = "username") String username,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam, username: " + username + ", age: "+ age);
		return "loginSuccess";		
	}
	/**
	 * 使用 @RequestHeader 绑定请求报头的属性值
	 * @param id  方法的入参
	 * @return 返回值会通过视图解析器解析为实际的物理视图,/WEB-INF/views/loginSuccess.jsp
	 */
	@RequestMapping(value = "/TestRequestHeader")
	public String TestRequestHeader(@RequestHeader(value = "Accept-Language") String al) {
		System.out.println("testRequestHeader, Accept-Language: " + al);
		return "loginSuccess";		
	}
}
