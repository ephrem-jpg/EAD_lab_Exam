<html>
<head>
    <title>Search Books</title>
</head>
<body>
    <h1>Search for a Book</h1>
    <form action="BookSearchServlet" method="get">
        <label for="title">Book Title:</label>
        <input type="text" id="title" name="title" required>
        <input type="submit" value="Search">
    </form>

    <c:if test="${not empty books}">
        <h2>Search Results:</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
            </tr>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${empty books}">
        <p>No books found.</p>
    </c:if>
</body>
</html>