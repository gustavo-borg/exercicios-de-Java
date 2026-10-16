package classes.ex010;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca c = new ContaPoupanca(1000.0, 2.0);
        c.sacar(100.0);
        System.out.println(c.getSaldo());
    }
}
