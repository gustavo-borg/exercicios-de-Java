import java.util.Locale;
import java.util.Scanner;

public class ex_comidas_v2 {
    public static void main(String[] args){
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

        double price = 0.00;
        String name = "";

        if (code == 1){ price = 4.00; name = "Cachorro-Quente"; }

        else if (code == 2){ price = 4.50; name = "X-Salada"; }

        else if (code == 3){ price = 5.00; name = "X-Bacon"; }

        else if (code == 4){ price = 2.00; name = "Torrada Simples"; }

        else if (code == 5){ price = 1.50; name = "Refrigerante"; }

        else { System.out.println("Código Invalido!"); }

        double total = price * howMany;
        System.out.printf("Seu pedido foi: %d de %s%n",howMany, name);
        System.out.printf("O total do pedido ficou em: R$%.2f", total);
        sc.close();
    }
}