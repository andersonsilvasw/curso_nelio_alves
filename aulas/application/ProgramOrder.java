package cursonelioalves.aulas.application;

import cursonelioalves.aulas.entities.Order;
import cursonelioalves.aulas.entities.enums.OrderStatus;

import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {
        Order order1 = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        Order order2 = new Order(2, new Date(), OrderStatus.PROCESSING);
        Order order3 = new Order(3, new Date(), OrderStatus.SHIPPED);
        Order order4 = new Order(4, new Date(), OrderStatus.DELIVERED);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
