package ru.tokarev.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FooterFilter implements Filter {


    private FilterConfig filterConfig;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletResponse.setContentType("text/html; charset=utf-8");
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.getWriter().println("<hr>");
        servletResponse.getWriter().println("<br>");
        servletResponse.getWriter().println("<footer>Это лучший магазин!</footer>");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {

    }
}
