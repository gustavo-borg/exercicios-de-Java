package classes.ex003;

public class Aluno {
    private String nome;
    private double tri1;
    private double tri2;
    private double tri3;

    public Aluno(String nome, double tri1, double tri2, double tri3) {
        setNome(nome);
        setTri1(tri1);
        setTri2(tri2);
        setTri3(tri3);
    }

    public String getNome() {
        return nome;
    }
    public double getTri1() {

        return tri1;
    }
    public double getTri2() {

        return tri2;
    }
    public double getTri3() {

        return tri3;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new IllegalArgumentException("Nome em Branco! PorFavor insira um nome");
        }
        this.nome = nome;
    }

    public void setTri1(double tri1) {
        if (tri1 < 0 || tri1 > 30) {
            throw new IllegalArgumentException("Nota Invalida!");
        }
        this.tri1 = tri1;
    }

    public void setTri2(double tri2) {
        if (tri2 < 0 || tri2 > 35) {
            throw new IllegalArgumentException("Nota Invalida!");
        }
        this.tri2 = tri2;
    }

    public void setTri3(double tri3) {
        if (tri3 < 0 || tri3 > 35) {
            throw new IllegalArgumentException("Nota Invalida!");
        }
        this.tri3 = tri3;
    }

    public double notaTotal() {
        return (tri1 + tri2 + tri3);
    }

    public String status() {
        double nota = notaTotal();
        if (nota >= 60) {
            return "Parabens Você passou! Nota: " + nota;
        }
        else {
            double notaFaltou = 60 - nota;
            return "Voce não passou! Faltou <" + notaFaltou + "> Para atingir a meta!";
        }
    }

    @Override
    public String toString() {
            return "Nome: " + nome + " | Status: " + status();
        }
}