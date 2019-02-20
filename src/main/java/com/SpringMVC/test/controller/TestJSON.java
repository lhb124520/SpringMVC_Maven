package com.SpringMVC.test.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringMVC.test.beans.UserInfo;

/**
 * 
 *  @author liu.hb 
	使用 HttpMessageConverter<T> 将请求信息转化并绑定到处理方法的入
	参中或将响应结果转为对应类型的响应信息，Spring 提供了两种途径：
	– 使用 @RequestBody / @ResponseBody 对处理方法进行标注
	– 使用 HttpEntity<T> / ResponseEntity<T> 作为处理方法的入参或返回值
 */
@RequestMapping("/TestJSON")
@Controller
public class TestJSON {
	/**
	 * 1.导入jar包 jackson 
	 * 2. 编写目标方法，使其返回 JSON 对应的对象或集合
	 * 3. 在方法上添加 @ResponseBody 注解
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getUsers")
	public List<UserInfo> testAjax() {
		List<UserInfo> userInfo = new ArrayList<>();
		userInfo.add(new UserInfo(1, "张三", "123", "男", "110", "湖南长沙", "管理员"));
		return userInfo;
	}

	/**
	 * @RequestBody 和 @ResponseBody 不需要成对出现
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getUsersByRequest", method = RequestMethod.GET)
	public List<UserInfo> testHttpMessageConverter (@RequestBody String username){
		List<UserInfo> userInfo = new ArrayList<>();		
		System.out.println("RequestBody:"+username);
		HttpMessageConverter<Object> a;
		StringHttpMessageConverter aa;		
		userInfo.add(new UserInfo(1,username, "1", "女", "110", "湖南衡阳", "收银员"));
		return userInfo;
	}
	/**
	 * @HttpEntity
	 * @return
	 */
	@RequestMapping(value="/getUsersByHttpEntity", method = RequestMethod.GET)
	public String testHttpEntity (HttpEntity<String> entity){
		long len=entity.getHeaders().getContentLength();
		System.out.println("getContentLength:"+len);		
		return "loginSuccess";
	}
}
