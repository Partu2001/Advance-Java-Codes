<%@ page import="java.sql.*" %>
<html>
<head>
<title>View Bookings</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    text-align: center;
    margin: 0;
    padding: 0;
}

h2 {
    margin-top: 20px;
    color: #333;
}

table {
    margin: 20px auto;
    border-collapse: collapse;
    width: 80%;
    background-color: #ffffff;
}

th {
    background-color: #4CAF50;
    color: white;
    padding: 10px;
}

td {
    padding: 10px;
    border: 1px solid #ddd;
}

tr:nth-child(even) {
    background-color: #f9f9f9;
}

tr:hover {
    background-color: #f1f1f1;
}
</style>

</head>
<body>

<h2>Booking Details</h2>

<table>
<tr>
    <th>Room No</th>
    <th>Check In</th>
    <th>Check Out</th>
</tr>

<%
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String username = "system";
String password = "system";
Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con = DriverManager.getConnection(url, username, password);
    pstmt = con.prepareStatement( "select roomno, check_in, check_out from bookings");
    rs = pstmt.executeQuery(); 

    while(rs.next()){
%>
<tr>
    <td><%= rs.getString("roomno") %></td>
    <td><%= rs.getDate("check_in") %></td>
    <td><%= rs.getDate("check_out") %></td>
</tr>
<%
    }
} catch(Exception e) {
%>
<tr>
    <td colspan="3" style="color:red;">
        Error: <%= e.getMessage() %>
    </td>
</tr>
<%
} 
%>

</table>

</body>
</html>