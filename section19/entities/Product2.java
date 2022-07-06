package cursonelioalves.section19.entities;

import java.util.Objects;

public class Product2 {

    private String name;
    private Double price;

    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product2)) return false;
        Product2 product2 = (Product2) o;
        return Objects.equals(getName(), product2.getName()) && Objects.equals(getPrice(), product2.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
