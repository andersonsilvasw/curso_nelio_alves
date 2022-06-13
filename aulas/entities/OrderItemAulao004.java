package cursonelioalves.aulas.entities;

public class OrderItemAulao004 {
    private Integer quantity;
    private Double price;

    private ProductAulao004 product;

    public OrderItemAulao004() {
    }

    public OrderItemAulao004(Integer quantity, Double price, ProductAulao004 product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductAulao004 getProduct() {
        return product;
    }

    public void setProduct(ProductAulao004 product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
