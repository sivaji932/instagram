package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String user = (String)req.getSession().getAttribute("user");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html><body style='text-align:center;font-family:Arial;'>");
        out.println("<h2>Welcome, " + user + "!</h2>");
        out.println("<p>This is your Instagram Clone Home.</p>");
        out.println("</body></html>");
    }
}