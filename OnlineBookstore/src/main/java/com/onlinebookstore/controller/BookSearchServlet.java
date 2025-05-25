package com.onlinebookstore.controller;

import com.onlinebookstore.dao.BookDAO;
import com.onlinebookstore.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/searchBook")
public class BookSearchServlet extends HttpServlet {
    private BookDAO bookDAO;

    @Override
    public void init() throws ServletException {
        bookDAO = new BookDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        List<Book> books = bookDAO.searchBooksByTitle(title);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Search Results:</h2>");
        if (books.isEmpty()) {
            out.println("<p>No books found with the title: " + title + "</p>");
        } else {
            out.println("<table border='1'><tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th></tr>");
            for (Book book : books) {
                out.println("<tr><td>" + book.getId() + "</td><td>" + book.getTitle() + "</td><td>" + book.getAuthor() + "</td><td>" + book.getPrice() + "</td></tr>");
            }
            out.println("</table>");
        }
        out.println("</body></html>");
    }
}