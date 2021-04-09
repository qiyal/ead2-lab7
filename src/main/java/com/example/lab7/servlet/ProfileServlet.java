package com.example.lab7.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "profile", value = "/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("IS_AUTH") != null) {
            req.getRequestDispatcher("profile.jsp").forward(req, resp);
            return;
        }
        resp.sendRedirect(req.getContextPath() + "/login");
    }
}
