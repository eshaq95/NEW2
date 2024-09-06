package com.example.bookgroup;

import dao.BookDao;
import dao.DB;
import model.users.Books.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ExploreServlet", value = "/ExploreServlet")
public class ExploreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DB db = null;

        try {

            db = new DB();
            Connection con = db.getCon();
            BookDao bookDao = new BookDao(con);
            ArrayList<Book> books = bookDao.allBooks();
            //Book book = books.get(0);

            request.setAttribute("books", books);

            RequestDispatcher dispatcher = request.getRequestDispatcher("Catalogue-layout-page.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
