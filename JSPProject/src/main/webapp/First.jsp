<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
     public void jspiInit(){
	System.out.println(" JSP Init called");
}
     public void jspiDestroy(){
	System.out.println(" JSP Destroy called");
}
%>

<%
	System.out.println(" JSP Service called");

%>
</body>
</html>