<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
<style>
	.pointer {
		cursor: pointer;		
	}
	
	.pointer:hover {
		background-color: #0000002e;
	}
</style>
</head>
<body>	
	<h1>리스트</h1>
	<a href="write.do"><button>글쓰기</button></a>	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="item" items="${list}">
		<tr class="pointer" onclick="moveToDetail(${item.i_board})">
			<td>${item.i_board }</td>
			<td>${item.t_title }</td>
			<td>${item.r_datetime }</td>
			<td>${item.cnt }</td>
		</tr>
		</c:forEach>
	</table>
	<script>
		function moveToDetail(i_board) {
			location.href= 'detail.do?i_board=' + i_board;
		}
	</script>
</body>
</html>










