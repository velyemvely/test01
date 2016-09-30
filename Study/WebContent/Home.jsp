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
<h1>메인화면</h1>
<br><br>
<hr>
	<form action="login.do" method="post" name="loginFrame">
		아이디 : <input type="text" name="id"><br>
		패스워드 : <input type="password" name="pw"><br>		
		<input type="hidden" name="cmd" value="login">
		<input type="submit" value="로그인">	
		<input type="button" value="회원가입" onclick="javascript:window.location='join.do?cmd=joinForm'">
	</form>
	
</div>

</body>
</html>