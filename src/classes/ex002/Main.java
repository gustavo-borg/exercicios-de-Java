package classes.ex002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Gustavo", 6000.0, 1000.0);
        System.out.println(f1);

        System.out.print("Digite a % (0 - 100) de aumento de salario: ");
        double x = sc.nextDouble();
        f1.aumento(x);

        System.out.println(f1);

    }
}
