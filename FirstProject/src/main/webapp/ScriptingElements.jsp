<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Elements</title>
</head>
<body>

 <!-- Declaration (Method and Variables) -->
 <%!
   int count=0;
 public void display(){%>
	 <%out.println("Hello"); %>
 <%!}%>
 
 
 <!-- Scriplet (Java code and servlet code) -->
 
 <%
   for(int i=0;i<10;i++){
	   count++;
   }
 
 System.out.println(count);
 out.println(count);
 display();
 out.println("Display");
 %>
 
 <!-- Expression -->
 <%=count %>
 

</body>
</html>