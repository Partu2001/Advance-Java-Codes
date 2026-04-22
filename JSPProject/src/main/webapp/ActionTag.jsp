<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>

<h1> This is Include Page</h1>
 <h2>Enter Your Name</h2>

    <form method="get">
        <input type="text" name="name" placeholder="Enter your name" />
        <input type="submit" />
    </form>

    <%
        String name = request.getParameter("name");
        if(name != null) {
    %>    
        <jsp:forward page="Other.jsp">
         <jsp:param name="name" value="<%= name %>" />
        </jsp:forward>

    <%} %>

</body>
</html> 