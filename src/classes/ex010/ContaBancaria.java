package classes.ex010;

public class ContaBancaria {
        protected double saldo;

        public ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() { return saldo; }

        public void sacar(double valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo: " + saldo);
        }
    }

