package classes.ex005;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dollar: ");
        double valor = sc.nextDouble();
        System.out.print("Digite quantos dollares irá comprar: ");
        int quantidade = sc.nextInt();

        System.out.printf("Valor pago: R$ %.2f", ConversorDeMoeda.conversor(quantidade, valor) );
    }
}
