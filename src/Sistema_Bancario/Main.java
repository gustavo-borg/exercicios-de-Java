package Sistema_Bancario;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Banco banco = new Banco();

        Cliente c1 = new Cliente("Gustavo", "13385244617", "borg542@gmail.com");
        Cliente c2 = new Cliente("Lavínia", "67541312311", "lavinia21gmail.com");

        ContaBancaria conta1 = new ContaBancaria(001, 7500.0, TipoConta.CORRENTE);
        ContaBancaria conta2 = new ContaBancaria(002, 5500.0, TipoConta.CORRENTE);

        banco.addConta(conta1);
        banco.addConta(conta2);

        banco.depositar(conta1, 4000.0);
        banco.sacar(conta1, 400.0);
        banco.depositar(conta2, 4000.0);
        banco.sacar(conta2, 400.0);


        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(banco);

    }
}
