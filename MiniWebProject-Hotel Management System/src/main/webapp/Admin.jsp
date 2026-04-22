<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
<style type="text/css">
body {
    font-family: Arial, sans-serif;
    margin: 0;
    background: linear-gradient(to right, #74ebd5, #acb6e5);
    text-align: center;
    margin: 0;
    padding: 0;
    height: 100vh;      
    width: 100%;         
    background-image: url("admin.jpg");
    background-size: cover;       
    background-position: center;  
    background-repeat: no-repeat; 
}
h2 {
    margin-top: 80px;
    font-size: 30px;
    color: #333;
}
a {
    display: inline-block;
    margin: 20px;
    padding: 12px 25px;
    text-decoration: none;
    background: #007bff;
    color: white;
    border-radius: 5px;
    font-size: 16px;
    transition: 0.3s;
}
a:hover {
    background: #0056b3;
    transform: scale(1.05);
}
</style>
</head>
<body>

<body>
<h2>Admin</h2>
<a href="AddRoom.jsp">Add Room</a>
<a href="ViewRoom.jsp">View Rooms</a>
<a href="ViewBookings.jsp">View Bookings</a>

</body>
</html>