import java.util.Locale;
import java.util.Scanner;

public class ex_comidas_v1 {
    public static void main(String[] agrs){
        Locale.setDefault(Locale.US);

        System.out.println("Tabela de Comidas");
        System.out.println("Code: 1 | Produto: Cachorro-Quente | Preço: R$4.00");
        System.out.println("Code: 2 | Produto: X-Salada        | Preço: R$4.50");
        System.out.println("Code: 3 | Produto: X-Bacon         | Preço: R$5.00");
        System.out.println("Code: 4 | Produto: Torrada Simples | Preço: R$2.00");
        System.out.println("Code: 5 | Produto: Refrigerante    | Preço: R$1.50");

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu pedido?");
        int code = sc.nextInt();
        System.out.printf("Seu pedido foi um 'code: %d', Quantos seriam?%n", code);
        int howMany = sc.nextInt();

        if (code == 1) {
            System.out.printf("Seu pedido foi %d Cachorro-Quentes%n", howMany);
            double valor = 4.0 * howMany;
            System.out.printf("Sua conta ficou em R$%.2f", valor);
        }

        else if (code == 2) {
            System.out.printf("Seu pedido foi %d X-Salada%n", howMany);
            double valor = 4.50 * howMany;
            System.out.printf("Sua conta ficou em R$%.2f", valor);
        }

        else if (code == 3) {
            System.out.printf("Seu pedido foi %d X-Bacon%n", howMany);
            double valor = 5.00 * howMany;
            System.out.printf("Seu pedido ficou em R$%.2f", valor);
        }

        else if (code == 4) {
            System.out.printf("Seu pedido foi %d Torrada Simples%n", howMany);
            double valor = 2.00 * howMany;
            System.out.printf("Seu pedido ficou em R$%.2f", valor);
        }

        else {
            System.out.printf("Seu pedido foi %d Refrigerante%n", howMany);
            double valor = 1.50 * howMany;
            System.out.printf("Seu pedido ficou em R$%.2f", valor);
        }

        sc.close();
    }
}