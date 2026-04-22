<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Room</title>

<style>
body {
    font-family: Arial;
    height: 100vh;
    width: 100%;
    background-image: url("addroom.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
}
.container {
    width: 400px;
    padding: 25px;
    border-radius: 15px;
    background: rgba(255, 255, 255, 0.15);
    backdrop-filter: blur(12px);
    -webkit-backdrop-filter: blur(12px);
    border: 1px solid rgba(255, 255, 255, 0.3);
    box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
    color: #fff;
}
input, select {
    width: 100%;
    padding: 10px;
    margin: 8px 0;
    border: none;
    border-radius: 6px;
    outline: none;
}
button {
    background-color: #28a745;
    color: white;
    padding: 10px;
    border: none;
    width: 100%;
    border-radius: 6px;
    cursor: pointer;
    font-weight: bold;
}
button:hover {
    background-color: #218838;
}
h2 {
    text-align: center;
    margin-bottom: 15px;
}
</style>
</head>
<body>

<div class="container">
<h2>Add Room</h2>

<form action="AddRoomServlet" method="post">
   Room Number <select name="roomNumber" required>
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
   </select>
   Room Type <select name="roomType">
        <option value="Single">Single</option>
        <option value="Double">Double</option>
        <option value="Deluxe">Deluxe</option>
    </select>
   Bed Type <select name="bedType">
    <option>Single Bed</option>
    <option>Double Bed</option>
    <option>King Size</option>
    </select>
   Price <input type="number" name="price" required>
   Capacity  <input type="number" name="capacity">
   Amentites <input type="checkbox" name="amenities" value="AC"> AC
            <input type="checkbox" name="amenities" value="WiFi"> WiFi
            <input type="checkbox" name="amenities" value="TV"> TV
            <input type="checkbox" name="amenities" value="Parking"> Parking
            <input type="checkbox" name="amenities" value="Breakfast"> Breakfast    
   Status <select name="status">
        <option value="Available">Available</option>
        <option value="Booked">Booked</option>
        </select>
    <button type="submit">Add Room</button>

</form>
</div>

</body>
</html>