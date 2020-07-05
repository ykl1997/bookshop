<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<script src="js/jquery-3.5.1.min.js" rel="script"></script>
<link rel="stylesheet" href="./css/login.css">
<script src="js/bootstrap.js" rel="script"></script>
<title>登录</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class="main">
		<div class="top">
			<div id="tologin">登录</div>
			<div id="tosignup">注册</div>
		</div>
		<form class="login" action="tologin" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">邮箱</label> <input type="email"
					class="form-control" id="exampleInputEmail1" name="username"
					placeholder="Email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">密码</label> <input type="password"
					class="form-control" name="password" id="exampleInputPassword1"
					placeholder="Password"> <span>${message}</span>
			</div>
			<div class="btn-box">
				<button type="submit" class="btn btn-primary btn-size">登录</button>
			</div>

		</form>
		<form class="singup" action="tosignup" method="post">
			<div class="form-group">
				<label for="username">邮箱</label> <input type="email"
					class="form-control" id="username" name="username"
					placeholder="User Name">
					<span id="exist">${errorusername}</span>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">密码</label> <input type="password"
					class="form-control" name="password" id="exampleInputPassword1"
					placeholder="Password">
					<span>${errorpassword}</span> 
			</div>
			<div class="form-group">
				<label for="realname">真实姓名</label> <input type="text"
					class="form-control" name="name" id="realname"
					placeholder="Real Name"><span> ${errorname}</span>
			</div>
			<div class="form-group">
				<label>性别:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label
					for="sex1">男</label> <input type="radio" name="sex" value="男"
					id="sex1">&nbsp;&nbsp;&nbsp;&nbsp; <label for="sex2">女</label>
				<input checked="checked" type="radio" name="sex" value="女" id="sex2">
			</div>
			<div class="form-group">
				<label for="phone">电话</label> <input type="text"
					class="form-control" name="phone" id="phone" placeholder="Phone">
				<span>${errorphone}</span>
			</div>
			<div class="btn-box">
				<button type="submit" id="sign" class="btn btn-primary btn-size">注册</button>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript">
let er='${error}';
if(er!=''){
	$("#tosignup").click();
}
</script>
</html>