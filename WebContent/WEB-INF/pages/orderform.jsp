<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>详细</title>
<link rel="stylesheet"  href="./css/orderform.css"> 
<link rel="stylesheet"  href="./css/bootstrap.css"> 
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<img class="col-md-5" alt="" src="./img/${book.id}.jpg">
			<form class="col-md-4 form" action="order" method="post">
			<input type="hidden"  name="id" value="${book.id}">
				<span>书名</span><font class="name">${book.bookname}</font><br>
				<span>作者</span><font size="3" color="#929292">${book.author}</font><br>
				<span>价格</span><font color="#ff4400" size="15">${book.price}</font><br>
				<span class="small">库存</span><font color="#929292" size="3">${book.stock}</font><br>
				<input class="btn btn-warning" type="submit" value="立即购买">
			</form>

		</div>
	</div>
</body>
</html>