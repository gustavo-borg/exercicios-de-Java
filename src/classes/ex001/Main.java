package classes.ex001;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da Altura: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor da Largura: ");
        double y = sc.nextDouble();

        Retangulo r = new Retangulo(x, y);
        System.out.println("Área:      " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.printf("Diagonal: %.4f ", r.diagonal());
    }
}
