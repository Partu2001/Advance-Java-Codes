<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output Page</title>
</head>
<body>

<h1>This is Other Page</h1>
<%
String name=request.getParameter("name");
%>
 <h1>Hello <%= name %> </h1>
</body>
</html>