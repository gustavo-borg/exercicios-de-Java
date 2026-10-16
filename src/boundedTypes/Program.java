package boundedTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> listOfProducts = new ArrayList<>();

        System.out.print("Quantos produtos seram cadastrados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            listOfProducts.add(new Product(name, price));
        }

        System.out.println("Maior preço: " + Utils.maxElement(listOfProducts));
    }
}
