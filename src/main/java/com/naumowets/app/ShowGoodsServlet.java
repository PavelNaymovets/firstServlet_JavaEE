package com.naumowets.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowGoodsServlet", urlPatterns = "/good")
public class ShowGoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ListOfGoods list = new ListOfGoods();
        list.addGood(new Good(1, "Кирпич", 1200));
        list.addGood(new Good(2, "Кирпич", 1300));
        list.addGood(new Good(3, "Кирпич", 1400));
        list.addGood(new Good(4, "Кирпич", 1100));
        list.addGood(new Good(5, "Кирпич", 100));
        list.addGood(new Good(6, "Кирпич", 10));
        list.addGood(new Good(7, "Кирпич", 1900));
        list.addGood(new Good(8, "Кирпич", 200));
        list.addGood(new Good(9, "Кирпич", 2000));
        list.addGood(new Good(10, "Кирпич", 2400));

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.printf("<html><body>");

        for (Good good : list.goodList) {
            out.printf("<h1>" + good.toString() + "</h1>");
        }

        out.printf("</body></html>");
        out.close();
    }

}
