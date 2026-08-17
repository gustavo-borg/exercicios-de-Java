package classes.ex001;

public class Retangulo {
    private double altura;
    private double largura;


    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura(double altura){
        return altura;
    }

    public double largura(double largura){
        return largura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura + largura) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}