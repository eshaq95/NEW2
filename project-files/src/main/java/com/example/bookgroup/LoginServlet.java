package com.example.bookgroup;

import dao.BookDao;
import dao.DB;
import dao.UserDao;
import model.users.Books.Book;
import model.users.Customer;
import utils.Mailer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().append("Served at: ").append(request.getContextPath());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Customer customer = new Customer(null, null, email, password, null, false, false);
        DB db = null;

        try {
            db = new DB();
            Mailer mailer = new Mailer(customer);
            Connection con = db.getCon();
            UserDao userDao = new UserDao(con);
            boolean userExists = userDao.doesUserExist(customer);
            boolean userIsVerified = userDao.isUserVerified(customer);
            System.out.println("working");
            if (!userExists) {
//                take them to failed page
                RequestDispatcher dispatcher = request.getRequestDispatcher("accountDoesNotExist.jsp");
                dispatcher.forward(request, response);
            } else if (userExists && !userIsVerified) {
//                exists and account not verified
                mailer.sendVerificationMail();
                RequestDispatcher dispatcher = request.getRequestDispatcher("notVerified.jsp");
                dispatcher.forward(request, response);
            } else if (userDao.validateCredentials(customer) == true) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            } else {
//              user probably inputted incorrect info
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginWithError.jsp");
                dispatcher.forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
