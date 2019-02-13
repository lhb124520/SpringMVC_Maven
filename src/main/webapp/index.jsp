<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<a href="/SpringMVCMavenTest/view?path=index">进入欢迎界面</a>
	<br></br>
	<a href="HelloWorld">Hello World</a>
	<br><br>
	<a href="SpringMVC/HelloWorld">处理器类可以定义多个处理方法，处理来自/SpringMVC/HelloWorld 下的请求</a>
	<br><br>
	<a href="SpringMVC/TestRequestMapping?username=张三">@RequestMapping 的 value、method、params 及 heads</a>
	<br><br>
	<a href="SpringMVC/TestPathVariable/张三"> @PathVariable 可以将 URL 中占位符参数绑定到控制器处理方法的入参中</a>
	<br><br>	
	<a href="SpringMVC/TestRequestParam?username=张三&age=25">使用 @RequestParam 绑定请求参数值</a>
	<br><br>	
	<a href="SpringMVC/TestRequestHeader">使用 @RequestHeader 绑定请求报头的属性值</a>
</body>
</html>