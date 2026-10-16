package boundedTypes;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 12, 3, 47, 8);
        System.out.println("Maior número: " + Utils.maxElement(numeros));

        List<String> nomes = List.of("Gustavo", "Ana", "Wellington", "Bia");
        System.out.println("Maior string: " + Utils.maxElement(nomes));
    }
}

