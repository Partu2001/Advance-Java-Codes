<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Rooms</title>

<style>
body {
    font-family: Arial, sans-serif;
    background: linear-gradient(to right, #36d1dc, #5b86e5);
    background-image: url("viewroom.jpg");
    background-size: cover;       
    background-position: center;  
    background-repeat: no-repeat; 
    height: 100vh;
    display: flex;
    margin: 0;
    padding: 0;
}

.container {
    width: 90%;
    margin: 40px auto;
    background: rgba(255, 255, 255, 0.2); 
    backdrop-filter: blur(12px);          
    -webkit-backdrop-filter: blur(12px);  
    padding: 20px;
    border-radius: 15px;
    border: 1px solid rgba(255, 255, 255, 0.3);
    box-shadow: 0px 8px 32px rgba(0,0,0,0.25);
}

h2 {
    text-align: center;
    color: #333;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
    background: rgba(255,255,255,0.8); 
    border-radius: 10px;
    overflow: hidden;
}
table th, table td {
    padding: 10px;
    text-align: center;
    border-bottom: 1px solid #ddd;
}

table th {
    background-color: #4CAF50;
    color: white;
}

tr:hover {
    background-color: #f2f2f2;
}

.status-available {
    color: green;
    font-weight: bold;
}

.status-booked {
    color: red;
    font-weight: bold;
}

.no-data {
    text-align: center;
    color: red;
    margin-top: 20px;
}
</style>

</head>
<body>

<div class="container">
    <h2>Room List</h2>
    <table>
        <tr>
            <th>Room No</th>
            <th>Room Type</th>
            <th>Bed Type</th>
            <th>Price</th>
            <th>Capacity</th>
            <th>Amenities</th>
            <th>Status</th>
        </tr>
<%
Connection con = null;
Statement stmt = null;
ResultSet rs = null;

try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
    stmt = con.createStatement();
    rs = stmt.executeQuery("select * from room");

    boolean hasData = false;
    while (rs.next()) {
        hasData = true;
%>
        <tr>
            <td><%= rs.getString("ROOMNO") %></td>
            <td><%= rs.getString("ROOMTYPE") %></td>
            <td><%= rs.getString("BEDTYPE") %></td>
            <td>₹ <%= rs.getDouble("price") %></td>
            <td><%= rs.getInt("capacity") %></td>
            <td><%= rs.getString("amenities") %></td>
            <td>
                <%
                    String status = rs.getString("status");
                    if ("Available".equalsIgnoreCase(status)) {
                %>
                        <span class="status-available">Available</span>
                <%
                    } else {
                %>
                        <span class="status-booked">Booked</span>
                <%
                    }
                %>
            </td>
        </tr>
<%}
    if (!hasData) {
%>
        </table>
        <p class="no-data">No Rooms Found</p>
<%}

} catch (Exception e) {
%>
    <p class="no-data">Error: <%= e.getMessage() %></p>
<%
} %>
 </table>
</div>

</body>
</html>