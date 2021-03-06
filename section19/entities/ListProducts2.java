package cursonelioalves.section19.entities;

import java.util.Objects;

public class ListProducts2 implements Comparable<ListProducts2> {

    private String name;
    private Double price;

    public ListProducts2(String name, Double price) {
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
        if (!(o instanceof ListProducts2)) return false;
        ListProducts2 that = (ListProducts2) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public String toString() {
        return "ListProducts2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(ListProducts2 other) {
        return name.toLowerCase().compareTo(other.getName().toUpperCase());
    }
}

