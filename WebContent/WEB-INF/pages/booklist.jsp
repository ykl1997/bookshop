<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="./css/booklist.css">
<link rel="icon" href="./img/bookico.png" type="image/x-icon">
<style type="text/css">
* {
	margin: 0;
}
</style>
<title>书籍</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<c:if test="${empty books}">
		<div style="font-size: 30px; color: red; margin:auto; text-align: center;">没找到您的结果</div>
	</c:if>
	<c:if test="${not empty books}">
		<div class="container">
			<div class="row">
				<c:forEach var="book" items="${books}">
					<div class="col-md-3 book">
						<a href="tobuy?id=${book.id}"><img src="./img/${book.id}.jpg">
							<div class="bookname">${book.bookname}</div>
							<div class="auther">${book.author}</div>
							<div class="price">${book.price}</div></a>
					</div>
				</c:forEach>

			</div>
		</div>
	</c:if>
</body>
</html>