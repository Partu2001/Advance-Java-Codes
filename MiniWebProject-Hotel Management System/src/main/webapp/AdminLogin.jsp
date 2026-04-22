<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<style>
body {
    font-family: Arial, sans-serif;
    background: url("adminlogin.jpg") no-repeat center center/cover;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}
.container {
    width: 320px;
    padding: 25px;
    border-radius: 15px;
    text-align: center;
    background: rgba(255, 255, 255, 0.2); 
    backdrop-filter: blur(10px);
    -webkit-backdrop-filter: blur(10px);
    box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
    border: 1px solid rgba(255, 255, 255, 0.3);
}
h2 {
    margin-bottom: 20px;
    color: #fff;
}
input {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border-radius: 5px;
    border: none;
    outline: none;
}

button {
    width: 95%;
    padding: 10px;
    background: #4facfe;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: 0.3s;
}
button:hover {
    background: #007bff;
}
</style>
<form action="AdminLogin" method="post" class="container">
    <h2>Login</h2>
  Admin Username <input type="text" placeholder="Enter Username" name="username" required>
  Admin Password <input type="password"  placeholder="Enter Password" name="password" required> <br> <br>
    <button type="submit">Login</button>
</form>
</body>
</html>