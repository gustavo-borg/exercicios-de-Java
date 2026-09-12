import java.util.Locale;
import java.util.Scanner;

public class ex_imposto {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Salário mensal: ");
        double salario = sc.nextDouble();

        double imposto = 0.00;

        if (salario > 4500){
            imposto += (salario - 4500) * 0.28;
            imposto += (4500 - 3000) * 0.18;
            imposto += (3000 - 2000) * 0.08;
        }

        else if (salario > 3000){
            imposto += (salario - 3000) * 0.18;
            imposto += (3000 - 2000) * 0.08;
        }

        else if (salario > 2000){
            imposto += (salario - 2000) * 0.08;
        }

        else {
            System.out.println("Incento de Impostos");
            imposto = 0;
        }

        double salarioLiquido = salario - imposto;

        System.out.printf("Seu Salário Bruto foi: R$%.2f com a cobraça de R$%.2f de Impostos%n", salario, imposto);
        System.out.printf("Resultando em um Salário Liquido de: R$%.2f", salarioLiquido);

        sc.close();
    }
}
