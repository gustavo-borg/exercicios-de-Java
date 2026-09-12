package classes.ex002;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public void aumento(double porcento) {
        this.salarioBruto += this.salarioBruto * (porcento / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "| Salário: " + this.salarioLiquido();
    }
}
