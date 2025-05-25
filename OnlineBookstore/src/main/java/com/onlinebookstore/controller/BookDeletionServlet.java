import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.onlinebookstore.dao.BookDAO;

@WebServlet("/deleteBook")
public class BookDeletionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookDAO bookDAO;

    @Override
    public void init() throws ServletException {
        bookDAO = new BookDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("id");
        boolean isDeleted = bookDAO.deleteBook(Integer.parseInt(bookId));

        if (isDeleted) {
            response.getWriter().write("Book with ID " + bookId + " has been deleted successfully.");
        } else {
            response.getWriter().write("Failed to delete book with ID " + bookId + ". It may not exist.");
        }
    }
}