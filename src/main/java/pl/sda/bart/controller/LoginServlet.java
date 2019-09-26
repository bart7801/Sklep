package pl.sda.bart.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(LoginServlet.class.getSimpleName());
    private static final String USER = "user";
    private static final String PASSWORD = "password";
    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    public static final String PRIVILEGE = "privilege";
    public static final String ADMIN_PRIVILEGE = "admion_privilege";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String user = request.getParameter(USER);
        String password = request.getParameter(PASSWORD);
        if (ADMIN_USER.equals(user) && ADMIN_PASSWORD.equals(password)) {
            //cookie albo session
            logger.info("authorized for " + user);
            writer.println("<h3> succes login.</h3><br>");
            request.getRequestDispatcher("/index.jsp")
                    .include(request, response);
        } else {
            logger.warning("wrong auth ! user: " + user
                    + "; Password: " + password);
            writer.println("<h1> wrong user or password try gagain</h1><br");
            request.getRequestDispatcher("/login,jsp")
                    .include(request, response);
        }
    }

    private void setAdminPassword(HttpServletRequest request) {
        //session
        HttpSession session = request.getSession();
        session.setAttribute(PRIVILEGE, ADMIN_PRIVILEGE);
    }

    private void setAdminPrivilegeCookie(HttpServletResponse response){
        //cookie
        Cookie cookie = new Cookie(PRIVILEGE, ADMIN_PRIVILEGE);
        response.addCookie(cookie);
    }
}