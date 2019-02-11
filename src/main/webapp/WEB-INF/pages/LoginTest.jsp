<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,user-scalable=no">
<link rel="stylesheet"  type="text/css" href="cs/style.css" >
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/vue/2.2.2/vue.min.js"></script>
<script src="js/vue.min.js"></script>
</head>

<body>
	<form id="userinfo" action="/SpringMVCMavenTest/login.do" method="post" class="niceform" >
         
                <fieldset>
                	<dl>
                	
                        <dt><label for="email">员工号:</label></dt>
                        <dd><input type="text" name="UserName" id="UserName" size="40" /></dd>
                    </dl>                   
                    <dl>
                        <dt><label for="password">密码:</label></dt>
                        <dd><input type="password" name="password" id="password" size="40" /></dd>
                    </dl>
                    </dl>
                    <dd>${tip}</dd>
                     <dl class="submit">
                     	 <input type="submit" name="submit" id="submit" value="登录" />
                        
                     </dl>
                    
                </fieldset>
                
         </form>
</body>

</html>