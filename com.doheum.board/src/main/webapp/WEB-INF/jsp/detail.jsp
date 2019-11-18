<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div><a href="list.do">게시판으로 돌아가기</a></div>
	<div>제목 : ${detail.t_title }</div>
	<div>조회수 : ${detail.cnt }</div>
	<div>내용</div>
	<div>${detail.t_content }</div>
	<div>작성일 : ${detail.r_datetime }</div>
	<div>
		<a href=""><button>수정</button></a>
		<a href=""><button>삭제</button></a>
	</div>
</body>
</html>