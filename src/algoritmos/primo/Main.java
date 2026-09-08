package algoritmos.primo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int a = sc.nextInt();

        System.out.print("\nDigite o número B: ");
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int n = a; n <= b; n++) {
            boolean primo = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) { primo = false; }
            }

            if (primo) {
                System.out.println(n);
            }
        }
    }
}
