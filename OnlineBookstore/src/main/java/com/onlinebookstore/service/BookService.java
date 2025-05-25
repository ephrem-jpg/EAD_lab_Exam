package com.onlinebookstore.service;

import com.onlinebookstore.dao.BookDAO;
import com.onlinebookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public void registerBook(Book book) {
        bookDAO.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    public void deleteBook(int id) {
        bookDAO.deleteBook(id);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookDAO.searchBooksByTitle(title);
    }
}