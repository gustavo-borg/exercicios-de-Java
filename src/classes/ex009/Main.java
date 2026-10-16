package classes.ex009;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(10, 5);
        formas.add(c);
        formas.add(r);

        for (Forma f: formas) {
            System.out.println("Area: " + f.calcularArea());

            if (f instanceof Circulo) {
                System.out.println("Diametro: " + ((Circulo) f).mostrarDiametro());
            }
            if (f instanceof Retangulo) {
                System.out.println("Perimetro: " + ((Retangulo) f).mostrarPerimetro());
            }
        }
    }
}
