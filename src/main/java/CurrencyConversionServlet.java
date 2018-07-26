import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CurrencyConversionServlet", urlPatterns = "/display")
public class CurrencyConversionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));

        double VND = rate * usd;
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("Rate: " + rate + "<br>");
        writer.print("USD: " + usd + "<br>");
        writer.print("VND: " + VND);
        writer.print("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
