package classes.ex011;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios deseja registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do funcionario: ");
            String nome = sc.nextLine();

            System.out.print("Digite as horas trabalhadas: ");
            int horas = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o valor da hora: ");
            double valorHora = sc.nextDouble();
            sc.nextLine();

            System.out.print("O funcionario é terceirizado? (s/n) ");
            String op = sc.nextLine().toLowerCase();

            if (op.equals("s")) {
                System.out.print("Digite o custo adicional: ");
                double custoAdicionais = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new Terceirizados(nome, horas, valorHora, custoAdicionais));
            }

            if (op.equals("n")) {
                funcionarios.add(new Funcionario(nome, horas, valorHora));
            }
        }

        for (Funcionario f: funcionarios) {
            System.out.println(f);
        }

    }
}
