<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="icon" href="./img/bookico.png"  type="image/x-icon">  
<title>我的订单</title>
<style type="text/css">
table {
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<table class="table table-striped">
		<c:if test="${empty orders}">
			<tr>
				<td style="font-size:50px">您还没有订单哦</td>
			</tr>
		</c:if>
		<c:if test="${not empty orders}">
			<tr style="font-size: 18px;color: #5a1216;">
				<td>订单号</td>
				<td>书名</td>
				<td>数量</td>
				<td>电话</td>
				<td>总价</td>
				<td>收货人</td>
				<td>收货地址</td>
			</tr>
			<c:forEach var="order" items="${orders}">
				<tr>
					<td>${order.id }</td>
					<td>${order.bookname }</td>
					<td>${order.booknum }</td>
					<td>${order.phone }</td>
					<td>${order.totalprince }</td>
					<td>${order.receiver }</td>
					<td>${order.receivingaddress }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>