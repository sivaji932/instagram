package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple validation
        if ("admin".equals(username) && "admin".equals(password)) {

            // ✅ FIX: always use context path
            response.sendRedirect(request.getContextPath() + "/welcome");

        } else {
            response.getWriter().println("Invalid credentials!");
        }
    }
}
