<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="write.do" method="post">
		<div>제목 : <input type="text" name="t_title" value="${detail.t_title}"></div>
		<div>내용 : <textarea name="t_content" rows="14" cols="5">${detail.t_content }</textarea></div>
		<div>
			<input type="submit" value="등록">
			<input type="reset" value="다시쓰기">
		</div>
	</form>
</body>
</html>