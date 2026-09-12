package classes.ex008;

public class Funcionarios {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios(int id, String nome, double salario ) {
        this.id = id;
        this.nome = nome;
        setSalario(salario);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Valor invalido!");
        }
        else {
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return  "ID: "+ id + " | Nome: " + nome + " | Salário: " + salario;
    }
}