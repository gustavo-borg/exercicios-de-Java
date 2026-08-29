package classes.ex007;

public class Operacoes {
    public static double mediaAltura(double alturaTotal, int n) {
        return alturaTotal / n;
    }

    public static double calcPorcentagem(int num, int n) {
        double porcentagem = (double) num / n;
        return Math.round(porcentagem * 100.0);
    }
}
