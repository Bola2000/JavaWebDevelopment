import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/MyAboutServlet")
@WebServlet(name = "MyAboutServlet",
        urlPatterns = {"/about"}
)
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in doGet - about");

        RequestDispatcher view = req.getRequestDispatcher("about.jsp");
        view.forward(req, resp);
    }
}
