<%@  page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#header {
	height: 20%;
	width: 100%;
}

#middle {
	height: 60%;
	width: 100%;
	background-color: #BC5F58;
}

#footer {
	height: 20%;
	width: 100%;
}

#father {
	width: 1020px;
}

.err {
	font-size: 15px;
	color: red;
}
</style>
</head>

<body>
	<center>
		<div id="father">
			<div id="header">
				<jsp:include page="user/header.jsp"></jsp:include>
			</div>
			<div id="middle">
				<%-- <s:property value="message"/> 不明原因，取不到值 --%>
				<s:property value="manager.m_password" />
				<s:property value="manager.m_id" />
				<s:property value="exception.message" />
				<s:property value="user.UName" />
				<s:debug></s:debug>
			</div>
		<div id="footer">
			<jsp:include page="user/footer.jsp"></jsp:include>
		</div>
		</div>
</center>
</body>
</html>