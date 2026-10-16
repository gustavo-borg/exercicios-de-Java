package classes.ex009;

public class Circulo extends Forma{

    private Double raio;

    public Circulo(double raio){ this.raio = raio; }

    public double getRaio() { return raio;}

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return Math.round(area * 1000.0) / 1000.0;
    }

    public double mostrarDiametro() {
        return getRaio() * 2;
    }

}
