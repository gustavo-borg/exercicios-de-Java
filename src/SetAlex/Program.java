package SetAlex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos alunos tem o curso A: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            a.add(num);
        }

        System.out.print("Quantos alunos tem o curso B: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            b.add(num);
        }

        System.out.print("Quantos alunos tem o curso C: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            c.add(num);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de alunos: " + total.size());

        sc.close();
    }
}
