<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<form action="join.do" method="post">
		아이디 : <input type="text" name="id"><br>
		패스워드 : <input type="password" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		<input type="hidden" name="cmd" value="join">
		<input type="submit" value="회원가입">
	</form>
</div>
</body>
</html>