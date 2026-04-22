<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Trains</title>
</head>
<body>

<h2>Find Train</h2>
<form  method="get">
Source: <input type="text" placeholder="Enter Source" name="source" required/> <br> <br>
Destination: <input type="text" placeholder="Enter Destination" name="destination" required/> <br> <br>
<input type="submit" value="search">
</form>

 <%
String trainSource = request.getParameter("source");
String trainDestination = request.getParameter("destination");

if(trainSource != null && trainDestination != null){
%>

<jsp:forward page="View2.jsp">
    <jsp:param name="source" value="<%= trainSource %>" />
    <jsp:param name="destination" value="<%= trainDestination %>" />
</jsp:forward>

<%
}
%>
   

</body>
</html>