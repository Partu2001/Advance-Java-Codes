package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String usernameInput = request.getParameter("username");
        String password = request.getParameter("password");

        Connection con = null;
        PreparedStatement checkStmt = null;
        PreparedStatement insertStmt = null;
        ResultSet rs = null;

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String dbUser = "system";
        String dbPass = "system";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, dbUser, dbPass);
            String checkQuery = "SELECT * FROM UserData WHERE email = ? OR username = ?";
            checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, email);
            checkStmt.setString(2, usernameInput);

            rs = checkStmt.executeQuery();
            if (rs.next()) {
            	out.println("<div style='position:relative;height:100vh;"
            	        + "display:flex;justify-content:center;align-items:center;"
            	        + "font-family:Arial, sans-serif;'>"
            	        + "<h1 style='position:absolute;font-size:120px;"
            	        + "color:rgba(0,0,0,0.05);z-index:0;'>ERROR</h1>"
            	        + "<div style='width:380px;padding:25px;"
            	        + "background:linear-gradient(135deg,#ff4e50,#f9d423);"
            	        + "color:white;border-radius:12px;"
            	        + "box-shadow:0 8px 20px rgba(0,0,0,0.3);"
            	        + "text-align:center;z-index:1;'>"
            	        + "<h3 style='margin:0;font-size:22px;'>⚠ User already exists!</h3>"
            	        + "<p style='margin-top:10px;font-size:14px;'>Please try with a different email or username.</p>"
            	        + "<a href='Register.jsp' style='display:inline-block;margin-top:15px;"
            	        + "padding:10px 20px;background:white;color:#ff4e50;"
            	        + "text-decoration:none;font-weight:bold;border-radius:6px;'>"
            	        + "Go Back to Register</a>"
            	        + "</div>"
            	        + "</div>");
            } else {
                String insertQuery = "INSERT INTO UserData (name, email, username, password) VALUES (?, ?, ?, ?)";
                insertStmt = con.prepareStatement(insertQuery);
                insertStmt.setString(1, name);
                insertStmt.setString(2, email);
                insertStmt.setString(3, usernameInput);
                insertStmt.setString(4, password);
                int i = insertStmt.executeUpdate();

                if (i > 0) {
                    out.println("<h3 style='color:green;text-align:center;'>Registration Successful!</h3>");
                    response.sendRedirect("Login.jsp");
                } else {
                    out.println("<h3 style='color:red;text-align:center;'>Registration Failed!</h3>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
       
            }
        }
    }
