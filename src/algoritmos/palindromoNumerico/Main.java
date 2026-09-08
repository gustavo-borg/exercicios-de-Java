package algoritmos.palindromoNumerico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int invertido = 0;

        int numOriginal = num;

        while (num > 0) {
            int nFinal = num % 10;
            invertido = invertido * 10 + nFinal;
            num /= 10;
        }

        if (numOriginal == invertido) {
            System.out.println("O número: " + numOriginal + " é um palindromo");
        }
        else {
            System.out.println("O número: " + numOriginal + " não é um palindromo");
        }
    }
}
