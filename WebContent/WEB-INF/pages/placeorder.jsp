<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="./css/placeorder.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
<title>确认订单</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class="frame"></div>
	<form action="saveolder" class="form" method="post">
		<input name="bookid" class="id" type="hidden" value="${book.id}">
		<div>
			<font color="#cf4813" class="bookname">《${book.bookname }》</font>
		</div>
		<div>
			<span style="letter-spacing: 12px;">数量</span><input type="number"
				name="booknum" max="1000" min="1"  id="num" value="1"> <span
				style="letter-spacing: 12px;margin-left:10px;">应付</span> <span  id="yuan">${book.price}</span>
		</div>
		<div>
		<span style="letter-spacing: 5px;">收货人</span><input required="required" type="text"
				name="receiver"  value="${name}">
		</div>
		<div>
			<span>收货地址</span>
			<textarea required="required" autofocus="autofocus" rows="5"
				cols="23" name="receivingaddress"></textarea>
		</div>
		<input class="btn btn-danger buttn" type="submit" value="提交">
	</form>
</body>
<script type="text/javascript" src="./js/placeorder.js"></script>
</html>