public class Produto {
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        setNome(nome);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Digite um nome para o produto!");
        }
        else {
            this.nome = nome;
        }
    }

    public Double getValor() {
        return valor;
    }

    private void setValor(Double valor) {
        if (valor < 0 && valor != null) {
            throw new IllegalArgumentException("Valor invalido!");
        }
        else {
            this.valor = valor;
        }
    }
}
