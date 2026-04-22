<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Train Details</title>
</head>
<body>
<%
String trainNo=request.getParameter("trainno");

String trainName="";
String trainSource="";
String trainDestination="";
String trainRoute="";

if("12780".equals(trainNo)){
	trainName="Goa Express";
	trainSource="Pune";
	trainDestination="Goa";
	trainRoute="Pune-Satara-Sangli-Belgavi-Madgaon(Goa)";
}else if("12951".equals(trainNo)){
	trainName="Rajdhani Express";
	trainSource="Mumbai";
	trainDestination="New Delhi";
	trainRoute="Mumbai-Surat-Vadodara-New Delhi";
}else if("11029".equals(trainNo)){
	trainName="Koyana Express";
	trainSource="Kolhapur";
	trainDestination="Mumbai";
	trainRoute="Kolhapur-Sangli-Satara-Pune-Thane-Dadar-Mumbai";
}else if("12002".equals(trainNo)){
	trainName="Shatabdi Express";
	trainSource="New Delhi";
	trainDestination="Bhopal";
	trainRoute="New Delhi-Agra-Jhasi-Bhopal";
}else if("12123".equals(trainNo)){
	trainName="Deccan Queen Express";
	trainSource="Mumbai";
	trainDestination="Pune";
	trainRoute="Mumbai-Karjat-Lonavla-Pune";
}
%>

<h1>Train Details</h1>
<table border="1">
<thead>
<tr><td>Train No</td>
<td><%=trainNo %></td>
</tr>
<tr><td>Train Name</td>
<td><%=trainName %></td>
</tr>
<tr><td>Train Source</td>
<td><%=trainSource %></td>
</tr>
<tr><td>Train Destination</td>
<td><%=trainDestination %></td>
</tr>
<tr><td>Train Route</td>
<td><%=trainRoute %></td>
</tr>
</thead>
</table> <br> <br>

<a href="Index.jsp">Back to Home</a>

</body>
</html>