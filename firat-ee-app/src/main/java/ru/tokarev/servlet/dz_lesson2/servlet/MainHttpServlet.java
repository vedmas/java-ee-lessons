package ru.tokarev.servlet.dz_lesson2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainHttpServlet", urlPatterns = "/main")
public class MainHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<h1>Главная страница магазина</h1>");
        getServletContext().getRequestDispatcher("/menu").include(req, resp);
    }
}
