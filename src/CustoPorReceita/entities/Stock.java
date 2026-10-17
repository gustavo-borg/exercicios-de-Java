package CustoPorReceita.entities;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private final Map<Ingredient, Double> stock;

    public Stock() {
        this.stock = new HashMap<>();
    }

    private void requeirePositive(double qty) {
        if (qty <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
    }

    public void add(Ingredient ingredient, double qty) {
        requeirePositive(qty);
        stock.merge(ingredient, qty, Double::sum);

    }

    public double getQuantity(Ingredient ingredient) {
        return stock.getOrDefault(ingredient, 0.0);
    }

    public boolean hasEnough(Ingredient ingredient, double qty) {
        return getQuantity(ingredient) >= qty;
    }

    public void consume(Ingredient ingredient, double qty) {
        requeirePositive(qty);
        if (!hasEnough(ingredient, qty)) {
            throw new IllegalArgumentException("Insufficient quantity");
        }
        stock.merge(ingredient, -qty, Double::sum);

    }
}
