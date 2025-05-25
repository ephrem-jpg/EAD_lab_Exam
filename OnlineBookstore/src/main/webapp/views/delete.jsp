<html>
<head>
    <title>Delete Book</title>
</head>
<body>
    <h2>Delete Book</h2>
    <form action="BookDeletionServlet" method="post">
        <label for="bookId">Enter Book ID to Delete:</label>
        <input type="text" id="bookId" name="bookId" required>
        <input type="submit" value="Delete Book">
    </form>
    <br>
    <c:if test="${not empty message}">
        <div>${message}</div>
    </c:if>
</body>
</html>