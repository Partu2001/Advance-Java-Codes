<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard Page</title>

<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    height: 100vh;      
    width: 100%;         
    background-image: url("dashboard.jpg");
    background-size: cover;       
    background-position: center;  
    background-repeat: no-repeat; 
}
.header {
    background: rgba(0, 123, 255, 0.8);
    color: white;
    padding: 15px;
    text-align: center;
    font-size: 24px;
}
.menu {
    text-align: center;
    margin-top: 100px;
}
.menu a {
    display: inline-block;
    margin: 15px;
    padding: 12px 20px;
    text-decoration: none;
    background: rgba(40, 167, 69, 0.9);
    color: white;
    border-radius: 5px;
    font-size: 16px;
    transition: 0.3s;
}
.menu a:hover {
    background: #218838;
    transform: scale(1.05);
}
</style>

</head>
<body>

<div class="header">  Hotel Dashboard </div>

<div class="menu">
    <a href="ViewRoom.jsp">View Rooms</a>
    <a href="BookRoom.jsp">Book Room</a>
    <a href="AdminLogin.jsp">Admin</a>
</div>

</body>
</html>