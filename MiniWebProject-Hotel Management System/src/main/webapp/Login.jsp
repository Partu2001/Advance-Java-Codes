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
    background-image: url("loginuser.jpg");
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
    width: 320px;
    padding: 25px;
    background: rgba(255, 255, 255, 0.15); 
    backdrop-filter: blur(12px);           
    -webkit-backdrop-filter: blur(12px);  
    border-radius: 15px;
    border: 1px solid rgba(255, 255, 255, 0.3);
    text-align: center;
    box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
}
h2 {
    margin-bottom: 20px;
    color: white;
}
input {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border-radius: 8px;
    border: none;
    outline: none;
}
button {
    width: 95%;
    padding: 10px;
    background: #4facfe;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    font-size: 16px;
}
button:hover {
    background: #007bff;
}
</style>

<form action="LoginServlet" method="post" class="container">
    <h2>Login</h2>
   Username <input type="text" placeholder="Enter Username" name="username" required>
   Password <input type="password"  placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button>
</form>
</body>
</html>