<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'header.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#h_left{
			width:62%;
			/* background-color: #f1f0f9; */
			display: inline-block;
		}
		#h_left img{
			padding-left: 0px;
			margin-left: 0px;
		}
		#h_right{
			width:33%;
			/* background-color: #f0f1f9; */
			display: inline-block;
			
		}
		a{
			color: #62B3FD;
			font-size:12px;
			text-decoration: none;
		}
		#header{
				background-color:912D25;
		}
	</style>
  </head>
  
  <body><center>
    <div id="header">
    		<div id="h_left" align="left"><img alt="短租网" src="image/liner.jpg" width="500px" height="70px"></div>
    		
    		<!-- 在登陆完成之后此当显示 	注销、免费创建房屋-->
    		<!-- 在点击免费创建房屋之时 如果没有登录，则提醒登录，登录后进入用户中心-->
    		<div id="H_right" align="right"><a href="/ShortRent/user_regist">注册</a>|<a href="/ShortRent/user_login">登陆</a>|<a href="/ShortRent/user_logOut">注销</a>|<a href="/ShortRent/index">返回主页</a><!-- |<a href="*" onclick="">免费创建房屋</a> --></div>
    		<hr/>
    </div>
  </center></body>
</html>
