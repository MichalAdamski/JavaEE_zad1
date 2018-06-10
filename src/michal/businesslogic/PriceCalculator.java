package michal.businesslogic;

import michal.model.Product;

import java.util.List;

public class PriceCalculator {
    public static double summ(List<Product> products) {
        double summ = 0;
        for (Product p : products) {
            summ += p.getPrice();
        }
        return summ;
    }

    public static double mean(List<Product> products){
        double summ = summ(products);
        return summ/products.size();
    }
}
