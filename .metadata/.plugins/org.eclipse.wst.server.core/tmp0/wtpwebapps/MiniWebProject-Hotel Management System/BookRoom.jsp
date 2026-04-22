<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookRoom Page</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-image: url("bookroom.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}
form {
    background: rgba(255, 255, 255, 0.1); 
    backdrop-filter: blur(15px); 
    -webkit-backdrop-filter: blur(15px); 
    padding: 30px;
    border-radius: 15px;
    border: 1px solid rgba(255, 255, 255, 0.3);
    box-shadow: 0 8px 32px rgba(0, 0, 0, 0.25);
    text-align: center;
    color: white;
    }
input, select {
    width: 220px;
    padding: 10px;
    margin: 10px 0;
    border: none;
    border-radius: 5px;
    outline: none;
}
button {
    padding: 10px 20px;
    background-color: rgba(76, 175, 80, 0.9);
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
button:hover {
    background-color: rgba(69, 160, 73, 1);
}
</style>
</head>
<body>

<form action="BookRoom" method="post">
    Room Number<br>
   <select name="roomno"  required> 
   <option value="1001">1001 </option>
   <option value="1002">1002 </option>
   <option value="1003">1003 </option>
   <option value="1004">1004 </option>
   <option value="1005">1005 </option>
   <option value="1006">1006 </option>
   <option value="1007">1007 </option>
   <option value="1008">1008 </option>
   <option value="1009">1009 </option>
   <option value="1010">1010 </option>
   <option value="1011">1011 </option>
   <option value="1012">1012 </option>
   <option value="1013">1013 </option>
   <option value="1014">1014 </option>
   <option value="1015">1015 </option>
   <option value="1016">1016 </option>
   <option value="1017">1017 </option>
   <option value="1018">1018 </option>
   <option value="1019">1019 </option>
   <option value="1020">1020 </option>
    </select><br> <br>
    Check-In Date<br>
    <input type="date" name="checkin" required><br>
    Check-Out Date<br>
    <input type="date" name="checkout" required><br>
    <button type="submit">Book</button>
</form>
</body>
</html>