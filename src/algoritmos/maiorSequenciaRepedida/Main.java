package algoritmos.maiorSequenciaRepedida;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        int sequenciaAtual = 1;
        int maiorSequencia = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i-1]) {
                sequenciaAtual += 1;
                if (sequenciaAtual > maiorSequencia) {
                    maiorSequencia = sequenciaAtual;
                }
            }

            else {sequenciaAtual = 1;}
        }
        System.out.println(maiorSequencia);
    }
}
