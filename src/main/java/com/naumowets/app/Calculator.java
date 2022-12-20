package com.naumowets.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/calc")
public class Calculator extends HttpServlet {
    Logger log = LoggerFactory.getLogger(Calculator.class);

    @Override
    public void init() throws ServletException {
        log.debug("Запустился калькулятор");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        int firstNumber = Integer.parseInt(req.getParameter("a"));
        int secondNumber = Integer.parseInt(req.getParameter("b"));
        int sum = firstNumber + secondNumber;

        writer.printf("<html><body><h1>" + firstNumber + " + " + secondNumber + " = " + sum + "</h1></body></html>");
        writer.close();
    }
}
