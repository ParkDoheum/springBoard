<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form id="frm" action="${action}" method="post">
		<input type="text" name="i_board" value="${detail == null ? 0 : detail.i_board }">
		<input type="text" name="grp" value="${detail == null ? 0 : detail.grp }">
		<input type="text" name="seq" value="${detail == null ? 0 : detail.seq }">
		<input type="text" name="floor" value="${detail == null ? 0 : detail.floor }">
			
		<div>제목 : <input type="text" name="t_title" value="${detail.t_title}"></div>
		<div>내용 : <textarea name="t_content" rows="14" cols="5">${detail.t_content }</textarea></div>
		<div>						
			<input type="submit" value="등록">			
			<c:if test="${detail == null}">
				<input type="reset" value="다시쓰기">
			</c:if>
		</div>
	</form>
	
</body>
</html>