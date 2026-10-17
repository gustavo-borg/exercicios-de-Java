package CustoPorReceita.entities;

import java.util.Objects;

public class Ingredient {
    private String name;
    private Double priceForQuantity;

    public Ingredient(String name, double priceForQuantity) {
        this.name = name;
        this.priceForQuantity = priceForQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceForQuantity() {
        return priceForQuantity;
    }

    public void setPriceForQuantity(Double priceForQuantity) {
        this.priceForQuantity = priceForQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
