<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>City App</title>
</head>
<body>

<h2>City App</h2>

<form action="CityInfo.jsp" method="get">
City Name : <select name="city" required>
<option value="Kolhapur"> Kolhapur</option>
<option value="Sangli"> Sangli</option>
<option value="Pune"> Pune</option>
<option value="Mumbai"> Mumbai</option>
<option value="New Delhi"> New Delhi</option>
</select>
<input type="submit">
</form>

</body>
</html>