package classes.ex003;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno("Gustavo", 20.0, 5.0, 30.0);
        System.out.println(a1);
    }
}
