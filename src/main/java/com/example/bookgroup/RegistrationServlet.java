package com.example.bookgroup;

import dao.DB;
import dao.UserDao;
import model.users.Customer;
import utils.Mailer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");

        Customer customer = new Customer(firstName, lastName, email, password, phoneNumber, false, false);

        boolean registered = false;
        // TODO check if user email or password exists -- raymond

        try {
            DB db = new DB();
            Connection con = db.getCon();
            UserDao userDao = new UserDao(con);
            Mailer mailer = new Mailer(customer);

            if (userDao.doesUserExist(customer) == false) {
//              if user doesn't exist, create user
                userDao.registerUser(customer);
                mailer.sendVerificationMail();
//                redirect user to success page
                RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
                dispatcher.forward(request, response);
            } else {
                //  redirect to user exists page
                RequestDispatcher dispatcher = request.getRequestDispatcher("accountExist.jsp");
                dispatcher.forward(request, response);
                // reset link...
            }

        } catch (SQLException e) {
            // push user to something went wrong page?
            e.printStackTrace();
        }
    }

}
