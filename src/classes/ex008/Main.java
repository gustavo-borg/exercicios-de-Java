package classes.ex008;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios deaseja cadastrar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            boolean idExists = funcionarios.stream().anyMatch(f -> f.getId() == id);
            if (idExists) {
                System.out.println("ID ja cadastrado!");
                i--;
                continue;
            }

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            funcionarios.add(new Funcionarios(id, nome, salario));

        }

        System.out.print("Deseja aumentar ou reduzir o salário de algum funcionario?: (s/n)");
        String op = sc.nextLine().toLowerCase();

        if ("s".equals(op)) {
            System.out.print("Digite o Id do funcionario: ");
            int id = sc.nextInt();
            sc.nextLine();

            Funcionarios result = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            if (result == null) {
                System.out.println("Funcionário não encontrado");
            } else {
                System.out.print("Caso deseje aumentar o salário digite >1< | Caso deseje reduzir o salário digite >2<: ");
                int resp = sc.nextInt();
                sc.nextLine();

                if (resp == 1) {
                    System.out.print("Digite o percentual que deseja aumentar: ");
                    double x = sc.nextDouble();
                    sc.nextLine();
                    OperacoesSalario.aumentoSalarial(result, x);
                    System.out.println("Aumento salarial realisado com sucesso! Salário atual: R$" + result.getSalario());

                } else {
                    System.out.print("Digite o percentual que deseja reduzir: ");
                    double x = sc.nextDouble();
                    sc.nextLine();
                    OperacoesSalario.reduzirSalario(result, x);
                    System.out.println("Redução salarial realisada com sucesso! Salário atual: R$" + result.getSalario());

                }
            }
        } else {
            System.out.println("Ok! Volte sempre!");
        }

        System.out.println("Lista de funcionários: ");
        funcionarios.forEach(f -> System.out.println(f));
    }
}
