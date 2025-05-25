package com.onlinebookstore.controller;

import com.onlinebookstore.dao.BookDAO;
import com.onlinebookstore.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerBook")
public class BookRegistrationServlet extends HttpServlet {
    private BookDAO bookDAO;

    @Override
    public void init() throws ServletException {
        bookDAO = new BookDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        boolean isSuccess = bookDAO.addBook(book);

        if (isSuccess) {
            response.getWriter().write("Book registered successfully!");
        } else {
            response.getWriter().write("Failed to register book.");
        }
    }
}