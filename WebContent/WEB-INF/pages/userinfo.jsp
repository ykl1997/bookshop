<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/userinfo.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<title>个人中心</title>
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
	<form class="form" action="updateuser" method="post">
		<div>
			<span>余 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; 额</span> <font
				color="#e2110d" size="20px" translate="yes">${sessionScope.user.blance}</font>
		</div>
		<span>用户名</span><input type="text" name="username" readonly="readonly"
			value="${sessionScope.user.username}"><br> <span>姓&nbsp;&nbsp;&nbsp;
			名</span><input type="text" name="name" value="${sessionScope.user.name}"><br>
		<span>性 &nbsp;&nbsp;&nbsp;别</span><input type="text" name="sex"
			value="${sessionScope.user.sex}" readonly="readonly"><br>
		<span>电 &nbsp;&nbsp;&nbsp;话</span><input type="text" name="phone"
			value="${sessionScope.user.phone}"><br> <input
			type="submit" value="提交" class="btn btn-success"> <a
			href="alterpassform" class="btn btn-info">修改密码</a><a
			href="topuppage" target="_black" class="btn btn-danger">去充值</a>
	</form>
</body>
<script type="text/javascript">
	let wm = '${message}';
	if (wm != '') {
		alert(wm);
	}
</script>
</html>