<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Train</title>
</head>
<body>
<% 
String trainSource=request.getParameter("source");
String trainDestination=request.getParameter("destination");
%>

<h3>Trains From  <%= trainSource %> to <%= trainDestination %></h3>

<table border="1">
<thead>
<tr>
<th> Train No</th>
<th> Train Name</th>
<th> Train Route</th>
</tr>

<%
if("Pune".equals(trainSource) && "Goa".equals(trainDestination)){
%>
<tr>
<td>12780</td>
<td>Goa Express</td>
<td>Pune-Satara-Sangli-Belgavi-Madgaon(Goa)</td>
</tr>
<%
}else if("Mumbai".equals(trainSource) && "New Delhi".equals(trainDestination)){
%>
<tr>
<td>12951</td>
<td>Rajdhani Express</td>
<td>Mumbai-Surat-Vadodara-New Delhi</td>
</tr>
<%
}else if("Kolhapur".equals(trainSource) && "Mumbai".equals(trainDestination)){
%>
<tr>
<td>11029</td>
<td>Koyana Express</td>
<td>Kolhapur-Sangli-Satara-Pune-Thane-Dadar-Mumbai</td>
</tr>
<%	
}else if("New Delhi".equals(trainSource) && "Bhopal".equals(trainDestination)){
%>
<tr>
<td>12002</td>
<td>Shatabdi Express</td>
<td>New Delhi-Agra-Jhasi-Bhopal</td>
</tr>
<%	
}else if("Mumbai".equals(trainSource) && "Pune".equals(trainDestination)){
%>
<tr>
<td>12123</td>
<td>Deccan Express</td>
<td>Mumbai-Karjat-Lonavla-Pune</td>
</tr>
<%	
}else{
%>
<tr><td colspan="3">No trains Found </td></tr>
<%
}
%>
</thead>
</table>

<a href="Index.jsp">Back to Home</a>
</body>
</html>