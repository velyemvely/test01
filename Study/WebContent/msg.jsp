<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String msg = (String)request.getAttribute("msg");
	String nextPage = (String)request.getAttribute("nextPage");
%>
<script type="text/javascript">
	alert("<%=msg%>");
	location.href="<%=nextPage%>";
</script>

</body>
</html>