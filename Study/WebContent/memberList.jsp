<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dto.People"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<People> list = (ArrayList<People>)request.getAttribute("list");

%>
<div align="center">
	<table border="1">
		<tr>
			<td>아이디</td><td>이름</td>
		</tr>
		
		<%
			for(People each : list){
				
		%>
				<tr>
					<td><%=each.getId() %></td>
					<td><%=each.getName() %></td>
				</tr>		
		<%		
			}
		%>
		
		
	</table>
</div>
</body>
</html>