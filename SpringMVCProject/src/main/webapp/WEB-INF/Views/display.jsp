<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content</title>
</head>
<body>
This is the display.jsp
<%
List<String> e = (List<String>)request.getAttribute("employeesname");
for(String s : e){%>
	<ul><li> <%=s  %></li></ul>
	<%}%>
</body>
</html>