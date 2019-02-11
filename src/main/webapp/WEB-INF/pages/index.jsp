<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/cs/style.css" />
<script type="text/javascript" src="resources/jquery/jquery-1.8.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC框架</title>
<style>
        body {
            background : url(${contextPath}/resources/img/bg.jpg);
            background-size : 100% 100%;
        }
    </style>
    <script type="text/javascript">
    $(document).ready(function(){
    	  $("#button").click(function(){
    		  alert("11")
    	    $("p").slideToggle();
    		  $("#button").val("好的")
    	  });
    	});
    
    </script>
</head>
<body>

	<p class="text">恭喜，SpringMVC項目已經成功搭建</p>
	<input type="button" name="button" id="button" value="按钮" />
	<input tupe="text" value="http://localhost:8889/SpringMVCMavenTest/view?path=index"/>
	<button>切换</button>	
	${contextPath}
</body>
</html>