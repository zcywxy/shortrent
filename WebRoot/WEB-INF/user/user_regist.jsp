<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
   	<base href="<%=basePath%>">
    <title>My JSP 'register.jsp' starting page</title>
    
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
			height:19%;
		}
		#footer{
			height:19%;
		}
		#left{
			height:59%;
			background-color: #BC5F58;
		}
		#father{
			width:1020px;
		}
	</style>
	<script type="text/javascript">
		function test(){
			if(document.getElementById("checkbox").value){
				return true;
			}else{
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
    		<div id="left">
    			<form action="/ShortRent/user_add" method="post">
    				<table>
    					<tr><td colspan="2" align="center"><h1>注册新账号</h1></td></tr>
    					<tr><td>用户名：</td><td><input type="text" name="user.UName"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>密码：</td><td><input type="password" name="user.UPassword"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>确认密码：</td><td><input type="password"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>手机号：</td><td><input type="text" name="user.UPhone"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>邮箱</td><td><input type="text" name="user.UEmail"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td colspan="2"><input type="checkbox" id="checkbox"><font size="3px">是否同意<a href="#">短租网服务协议</a>和<a href="#">隐私条款</a></font></td></tr>
    					<tr><td><input type="submit" value="注册" onclick="return test()"></td>
    						<td><input type="reset" value="重置" ></td>
    					</tr>
    				</table>
    			</form>
    		</div>
    	</div>
    	<div id="footer">
    		<jsp:include page="footer.jsp"></jsp:include>
    	</div>
    </div>
  </center>
  </body>
</html>
