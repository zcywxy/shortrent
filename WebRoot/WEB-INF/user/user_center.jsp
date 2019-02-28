<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'usersCenter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	适用分辨率和浏览器：火狐浏览器，1024*768
	-->
	<style type="text/css">
		#header{
			width:1020px;
			height:15%;
			background-color:#BC5F58;
		}
		#cols{
			border:1px solid #BC5F58;
			width:1020px;
			height:80%;
			background-color:#BC5F58;
		}
		#aside{
			hright:100%;
			float:left;
			width:20%;
			border:1px solid #BC5F58;
		}
		#content{
			height:100%;
			float:right;
			width:79.8%;
		}
		#footer{
			width:1020px;
			height:13%;
			background-color:#BC5F58;
		}
		dd a{
			font-size:12px;
		}
		dt{
			font-size: 18px;
		}
		body,iframe{
			overflow-x: hidden;
		}
	</style>
  </head>
  
  <body><center>
    <div id="wrapper">
    	<div id="header"><jsp:include page="header.jsp"></jsp:include></div> 
    	<s:property value="h_message"/>
    	<div id="cols">
    		<div id="aside">
    			<dl>
				  <dt>我是房东</dt>  
				  <dd><a href="/ShortRent/house_create" target="main"><span>发布房屋</span></a></dd>
				  <dd><a href="/ShortRent/house_list" target="main"><span>房屋列表</span></a></dd>
				  <dd><a href="/ShortRent/house_orders" target="main">管理订单</a></dd>
  				  <dt>我是房客</dt> 
  				  <dd><a href="/ShortRent/house_berforeRecords" target="main">待受理订单</a></dd>
  				  <dd><a href="/ShortRent/house_afterRecords" target="main">已受理订单</a></dd>
  				  <dt>交易记录</dt> 
  				  <dd><a href="/ShortRent/house_allAfterRecords" target="main">成交记录</a></dd>
  				  <dd><a href="/ShortRent/house_allRecords" target="main">交易记录</a></dd>
  				  
  				  <!-- 查询统计一栏可以在成交和交易记录列表里显示出来 -->  				  
  				  
  				  <!-- <dt>查询统计</dt> 
  				  <dd><a href="#">成交订单</a></dd>
  				  <dd><a href="#">订单统计</a></dd> -->
				</dl>
    		</div>
    		<div id="content"><%--
    			这里将列表中的信息显示出来
    			考虑是否使用jstL
    		--%>
    			<iframe src="/ShortRent/user_nothing" name="main" width="100%" height="100%" frameborder="0" scrolling="auto"></iframe>
    		</div>
    	</div>
    	<div id="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </div>
 </center> </body>
</html>
