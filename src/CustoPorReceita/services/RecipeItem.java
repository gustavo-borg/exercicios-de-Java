package CustoPorReceita.services;

import CustoPorReceita.entities.Ingredient;

public class RecipeItem {
    private final Ingredient ingredient;
    private final double qty;

    public RecipeItem(Ingredient ingredient, double qty) {
        this.ingredient = ingredient;
        this.qty = qty;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getQty() {
        return qty;
    }

    public double cost() {
        return getIngredient().getPriceForQuantity() * getQty();
    }
}
