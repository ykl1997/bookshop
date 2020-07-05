<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/userinfo.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<title>修改密码</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class="base">
		<div class="book1">
			<span class="ribbon1"> </span>
			<div class="book1-r"></div>
		</div>
		<div class="book2"></div>
		<div class="book3">
			<span class="ribbon3"> </span>
			<div class="book3-l"></div>
		</div>
		<div class="book4"></div>
		<div class="book5"></div>
		<div class="book6">
			<span class="ribbon6"> </span>
			<div class="book6-l"></div>
		</div>
		<div class="book7"></div>
	</div>
	<form class="form" action="alterpass" method="post">
		<span>原&nbsp;&nbsp;密&nbsp;&nbsp;码</span><input type="password" name="oldpassword"><br>
		<font color="red" style="margin-left:-160px;">${message1}</font><br>
		<span>新&nbsp;&nbsp;密&nbsp;&nbsp;码</span><input type="password" name="newpassword"><br>
		<span>确认密码</span><input type="password" name="newpassword2"><br>
	    <font color="red" style="margin-left:-160px; ">${message2}</font><br>
		<input type="submit" value="提交" class="btn btn-success" style="width: 200px;">
	</form>


</body>
</html>