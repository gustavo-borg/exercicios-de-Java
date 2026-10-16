package classes.ex011;


public class Terceirizados extends Funcionario {
    private Double custosAdicionais;

    public Terceirizados(String nome, int horas, double valorHora, double custosAdicionais) {
        super(nome, horas, valorHora);
        this.custosAdicionais = custosAdicionais;
    }

    public double getCustoAdicionais() { return custosAdicionais;}

    @Override
    public Double pagamento() {
        double valorReal = super.pagamento() + (1.1 * getCustoAdicionais());
        return valorReal;
    }
}
