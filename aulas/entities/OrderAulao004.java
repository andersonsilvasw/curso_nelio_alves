package cursonelioalves.aulas.entities;

import cursonelioalves.aulas.entities.enums.OrderStatusAulao004;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderAulao004 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatusAulao004 status;

    private ClientAulao004 client;

    private List<OrderItemAulao004> items = new ArrayList<>();

    public OrderAulao004() {
    }

    public OrderAulao004(Date moment, OrderStatusAulao004 status, ClientAulao004 client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusAulao004 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusAulao004 status) {
        this.status = status;
    }

    public ClientAulao004 getClient() {
        return client;
    }

    public void setClient(ClientAulao004 client) {
        this.client = client;
    }

    public void addItem(OrderItemAulao004 item) {
        items.add(item);
    }

    public void removeItem(OrderItemAulao004 item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItemAulao004 it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItemAulao004 item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
