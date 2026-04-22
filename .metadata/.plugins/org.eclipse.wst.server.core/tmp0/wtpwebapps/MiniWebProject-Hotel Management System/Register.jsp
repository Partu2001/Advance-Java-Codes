<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-image: url("user.jpg");
    background-size: cover;       
    background-position: center;  
    background-repeat: no-repeat; 
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
}
.container {
    width: 350px;
    padding: 25px;
    
    background: rgba(255, 255, 255, 0.2); 
    backdrop-filter: blur(10px);           
    -webkit-backdrop-filter: blur(10px);  
    border-radius: 10px;
    box-shadow: 0 8px 32px rgba(0,0,0,0.3);
    text-align: center;
    border: 1px solid rgba(255,255,255,0.3);
}

h2 {
    margin-bottom: 20px;
    color: #fff;
}

input {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: none;
    border-radius: 5px;
    outline: none;
}
button {
    width: 95%;
    padding: 10px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}
button:hover {
    background-color: #0056b3;
}
</style>
</head>
<body>


<body>
<form action="RegisterServlet" method="post" class="container">
    <h2>Register</h2>
    Name <input type="text" name="name" placeholder="Enter Full Name" required>
    Email <input type="text" name="email" placeholder="Enter Email" required>
    Username <input type="text" name="username" placeholder="Enter Username" required>
    Password <input type="password" name="password" placeholder="Enter Password" required> 
    <button type="submit">Register</button>
</form>

</body>
</html>

