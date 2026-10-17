package CustoPorReceita.services;

import CustoPorReceita.entities.Stock;

public class Production {
    private final Stock stock;

    public Production(Stock stock) {
        this.stock = stock;
    }

    public void produce(Recipe recipe, int batches) {
        for (RecipeItem item : recipe.getItems()) {
            double needed = item.getQty() * batches;

            if (!stock.hasEnough(item.getIngredient(), needed)) {
                throw new IllegalStateException(
                        "Estoque insuficiente de " + item.getIngredient().getName()
                                + " para produzir " + recipe.getName()
                );
            }
        }

        for (RecipeItem item : recipe.getItems()) {
            double needed = item.getQty() * batches;
            stock.consume(item.getIngredient(), needed);
        }
    }


}
