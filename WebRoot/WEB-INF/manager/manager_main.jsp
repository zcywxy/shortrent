<%@taglib prefix="s" uri="/struts-tags"%>
<%@  page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'manager_frame.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<style type="text/css">
body{
	height: 700px;
	overflow: auto;
}
#wrapper {
	width: 80%;
}

#aside {
	height:450px;
	width: 15%;
}

#content {
	width: 68%;
}

table {
	border-collapse: collapse;
	border: none;
}

td {
	border: solid #000 1px;
}
hr{
	width: 100%;
}
</style>
</head>

<body><center>
	<div id="wrapper">
		<div id="header"><jsp:include page="header.jsp"></jsp:include></div>
			<hr/>
		<s:property value="m_message" />
		<div id="cols">
			<table border="1">
				<tr>
					<td id="aside" style="top: 20px;">
						<div>
							<ul>
								<li style="list-style: none;font-weight: bold;font-size: 3ex;">欢迎管理员</li>
								<li><a href="/ShortRent/manage_users" target="main"><span>管理用户</span>
								</a></li>
								<li><a href="/ShortRent/manage_list" target="main"><span>管理房屋</span>
								</a></li>
								<li><a href="/ShortRent/manage_message" target="main">管理订单</a>
								</li>
							</ul>
						</div></td>
					<td id="content">
						<div>
							<%--
    			这里将列表中的信息显示出来
    			考虑是否使用jstL
    		--%>
							<iframe src="/ShortRent/manager_nothing" name="main" width="100%"
								height="100%" frameborder="0" scrolling="yes"></iframe>
						</div></td>
				</tr>
			</table>


		</div>
			<hr/>
		<div id="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
	</center>
</body>
</html>
