package 28Jan2026;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food-and-drinks")
public class FoodAndDrinksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Food and Drinks</title></head><body>");
        response.getWriter().println("<h1>Menu</h1>");
        response.getWriter().println("<h2>Food Items</h2>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Pizza</li>");
        response.getWriter().println("<li>Burger</li>");
        response.getWriter().println("<li>Pasta</li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("<h2>Drinks</h2>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Coke</li>");
        response.getWriter().println("<li>Water</li>");
        response.getWriter().println("<li>Juice</li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("</body></html>");
    }
}