package locadora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("***LOCADORA***");
        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Digite quando o carro foi alugado (DD/MM/YYYY HH:MM): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Digite quando o carro foi devolvido (DD/MM/YYYY HH:MM): ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Valor da hora: ");
        double valorHora = sc.nextDouble();
        sc.nextLine();

        System.out.print("Valor do dia: ");
        double valorDia = sc.nextDouble();

        Locadora l = new Locadora(modelo, inicio, fim, valorHora, valorDia);

        System.out.println("***NOTA DE PAGAMENTO***");
        System.out.println(l);
        
        sc.close();
    }
}
