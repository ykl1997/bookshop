<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<script src="./js/jquery-3.5.1.min.js" rel="script"></script>
<script src="./js/bootstrap.js" rel="script"></script>
<title>head</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand">网上书店</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="index">主页 <span class="sr-only">(current)</span></a></li>
			</ul>

			<form class="navbar-form navbar-left" action="lookupBook">
				<div class="form-group">
					<input type="text" name="authorOrBookname" class="form-control" placeholder="书名或作者名">
				</div>
				<button type="submit" class="btn btn-default">搜索</button>
			</form>

			<ul class="nav navbar-nav navbar-right">
				<c:if test="${empty sessionScope.user }">
					<li><a href="login">请登录</a></li>
				</c:if>
				<c:if test="${not empty user }">
					<li><a>${sessionScope.user.name }</a></li>
				</c:if>
				<li><a href="userinfo">个人中心</a></li>
				<li><a href="orderlist">我的订单</a></li>
				<li><a href="logout">退出</a></li>				
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>