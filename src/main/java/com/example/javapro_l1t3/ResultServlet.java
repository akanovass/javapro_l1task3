package com.example.javapro_l1t3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/result")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2 style='text-align:center;'>Hello, " + name + " " + surname + " !</h2>");
    }


}
