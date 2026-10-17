package CustoPorReceita;

import CustoPorReceita.entities.Ingredient;
import CustoPorReceita.entities.Stock;
import CustoPorReceita.services.Production;
import CustoPorReceita.services.Recipe;

public class Tester {
    public static void main(String[] args) {
        Ingredient leite = new Ingredient("Leite condensado", 0.02);   // ajuste ao seu construtor
        Ingredient chocolate = new Ingredient("Chocolate", 0.05);

        Stock stock = new Stock();
        stock.add(leite, 2000);
        stock.add(chocolate, 500);

        Recipe brigadeiro = new Recipe("Brigadeiro", 30);
        brigadeiro.addItem(chocolate, 50);   // chocolate primeiro de propósito
        brigadeiro.addItem(leite, 395);

        System.out.printf("Custo total: %.2f%n", brigadeiro.totalCost());
        System.out.printf("Custo por unidade: %.4f%n", brigadeiro.costPerUnit());
        System.out.printf("Preço sugerido (100%%): %.4f%n", brigadeiro.suggestedPrice(100));

        printStock("Antes", stock, leite, chocolate);

        Production production = new Production(stock);
        production.produce(brigadeiro, 2);
        printStock("Depois de 2 lotes", stock, leite, chocolate);

        try {
            production.produce(brigadeiro, 4);   // leite não chega
        } catch (IllegalStateException e) {
            System.out.println("Recusado: " + e.getMessage());
        }
        printStock("Depois da falha", stock, leite, chocolate);
    }

    private static void printStock(String label, Stock stock, Ingredient... ingredients) {
        System.out.println("--- " + label + " ---");
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + ": " + stock.getQuantity(i));
        }
    }
}