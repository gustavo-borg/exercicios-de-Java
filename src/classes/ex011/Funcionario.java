package classes.ex011;

public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Funcionario(String nome, int horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() { return nome; }
    public Integer getHoras() { return horas; }
    public Double getValorHora() { return valorHora; }

    public Double pagamento() {
        return getHoras() * getValorHora();
    }

    @Override
    public final String toString() { return "Nome: " + getNome() + " | Pagamento: R$" + String.format("%.2f", pagamento()); }
}
