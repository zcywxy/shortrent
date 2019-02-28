<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
			width:1020px;
			height:15%;
		}
		#middle{
			width:1020px;
			height:70%;
			background-color:#fffaf0;
		}
		#footer{
			width:1020px;
			height:13%;
		}
		.check{
			margin-left: 0px;
			padding-left: 0px;
		}
		#content,#content_t{
			margin-right: 0px;
			padding-right: 0px;
		}
	</style>
  
  </head>
  <body><center>
    <div>
    	<div id="header">
    		<jsp:include page="header.jsp"></jsp:include>
    	</div>
    	<div id="middle">
    		<br/><br/>
    		<div id="m_first" align="center">寻找旅行中的家</div>
    		<br/>
    		<div id="m_second" align="center">
    		<form action="/ShortRent/search">
    			<table>
    				<tr>
    					<td id="content"><input id="content_t" type="text" name="index"/></td>
    					<td class="check">
    						<input class="check" type="image"  alt="按地址搜索" src="image/search.jpg" width="60" height="21"/>
    					</td>
    				</tr>
    				<tr><td colspan="2">请您输入地址进行搜索...</td></tr>
    			</table>
    		</form>
    		</div>
    	</div>
    	<div id="footer">
    		<jsp:include page="user/footer.jsp"></jsp:include>
    	</div>
    </div>
  </center></body>
</html>
