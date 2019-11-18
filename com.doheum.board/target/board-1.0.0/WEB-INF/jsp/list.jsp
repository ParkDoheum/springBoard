<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>	
	<h1>리스트</h1>
	<a href="write.do"><button>글쓰기</button></a>	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<c:forEach var="item" items="${list}">
		<tr>
			<td>${item.i_board }</td>
			<td>${item.t_title }</td>
			<td>${item.r_datetime }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>



