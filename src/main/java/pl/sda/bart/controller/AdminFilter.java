package pl.sda.bart.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

import static pl.sda.bart.controller.LoginServlet.ADMIN_PRIVILEGE;
import static pl.sda.bart.controller.LoginServlet.PRIVILEGE;

@WebFilter(filterName = "AdminFilter", urlPatterns = {"/product"})
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        //before
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        String privilege = (String) session.getAttribute(PRIVILEGE);

        //session
        //HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        //String privilege = (String) session.getAttribute(PRIVILEGE);

        //cookie
        Cookie[] cookies = ((HttpServletRequest) servletRequest).getCookies();
        Optional<Cookie> privilegeCookie = Arrays.asList(cookies).stream()
                .findFirst();

        //action
        if (ADMIN_PRIVILEGE.equals(privilege)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.setContentType("text/html");
            PrintWriter writer = servletResponse.getWriter();
            writer.println("<h1>UNAUTHORISED ACCESS!</h1><br>");
            servletRequest.getRequestDispatcher("/index.jsp")
                    .include(servletRequest, servletResponse);
        }
    }
}
