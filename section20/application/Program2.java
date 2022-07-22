package cursonelioalves.section20.application;

import cursonelioalves.section20.entities.Product;
import cursonelioalves.section20.util.PriceUpdate;
import cursonelioalves.section20.util.ProductPredicate;
import cursonelioalves.section20.util.ProductService;
import cursonelioalves.section20.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Base", 80.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
