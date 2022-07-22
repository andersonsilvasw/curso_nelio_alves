package cursonelioalves.section20.application;

import cursonelioalves.section20.entities.Product;
import cursonelioalves.section20.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Base", 80.00));

        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
