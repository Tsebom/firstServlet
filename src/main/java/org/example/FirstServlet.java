package org.example;
//опять первый pull-request не удался
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Samsung S2", 3.54));
        products.add(new Product(2, "Samsung S3", 4));
        products.add(new Product(3, "Samsung S4", 5));
        products.add(new Product(4, "Samsung S5", 6));
        products.add(new Product(5, "Samsung S6", 6));
        products.add(new Product(6, "Samsung S7", 37));
        products.add(new Product(7, "Samsung S8", 38));
        products.add(new Product(8, "Samsung S9", 39));
        products.add(new Product(9, "Samsung S10", 300));
        products.add(new Product(10, "Samsung S20", 3000));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Product p: products) {
            resp.getWriter().println("id: " + p.getId() + " | " + "name: " + p.getTitle() + " | " + "cost: " + p.getCost());
        }
    }
}