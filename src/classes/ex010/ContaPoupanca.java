package classes.ex010;

public class ContaPoupanca extends ContaBancaria {
    private Double taxaSaque;

    public ContaPoupanca(double saldo, double taxaSaque) {
        super(saldo);
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() { return taxaSaque; }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            double valorReal = valor + getTaxaSaque();
            super.sacar(valorReal);
        }
        else { System.out.println("Não foi possivel sacar! \nValor acima do limite"); }
    }
}
