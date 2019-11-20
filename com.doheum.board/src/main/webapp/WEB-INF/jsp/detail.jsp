<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	

%>    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div><a href="list.do">게시판으로 돌아가기</a></div>
	<div>제목 : ${detail.vo.t_title }</div>
	<div>조회수 : ${detail.vo.cnt }</div>
	<div>내용</div>
	<div>${detail.vo.t_content }</div>
	<div>작성일 : ${detail.vo.r_datetime }</div>
	<div>
		<a href="mod.do?i_board=${detail.vo.i_board }"><button>수정</button></a>
		<a href=""><button>삭제</button></a>
		<a href="write.do?grp=${detail.vo.grp}&seq=${detail.vo.seq}&floor=${detail.vo.floor}"><button>답글달기!!</button></a>
	</div>
	<div>
		<c:if test="${detail.prevIboard > 0}">
			<a href="detail.do?i_board=${detail.prevIboard}"><button>이전글</button></a>
		</c:if>
		
		<c:if test="${detail.nextIboard > 0}">
			<a href="detail.do?i_board=${detail.nextIboard}"><button>다음글</button></a>
		</c:if>		
	</div>
</body>
</html>







