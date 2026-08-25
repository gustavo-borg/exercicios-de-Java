package classes.ex005;

public class ConversorDeMoeda {

    public static double conversor(int quantidade, double valor){
        double doll = quantidade * valor;
        double imposto = doll * 0.06;
        return doll + imposto;
    }
}
