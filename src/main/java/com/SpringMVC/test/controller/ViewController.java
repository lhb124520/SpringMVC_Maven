package com.SpringMVC.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//标注这个类是Controller类，spring会自动进行扫描
public class ViewController {
	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request) {
		String path = request.getParameter("path") + "";		
		ModelAndView mav = new ModelAndView();
		
		String contextPath=request.getContextPath();
		System.out.println("contextPath:"+contextPath);
		mav.addObject("contextPath",contextPath);
		mav.setViewName(path);
		return mav;
	}

}
