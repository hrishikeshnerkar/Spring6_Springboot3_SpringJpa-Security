package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    public  void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        System.out.println("In service");
        res.getWriter().println("Hello World");

        /*
        If i want to change the context then i can use html
        res.setContentType("text/html");
        res.getWriter().println("<h3><b>Hello</b></h3>");
         */
    }
}
