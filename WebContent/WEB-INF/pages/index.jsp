<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="./css/index.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<title>主页</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div>
		<ul class="list">
			<li><a target="_blank" href="findBycategory?category=文学经典">文学经典</a></li>
			<li><a target="_blank" href="findBycategory?category=科技杂志">科技杂志</a></li>
			<li><a target="_blank" href="findBycategory?category=外文天地">外文天地</a></li>
			<li><a target="_blank" href="findBycategory?category=计算机类">计算机类</a></li>
			<li><a target="_blank" href="findBycategory?category=文艺小说">文艺小说</a></li>
			<li><a target="_blank" href="findBycategory?category=成功励志">成功励志</a></li>
			<li><a target="_blank" href="findBycategory?category=农林医学">农林医学</a></li>
		</ul>
	</div>
	<div class="container">
		<div class="right row">
			<div class="today">推荐 图书</div>
			<c:forEach var="book" items="${books}">
				<div class="book col-md-3"><a href="tobuy?id=${book.id}"><img alt="" src="./img/${book.id}.jpg">
				<div class="bookname"> ${book.bookname}</div>
				<div class="auther">${book.author}</div>
				<div class="price">${book.price}</div></a></div>
			</c:forEach>			
		</div>
	</div>
</body>
</html>