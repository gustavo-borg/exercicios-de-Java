package classes.ex007;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | Altura: " + this.altura;
    }
}
