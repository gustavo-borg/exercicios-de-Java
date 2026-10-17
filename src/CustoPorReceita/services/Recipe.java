package CustoPorReceita.services;

import CustoPorReceita.entities.Ingredient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recipe {
    private final String name;
    private final int portions;                          // rendimento (quantas unidades sai)
    private final List<RecipeItem> items = new ArrayList<>();

    public Recipe(String name, int portions) {
        if (portions <= 0) {
            throw new IllegalArgumentException("Rendimento deve ser maior que zero");
        }
        this.name = name;
        this.portions = portions;
    }

    public String getName() {
        return name;
    }

    public int getPortions() {
        return portions;
    }

    public void addItem(Ingredient ingredient, double qty) {
        items.add(new RecipeItem(ingredient, qty));
    }

    public List<RecipeItem> getItems() {
        return Collections.unmodifiableList(items);      // ninguém de fora mexe na lista
    }

    public double totalCost() {
        double total = 0;
        for (RecipeItem item: items) {
            total += item.cost();
        }
        return total;
    }

    public double costPerUnit() {
        return totalCost() / portions;
    }

    public double suggestedPrice(double marginPercent) {
        return costPerUnit() * (1 + marginPercent / 100.0);
    }
}