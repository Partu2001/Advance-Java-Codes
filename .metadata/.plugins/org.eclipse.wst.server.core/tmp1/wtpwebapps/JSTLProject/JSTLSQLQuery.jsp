<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL JDBC</title>
</head>
<body>
<sql:setDataSource 
driver="oracle.jdbc.driver.OracleDriver"
url="jdbc:Oracle:thin:@localhost:1521:xe"
user="system"
password="system"
var="connection"
scope="session"
/>

<sql:query var="data" dataSource="${connection}">select * from employee</sql:query>

<c:forEach var="i" items="${data.rows }">
<c:out value="${i.id }"></c:out>
<c:out value="${i.name }"></c:out>
<c:out value="${i.salary}"></c:out>
</c:forEach>  <br> <br>

<sql:update dataSource="${connection}"> 
update employee set name=?,salary=? where id=?
<sql:param value="Prathmesh"></sql:param>
<sql:param value="100000"></sql:param>
<sql:param value="101"></sql:param>
</sql:update> <br> <br>

<sql:query var="data" dataSource="${connection}">select * from employee</sql:query>

<c:forEach var="i" items="${data.rows }">
<c:out value="${i.id }"></c:out>
<c:out value="${i.name }"></c:out>
<c:out value="${i.salary}"></c:out>
</c:forEach>  <br>  <br>

<sql:update dataSource="${connection}" > 
delete from employee where id=?
<sql:param value="102"></sql:param>
</sql:update> <br> <br>

<sql:update dataSource="${connection}"> 
insert into employee values(?,?,?)
<sql:param value="102"></sql:param>
<sql:param value="Vinit"></sql:param>
<sql:param value="30000"></sql:param>
</sql:update> <br> <br>



</body>
</html>