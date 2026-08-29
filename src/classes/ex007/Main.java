package classes.ex007;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Pessoas há na lista?: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        int contIdade = 0;
        double alturaTotal = 0.0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoas(nome, idade, altura);

            alturaTotal += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                contIdade ++;
            }
        }

        double mediaAltura = Operacoes.mediaAltura(alturaTotal, n);
        double menoresDe16 = Operacoes.calcPorcentagem(contIdade, n);

        System.out.printf("A média das alturas é: %.2f%n", mediaAltura);

        System.out.println("A Porcentagem de pessoas menores de 16 anos é: " + menoresDe16 + "%");
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

    }
}
