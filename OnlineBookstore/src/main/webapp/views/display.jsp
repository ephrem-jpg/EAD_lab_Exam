<content>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.onlinebookstore.model.Book" %>
<%@ page import="com.onlinebookstore.service.BookService" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>

<%
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookService = (BookService) context.getBean("bookService");
    List<Book> books = bookService.getAllBooks();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Book List</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Book List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
        </tr>
        <%
            for (Book book : books) {
        %>
        <tr>
            <td><%= book.getId() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPrice() %></td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="register.jsp">Register a new book</a>
    <a href="delete.jsp">Delete a book</a>
    <a href="search.jsp">Search for a book</a>
</body>
</html>
</content>