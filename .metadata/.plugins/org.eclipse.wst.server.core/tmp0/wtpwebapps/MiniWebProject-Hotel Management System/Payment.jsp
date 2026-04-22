<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Page</title>
<style>
body {
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #74ebd5, #ACB6E5);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
}

form {
    background: white;
    padding: 25px;
    border-radius: 12px;
    width: 300px;
    text-align: center;
    box-shadow: 0 8px 20px rgba(0,0,0,0.2);
}

h2 {
    margin-bottom: 15px;
    color: #333;
}

select, input {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
    outline: none;
}

button {
    width: 95%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 6px;
    cursor: pointer;
    font-size: 16px;
}

button:hover {
    background-color: #45a049;
}
</style>

</head>
<body>

<form action="PaymentServlet" method="post">
    <h2>Payment Details</h2>
    Payment Method<br> <select name="method">
        <option value="Card">Card</option>
        <option value="UPI">UPI</option>
        <option value="NetBanking">Net Banking</option>
    </select>
    Enter Amount <br> <input type="number" name="pay" required>
    Enter Password  <br> <input type ="password" name="pass" required>
    <br><br>
    <button type="submit">Pay</button>

</form>

</body>
</html>