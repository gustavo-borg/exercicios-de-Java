package exSet;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();

        for (int i = 1; i <= 100000; i++) {
            num.add(i);
        }

        num.removeIf(n -> !ehPrimo(n));

        System.out.println(num);
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}