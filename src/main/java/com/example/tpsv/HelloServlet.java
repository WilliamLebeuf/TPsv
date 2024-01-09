package com.example.tpsv;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String view = request.getParameter("view");

        if("view1".equals(view))
        {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/view1.jsp");
            dispatcher.forward(request, response);
        }
        if("view2".equals(view))
        {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/view2.jsp");
            dispatcher.forward(request, response);
        }
    }
}