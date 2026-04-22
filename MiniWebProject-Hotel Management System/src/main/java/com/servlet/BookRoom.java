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

@WebServlet("/BookRoom")
public class BookRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BookRoom() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();

		    String roomNo = request.getParameter("roomno");
		    String checkIn = request.getParameter("checkin");
		    String checkOut = request.getParameter("checkout");
		    String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String username = "system";
		    String password = "system";
		    PreparedStatement pstmt=null;

		    try {
		        Class.forName("oracle.jdbc.driver.OracleDriver");
		        Connection con = DriverManager.getConnection(url, username, password);
                pstmt = con.prepareStatement(  "select status from room where roomno = ?" );
		        pstmt.setString(1, roomNo);
		        ResultSet rs = pstmt.executeQuery();

		        if (rs.next()) {
		            String status = rs.getString("status");

		            if ("Available".equalsIgnoreCase(status)) {
		                pstmt = con.prepareStatement("insert into bookings (roomno, check_in, check_out) values (?, TO_DATE(?, 'YYYY-MM-DD'), TO_DATE(?, 'YYYY-MM-DD'))"  );
		                pstmt.setString(1, roomNo);
		                pstmt.setString(2, checkIn);
		                pstmt.setString(3, checkOut);
		                pstmt.executeUpdate();
		                pstmt = con.prepareStatement( "update room set status='Booked' where roomno=?");
		                pstmt.setString(1, roomNo);
		                pstmt.executeUpdate();
		                
		                out.println(
		                	    "<div style='"
		                	    + "background: linear-gradient(to right, #28a745, #5cd65c);"
		                	    + "color: white;"
		                	    + "padding: 12px 20px;"
		                	    + "margin: 20px auto;"
		                	    + "width: fit-content;"
		                	    + "border-radius: 10px;"
		                	    + "font-size: 18px;"
		                	    + "font-weight: bold;"
		                	    + "box-shadow: 0 4px 10px rgba(0,0,0,0.2);"
		                	    + "text-align: center;"
		                	    + "'>"
		                	    + "✅ Room Booked Successfully!"
		                	    + "</div>"
		                	);
		                response.sendRedirect("Payment.jsp");

		            } else {
		                out.println("<h3 style='color:red;text-align:center;'>Room Already Booked</h3>");
		            }

		        } else {
		            out.println("<h3 style='color:red;text-align:center;'>Room Not Found</h3>");
		        }

		        con.close();

		    } catch (Exception e) {
		        e.printStackTrace();
		        out.println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
		    }
		}
	}


