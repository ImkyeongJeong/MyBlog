<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container {
		text-align: center;
	}
</style>
</head>
<body>
<div id="container">
	<form action="postWrite.do" method="post">
		<p><input type="text" id="title" name="title" placeholder="제목"></p>
		<p><textarea id="content" name="content"></textarea></p>
		<button type="submit">등록</button>
		<button class="find" onClick="history.back();">취소</button>
	</form>
</div>
</body>
</html>