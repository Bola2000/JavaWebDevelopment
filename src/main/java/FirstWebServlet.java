import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/FirstWebServlet")
@WebServlet(name = "MyFirstWebServlet",
        urlPatterns = {"/home", "/welcome"}
        )
public class FirstWebServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("in doGet");

        RequestDispatcher view = request.getRequestDispatcher("index.html");
        view.forward(request, response);
    }
}
