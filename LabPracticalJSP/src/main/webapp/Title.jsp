<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Page</title>
</head>
<body>

<h1>Welcome to the Train Info System</h1>

<form method="get">
    Username : <input type="text" placeholder="Enter User Name" required name="name"> <br><br>
    Password : <input type="password" placeholder="Enter Password" required name="password"> <br><br>
    <input type="submit">
</form>

<%
    String name = request.getParameter("name");
    String pass = request.getParameter("password");

    if("Admin".equals(name) && "Admin".equals(pass)) {
%>

    <jsp:forward page="Index.jsp">
        <jsp:param name="name" value="<%= name %>" />
        <jsp:param name="password" value="<%= pass %>" />
    </jsp:forward>

<%
    }
%>

</body>
</html>