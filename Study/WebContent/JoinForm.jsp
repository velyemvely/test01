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
		���̵� : <input type="text" name="id"><br>
		�н����� : <input type="password" name="pw"><br>
		�̸� : <input type="text" name="name"><br>
		<input type="hidden" name="cmd" value="join">
		<input type="submit" value="ȸ������">
	</form>
</div>
</body>
</html>