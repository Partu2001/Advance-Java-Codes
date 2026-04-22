<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
<style type="text/css">
body{
background-color:brown;
}

h2{
color:blue;
}
</style>
</head>
<body>

<h2>Product Details</h2>

<%
 String pName=request.getParameter("pname");
 String pQuantity=request.getParameter("pquantity");
 String pPrice=request.getParameter("pprice");
 
%>

 Product Name :<%= pName %> <br> 
 Product Quantity :<%= pQuantity %> <br> 
 Product Price :<%= pPrice %> <br> 

</body>
</html>