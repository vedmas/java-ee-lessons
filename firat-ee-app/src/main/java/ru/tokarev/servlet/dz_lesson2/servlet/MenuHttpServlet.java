package ru.tokarev.servlet.dz_lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/menu")
public class MenuHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<br>");
        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href=\"http://localhost:8080/" + req.getContextPath() + "/main\">Главная &nbsp;</a>");
        resp.getWriter().println("<a href=\"http://localhost:8080/" + req.getContextPath() + "/catalog\">&nbsp; Каталог &nbsp;</a>");
        resp.getWriter().println("<a href=\"http://localhost:8080/" + req.getContextPath() + "/cart\">&nbsp; Корзина &nbsp;</a>");
        resp.getWriter().println("<a href=\"http://localhost:8080/" + req.getContextPath() + "/order\">&nbsp; Заказ &nbsp;</a>");
        resp.getWriter().println("<br>");
        resp.getWriter().println("<br>");
    }
}
