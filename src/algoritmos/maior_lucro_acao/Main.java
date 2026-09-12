package algoritmos.maior_lucro_acao;

public class Main {
    public static void main(String[] args) {
        int[] precos = {7, 1, 5, 3, 6, 4};

        int menorPreco = 9999;
        int lucroAtual = 0;
        int maiorLucro = 0;

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] < menorPreco) {
                menorPreco = precos[i];
            }
            lucroAtual = precos[i] - menorPreco;
            if (lucroAtual > maiorLucro) {
                maiorLucro = lucroAtual;
            }
        }

        System.out.println("Maior lucro: " + maiorLucro);

    }
}

