package ru.tokarev.servlet.dz_lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cart")
public class CartHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h2>Корзина с товарами</h2>");
        getServletContext().getRequestDispatcher("/menu").include(req, resp);
        resp.getWriter().println("<p>Продукты в корзине: </p>");
        getServletContext().getRequestDispatcher("/product").include(req, resp);
    }
}
