<%@ page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
</head>
<body>
<%
    Student s=(Student)request.getAttribute("student");
%>

<%= s.getName()  %> <br>
<%= s.getAge()  %> <br>
<%= s.getContact()  %> <br>  <br>

<jsp:useBean id="student" class="model.Student" scope="session"></jsp:useBean>
<jsp:getProperty name="student" property="name" />  <br>
<jsp:getProperty name="student" property="age" />  <br>
<jsp:getProperty name="student" property="contact" />  <br>  <br>


      ${student.name}  <br>
      ${student.age} <br>
      ${student.contact} <br>
      

</body>
</html>