package com.SpringMVC.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVC.test.beans.UserInfo;

@SuppressWarnings("serial")
@Controller
public class LoginAction extends DispatcherServlet  {
	@RequestMapping("/login.do")
	public String login(String UserName, String password) {
		if ("admin".equals(UserName)) {
			System.out.println(UserName + " 登录成功");
			return "loginSuccess";// 逻辑视图名 跳转页面默认为转发
		}
		return "loginError";
	}
	/**
     * 返回的是一个ModelAndView
     * @param username 页面传递的用户名
     * @param password 页面传递过来的密码
     * @return
     */
    @RequestMapping("login2.do")
    public ModelAndView login2(String UserName,String password){
        if ("admol".equals(UserName)) {
            System.out.println(UserName +" 登录成功2");
            return new ModelAndView("loginSuccess");//逻辑视图名       跳转页面默认为转发
        }
        return new ModelAndView("redirect:/view?path=loginError");//以重定向的方式
    }
    
    /**
     *  传递一个JAVABEAN对象给控制器
     * @param users  bean对象
     * @return
     */
    @RequestMapping(value="login3.do",method=RequestMethod.POST)
    public ModelAndView login3(@ModelAttribute("users") UserInfo users){
        if ("admol".equals(users.getUserName()) && "123".equals(users.getPassword())) {
            System.out.println(users.getUserName() +"    "+ users.getPassword());
            return new ModelAndView("loginSuccess");
        }
        return new ModelAndView("redirect:/view?path=loginError");//以重定向的方式
    }
   
}
