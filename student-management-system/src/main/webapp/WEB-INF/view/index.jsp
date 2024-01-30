<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
<h2> welcome to spring mvc</h2>
<hr/>
<%
out.println("<h3>current date/time is: "+new Date()+"</h3><hr/>");

%>
<a href="show-form">click to begin</a><br/>
<a href="display">Display</a>
</body>
</html>