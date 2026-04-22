<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
<style type="text/css">
body{
background-color: red
}
</style>
</head>
<body>

<h2>Add the Product</h2>
<form action="ProductDetails.jsp" method="get">
Product Name : <input type="text" name="pname" required> <br> <br>
Product Quantity : <input type="number" name="pquantity" required> <br> <br>
Product Price : <input type="number" name="pprice" required> <br> <br>
<input type="submit">
</form>
</body>
</html>