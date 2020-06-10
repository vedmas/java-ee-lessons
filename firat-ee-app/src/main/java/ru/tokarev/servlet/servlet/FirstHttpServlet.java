package ru.tokarev.servlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "FirstHttpServlet", urlPatterns = "/first_http_servlet/*")
public class FirstHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        req.setAttribute("headerText", "FirstHttpServlet");
        getServletContext().getRequestDispatcher("/header").include(req, resp);

        resp.getWriter().println("<h1>Привет!</h1>");
        resp.getWriter().println("<p>contextPath: " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>servletPath: " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>pathInfo: " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>queryString: " + req.getQueryString() + "</p>");

        Cookie ck = new Cookie("user", "userName");
        ck.setMaxAge(30);
        resp.addCookie(ck);

        resp.setHeader("Our-header", "value");

        Enumeration<String> names = req.getParameterNames();
        while (names.hasMoreElements()) {
            String name  = names.nextElement();
            resp.getWriter().println("<p>" + name + ": " + req.getParameter(name) + "</p>");
        }
//        resp.sendRedirect(req.getContextPath() + "/first_servlet");
    }
}
