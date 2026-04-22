package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddRoomServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
      
        String roomNumber = request.getParameter("roomNumber");
        String roomType = request.getParameter("roomType");
        String bedType = request.getParameter("bedType");
        String status = request.getParameter("status");
        double price = Double.parseDouble(request.getParameter("price"));
        String capStr = request.getParameter("capacity");
        String[] amenitiesArr = request.getParameterValues("amenities");
        String amenities = "";
        
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "system";
        Connection con = null;
        PreparedStatement pstmt = null;


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, username, password);            
            int capacity = (capStr != null && !capStr.isEmpty()) ? Integer.parseInt(capStr) : 0;
          
            if (amenitiesArr != null) {
                amenities = String.join(",", amenitiesArr);
            }
            pstmt = con.prepareStatement(
            	    "insert into room (ROOMNO, ROOMTYPE, BEDTYPE, PRICE, CAPACITY, AMENITIES, STATUS) values (?, ?, ?, ?, ?, ?, ?)"
            	);
            pstmt.setString(1, roomNumber);
            pstmt.setString(2, roomType);
            pstmt.setString(3, bedType);
            pstmt.setDouble(4, price);
            pstmt.setInt(5, capacity);
            pstmt.setString(6, amenities);
            pstmt.setString(7, status);
            
            int result = pstmt.executeUpdate();
            if (result > 0) {
                response.sendRedirect("ViewRoom.jsp");
            } else {
                out.println("<h3 style='color:red;text-align:center;'>Failed to Add Room</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
        } finally {
            try {
               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}