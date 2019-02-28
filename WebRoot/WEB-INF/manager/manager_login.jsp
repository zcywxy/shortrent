<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
	<base href="<%=basePath%>"/>
    <title>My JSP 'manager_login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#header{
			height:20%;
			width:100%;
		}
		#middle{
			height:60%;
			width:100%;
			background-color: #BC5F58;
		}
		#footer{
			height:20%;
			width:100%;
		}
		#father{
			width:1020px;
		}
		.err{
			font-size: 15px;
			color: red;
		}
	</style>
	<script type="text/javascript" language="javascript" src="../js/jquery-1.9.1.js"></script>
	<script type="text/javascript" language="javascript">
		function test(){
		
			if(document.getElementById("user").value&&document.getElementById("pass").value){
				return true;
			}else{
				//window.alert(document.getElementById("user").value);
				
				if(document.getElementById("user").value==null||document.getElementById("user").value=="")
				{document.getElementById("username").innerText="用户名不能为空";}
				if(document.getElementById("user").value==null||document.getElementById("user").value=="")
				{document.getElementById("password").innerText="密码不能为空！";}
				return false;
			}
		}
	</script>
  </head>
  
  <body>
      <center>
    <div id="father">
    	<div id="header">
    		<jsp:include page="header.jsp"></jsp:include>
    	</div>
    	<div id="middle">
    			<form action="ShortRent/manager_loginTest" method="post" id="l_form">
    				<table width="259" height="150">
    					<tr><td colspan="2" align="center"><h1>管理员登陆<h1></td></tr>
    					<tr><td>I  D：</td><td><input type="text" name="manager.MId" id="user"/></td></tr>
    					<tr><td>密码：</td><td><input type="text" name="manager.MPassword" id="pass"/></td></tr>
    					<tr><td align="center"><input type="submit" value="提交"  onclick="return test()"></td><td align="center"><input type="reset" value="重置"  onclick="return test()"></td></tr>
    				</table>
    			</form>
    	</div>
    	<div id="footer">
    		<jsp:include page="footer.jsp"></jsp:include>
    	</div>
    </div>
  </center>
  </body>
</html>
