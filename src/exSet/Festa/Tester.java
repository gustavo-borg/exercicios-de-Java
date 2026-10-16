package exSet.Festa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Convidado> listaConvidados = new HashSet<>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            listaConvidados.add(new Convidado(name, age));
        }

        System.out.println(listaConvidados.size());
        System.out.println(listaConvidados);

        sc.close();
    }
}
