<%@page import="java.util.Date"%>
<%@ page session="true" %>
<%@ page errorPage="error.jsp" %>
<%@ page buffer="1kb" autoFlush="false" %>   
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Directives</title>
</head>
<body>


<%
  Date date=new Date();
  out.println(date);
  
  session.setAttribute("name", date);
  
  //int num=10;
  //out.println(num/0);
  
  for(int i=0;i<190;i++){
	  out.println(i);
  }
%>
</body>
</html>