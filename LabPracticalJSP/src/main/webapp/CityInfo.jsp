<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>City Information</title>
</head>
<body>

<h1>City Info</h1>

<% String city=request.getParameter("city"); %>

<% if("Kolhapur".equals(city)){
%>
<h2>Kolhapur</h2> <br> 
<h4></h4> Kolhapur is a historic city in the state of Maharashtra, located on the banks of the Panchganga River. It’s known for its rich culture, temples, food, and traditional craftsmanship.</h2>
<% }
else if("Sangli".equals(city)){
%><h2>Sangli</h2><br>
<h4>Sangli is a well-known city in the western part of Maharashtra. Here’s a short overview: <br>Known as the “Turmeric City of India” due to large turmeric production
</h4>
<%} else if("Pune".equals(city)){
	%>
	<h2>Pune</h2> <br>
<h4>Pune is one of India’s प्रमुख (major) cities, known for its education, IT industry, and rich history.</h4>
<%} else if("Mumbai".equals(city)){
%>
<h2>Mumbai</h2> <br>
<h4>Mumbai is the capital city of the Indian state of Maharashtra and one of the most important financial, commercial, and entertainment hubs in the country.</h4>
<%} else if("New Delhi".equals(city)){
%>
<h2>New Delhi</h2> <br>
<h4>New Delhi is the capital of India and one of its most important political, cultural, and historical centers.</h4>
<%} 
%>
</body>
</html>