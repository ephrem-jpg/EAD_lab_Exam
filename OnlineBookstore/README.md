# Online Bookstore Project

## Overview
The Online Bookstore project is a web application that allows users to register, display, delete, and search for books. It utilizes a MySQL database for data storage and integrates the Spring Framework for dependency injection and aspect-oriented programming (AOP) for logging.

## Project Structure
```
OnlineBookstore
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── onlinebookstore
│   │   │           ├── controller
│   │   │           │   ├── BookRegistrationServlet.java
│   │   │           │   ├── BookDisplayServlet.java
│   │   │           │   ├── BookDeletionServlet.java
│   │   │           │   └── BookSearchServlet.java
│   │   │           ├── dao
│   │   │           │   └── BookDAO.java
│   │   │           ├── model
│   │   │           │   └── Book.java
│   │   │           ├── service
│   │   │           │   └── BookService.java
│   │   │           └── aspect
│   │   │               └── LoggingAspect.java
│   │   ├── resources
│   │   │   ├── applicationContext.xml
│   │   │   └── db.properties
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       └── views
│   │           ├── register.jsp
│   │           ├── display.jsp
│   │           ├── delete.jsp
│   │           └── search.jsp
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the Repository**: 
   Clone the project repository to your local machine.

2. **Database Setup**:
   - Create a MySQL database named `online_bookstore`.
   - Update the `src/main/resources/db.properties` file with your database connection details (URL, username, password).

3. **Maven Dependencies**:
   - Ensure you have Maven installed.
   - Navigate to the project directory and run `mvn clean install` to download the necessary dependencies.

4. **Deploy the Application**:
   - Deploy the application on a servlet container like Apache Tomcat.
   - Ensure the `web.xml` is correctly configured for servlet mappings.

5. **Access the Application**:
   - Open your web browser and navigate to the appropriate URL (e.g., `http://localhost:8080/OnlineBookstore`).

## Usage
- **Register a Book**: Navigate to the registration page to add a new book.
- **Display Books**: View all registered books in a formatted table.
- **Delete a Book**: Use the deletion page to remove a book by its ID.
- **Search for Books**: Search for books by title using the search functionality.

## Technologies Used
- Java
- Spring Framework
- MySQL
- Servlets
- JSP
- AOP for logging
- Maven for project management

## Author
[Your Name] - [Your Email] - [Your GitHub Profile] 

## License
This project is licensed under the MIT License.