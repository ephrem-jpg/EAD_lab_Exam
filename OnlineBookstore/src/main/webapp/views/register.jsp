<html>
<head>
    <title>Book Registration</title>
</head>
<body>
    <h2>Register a New Book</h2>
    <form action="register" method="post">
        <label for="title">Title:</label><br>
        <input type="text" id="title" name="title" required><br><br>
        
        <label for="author">Author:</label><br>
        <input type="text" id="author" name="author" required><br><br>
        
        <label for="price">Price:</label><br>
        <input type="number" id="price" name="price" step="0.01" required><br><br>
        
        <input type="submit" value="Register Book">
    </form>
</body>
</html>