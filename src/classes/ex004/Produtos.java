package classes.ex004;

public class Produtos {
    private String nome;
    private double preco;
    private int estoque;

    public Produtos (String nome, double preco, int estoque) {
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Adicione um nome ao Produto!");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço Invalido! O preço deve ser > 0 (maior que 0)");
        }
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque Invalido! O estoque deve ser >= 0 (maior ou igual a 0)");
        }
        this.estoque = estoque;

    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: " + preco + " | Estoque: " + estoque;
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            this.estoque -= quantidade;
        }
        else {
            throw new IllegalArgumentException("Estoque de produto insuficiente!");
        }
    }
}