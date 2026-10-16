package classes.ex009;

public class Retangulo extends Forma{
    private Double largura;
    private Double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return largura; }

    public double getAltura() { return altura; }



    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public double mostrarPerimetro() {
        return (getLargura() * 2) + (getAltura() * 2);
    }

}
