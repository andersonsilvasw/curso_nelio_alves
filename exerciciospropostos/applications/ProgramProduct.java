package cursonelioalves.exerciciospropostos.applications;

import cursonelioalves.exerciciospropostos.entities.ImportedProduct;
import cursonelioalves.exerciciospropostos.entities.Product;
import cursonelioalves.exerciciospropostos.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the numbers of products: ");
        int p = scanner.nextInt();

        for (int i = 1; i <= p; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used, or imported (c/u/i)? ");
            char type = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.next());
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name ,price, customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        scanner.close();
    }
}
