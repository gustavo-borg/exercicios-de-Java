package classes.ex004;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite o estoque do produto: ");
        int estoque = sc.nextInt();

        Produtos p1 = new Produtos(nome, preco, estoque);
        System.out.println(p1);

        p1.vender(5);
        System.out.println(p1);

        try {
            p1.vender(14832);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}