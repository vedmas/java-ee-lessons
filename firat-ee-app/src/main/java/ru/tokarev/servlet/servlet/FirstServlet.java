package ru.tokarev.servlet.servlet;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

@Slf4j
public class FirstServlet implements Servlet, Serializable {

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("servlet created");
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        log.info("new request");

        servletRequest.setAttribute("headerText", "FirstHttpServlet");
        config.getServletContext().getRequestDispatcher("/header").include(servletRequest, servletResponse);

    }

    @Override
    public String getServletInfo() {
        return "Our firs servlet";
    }

    @Override
    public void destroy() {

    }
}
