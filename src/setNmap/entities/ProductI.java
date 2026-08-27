package setNmap.entities;

import java.util.Objects;

public class ProductI {

    private String name;
    private double price;

    public ProductI(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductI productI = (ProductI) o;
        return Double.compare(price, productI.price) == 0 && Objects.equals(name, productI.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
