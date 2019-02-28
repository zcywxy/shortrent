<%@  page language="java" import="java.util.*"  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
   <head> 
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
		body{
			background-color: #912D25;
		}
		#left{
			background-color: #912D25;
			display: inline-table;
		}
		#right{
			background-color: #912D25;
			display: inline-table;
		}
		#l_form{
			margin-left: 20px;
		}
		#father{
			width:1020px;
		}
	</style>
	<script type="text/javascript">
	</script>
  </head>
  
  <body>
    <div id="father"><%--
    	<div id="header">
    		<jsp:include page="header.jsp"></jsp:include>
    	</div>
    	--%><div id="middle">
    		<form action="/ShortRent/house_add" method="post" id="l_form">
    		<div><font size="14px;">创建房屋</font></div>
    		<div id="left" align="left">
    				<table>
    					<tr><td><img src="image/x.jpg" width="10" height="10"> 房屋名称：</td><td><input required="required" type="text" name="house.HName"/></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>发票：</td>
    						<td>
    						<%--  发票这一部分在表中和映射文件中未配置，待改--%>
    							<label><input name="receipt" type="radio" value="true" checked="checked"/>提供</label> 
								<label><input name="receipt" type="radio" value="false" />不提供</label> 
							</td>
						</tr>
						<tr><td colspan="2"></td></tr>
    					<tr><td>出租类型：</td>
    						<td>
    							<label><input name="house.HRentType" type="radio" value="full" checked="checked"/>整租</label> 
								<label><input name="house.HRentType" type="radio" value="one" />单间</label>
								<label><input name="house.HRentType" type="radio" value="check" />择位</label> 
							</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>房屋类型：</td>
    						<td>
    							<select name="house.HHouseType">
    								<option value="hotel">酒店</option>
    								<option value="nomal">民居</option>
    								<option value="farmyard">农家乐</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>面积：</td><td><input required="required" type="text" name="house.HArea"/>平方米</td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>可住人数：</td>
    						<td>
    							<select name="house.HPeopleNumber">
    								<option value="1">1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
    								<option value="4">4</option>
    								<option value="5">5</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>床位数：</td>
    						<td>
    							<select name="house.HBedNumber">
    								<option value="1">1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
    								<option value="4">4</option>
    								<option value="5">5</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>卧室数：</td>
    						<td>
    							<select name="house.HLivingRoomNumber">
    								<option value="1">1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
    								<option value="4">4</option>
    								<option value="5">5</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>房间数：</td>
    						<td>
    							<select name="house.HRoomNumber">
    								<option value="1">1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
    								<option value="4">4</option>
    								<option value="5">5</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>床型：</td>
    						<td>
    							<select name="house.HBedType">
    								<option value="one">单人床</option>
    								<option value="two">双人床</option>
    								<option value="three">大床</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td>卫生间数：</td>
    						<td>
    							<select name="house.HWashRoomNumber">
    								<option value="1">1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
    								<option value="4">4</option>
    								<option value="5">5</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>入住时间：</td>
    						<td>
    						    <select name="house.HInTime">
    								<option value="00:00" selected="selected">00:00</option>
    								<s:iterator value="{
    								'01','02','03','04','05','06','07','08','09','10',
    								'11','12','13','14','15','16','17','18','19','20',
    								'21','22','23'
    								}" id='number'>
    									<option value="<s:property value='number'/>:00" 
    									selected="selected"><s:property value='number'/>:00</option>
									</s:iterator>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>退房时间：</td>
    						<td>
    							<%--<input name="house.h_outTime" type="time" value="12:00"/>
    							--%><select name="house.HOutTime">
    									<option value="00:00" selected="selected">00:00</option>
    									<s:iterator value="{
    										'01','02','03','04','05','06','07','08','09','10',
    										'11','12','13','14','15','16','17','18','19','20',
    										'21','22','23'
    										}" id='number'>
    										<option value="<s:property value='number'/>:00" 
    										selected="selected"><s:property value='number'/>:00</option>
										</s:iterator>
    							</select>
    						</td>
    					</tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>最小天数：</td>
    						<td><input 
    						onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" 
    						onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')} 
    						type="text" 
    						name="house.HMinDays" /></td></tr>
    					<tr><td colspan="2"></td></tr>
    					<tr><td>最大天数：</td>
    					<td><input 
    						onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" 
    						onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')} 
    						type="text" 
    						name="house.HMaxDays" /></td></tr>
    					<tr><td colspan="2"></td></tr>
    				</table>
    		</div>
    		<div id="right">
    				<table>
    					<tr><td>全额退款日：</td><td><input  required="required" type="text" name="house.HReturnMoneyDay"/></td></tr>
    					<tr><td>日租价：</td><td><input  required="required" type="text" name="HDayCost"/>元/天</td></tr>
    					<tr><td>房屋描述：</td>
    						<td><textarea  required="required" name="house.HDescription" cols="30" rows="3"></textarea></td>
    					</tr>
    					<tr><td>使用规则：</td>
    						<td><textarea  required="required" name="house.HUsingRule" cols="30" rows="3"></textarea></td>
    					</tr>
    					<tr><td>设施服务：</td>
    						<td><textarea  required="required" name="house.HService" cols="30" rows="3"></textarea></td>
    					</tr>
    					<tr><td>地址：</td>
    						<td><textarea  required="required" name="house.HAddress" cols="30" rows="3"></textarea></td>
    					</tr>
    					<tr><td>付款规则：</td>
    						<td> 
    							<select name="house.HPayRule">
    								<option value="full">全款</option>
    								<option value="before">定金</option>
    							</select>
    						</td>
    					</tr>
    					<tr><td>房屋图片：</td>
    						<td> 
    							<ul><%--文件上传部分内容未定义，密码加密未定义
    								--%><li><input  required="required" type="file" name="picture1" value="图片1"/></li>
    								<li><input  required="required" type="file" name="picture2" value="图片2"/></li>
    								<li><input 	required="required" type="file" name="picture3" value="图片3"/></li>
    							</ul>
    						</td>
    					</tr>
    					</table>
    		</div>
    		<div><input type="submit" value="提交审核"/><input type="reset" value="清空"/></div>
    		</form>
    	</div>
    	<%--<div id="footer">
    		<jsp:include page="footer.jsp"></jsp:include>
    	</div>
    --%></div>
  </body>
</html>
