package algoritmos.frizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int n = 1; n <= 50; n++) {
            String resultado = "";

            if (n % 3 == 0) { resultado += "Fizz"; }

            if (n % 5 == 0) { resultado += "Buzz"; }

            if (n % 7 == 0) { resultado += "Sete!"; }

            if (resultado.equals("")) { System.out.println(n); }

            else {System.out.printf("%d = %s%n", n, resultado); }
        }
    }
}
