package cursonelioalves.aulas.application;

import cursonelioalves.aulas.entities.ClientAulao004;
import cursonelioalves.aulas.entities.OrderAulao004;
import cursonelioalves.aulas.entities.OrderItemAulao004;
import cursonelioalves.aulas.entities.ProductAulao004;
import cursonelioalves.aulas.entities.enums.OrderStatusAulao004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrderAulao004 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        ClientAulao004 client = new ClientAulao004(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatusAulao004 status = OrderStatusAulao004.valueOf(sc.next());

        OrderAulao004 order = new OrderAulao004(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " intem data:");
            System.out.print("Product name: ");
            sc.next();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ProductAulao004 product = new ProductAulao004(productName, productPrice);

            OrderItemAulao004 it = new OrderItemAulao004(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
