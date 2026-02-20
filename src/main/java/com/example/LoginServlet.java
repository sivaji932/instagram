package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        // In a real app, validate against database
        req.getSession().setAttribute("user", username);
        resp.sendRedirect("welcome");
    }
}