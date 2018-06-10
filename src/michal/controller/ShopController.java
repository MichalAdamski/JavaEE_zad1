package michal.controller;

import michal.businesslogic.PriceCalculator;
import michal.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/controller")
public class ShopController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        String price = "";
        String name = "";

        request.setCharacterEncoding("UTF-8");
        try {
            if (!(price = request.getParameter("price1")).isEmpty() && !(name = request.getParameter("product1")).isEmpty())
                products.add(new Product(Double.parseDouble(price), name));
            if (!(price = request.getParameter("price2")).isEmpty() && !(name = request.getParameter("product2")).isEmpty())
                products.add(new Product(Double.parseDouble(price), name));
            if (!(price = request.getParameter("price3")).isEmpty() && !(name = request.getParameter("product3")).isEmpty())
                products.add(new Product(Double.parseDouble(price), name));
            if (!(price = request.getParameter("price4")).isEmpty() && !(name = request.getParameter("product4")).isEmpty())
                products.add(new Product(Double.parseDouble(price), name));

            if (products.size() == 0) {
                response.sendRedirect("empty.jsp");
            } else {

                String summ = Double.toString(PriceCalculator.summ(products));
                String mean = Double.toString(PriceCalculator.mean(products));
                request.setAttribute("products", products);
                request.setAttribute("mean", mean);
                request.setAttribute("summ", summ);

                request.getRequestDispatcher("summary.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("empty.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}