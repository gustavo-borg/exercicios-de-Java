package classes.ex006;

public class ContaBancaria {
    private int id;
    private String nome;
    private double saldo;


    public ContaBancaria(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Digite um nome!");
        }
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito invaldo!");
        }
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor >= getSaldo() || valor <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= (valor + 5.0);
    }
}
