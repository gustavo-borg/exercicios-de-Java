package detector_de_transacoes;

public class DetectorFraude {

    public static void main(String[] args) {
        double[] valores = {200, 250, 180, 1500, 90, 300};
        int[] horarios   = {543, 546, 548, 872, 900, 905};

        double media = calcularMedia(valores);

        // percorre e decide quem é suspeito
        analisarTransacoes(valores, horarios, media);
    }

    static double calcularMedia(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma / valores.length;
    }

    static boolean isValorSuspeito(double valor, double media) {
        return valor > (media * 3);
    }

    static boolean isSequenciaRapida(int[] horarios, int index) {
        for (int i = 0; i <= index; i++) {
            int quantasTransacoes = (index - i) + 1;
            int minutos = horarios[index] - horarios[i];
            if (quantasTransacoes >= 3 && minutos <= 5) { return true; }
        }
        return false;
    }

    static void analisarTransacoes(double[] valores, int[] horarios, double media) {
        for (int i = 0; i < valores.length; i++) {
            boolean valorSuspeito = isValorSuspeito(valores[i], media);
            boolean sequenciaSuspeita = isSequenciaRapida(horarios, i);

            String horario = minutosParaHoraFormatada(horarios[i]);
            if (valorSuspeito) {
                System.out.printf("Transação suspeita às %s - Valor: R$%.2f - Motivo: Valor muito acima da média\n", horario, valores[i]);
            }
            if (sequenciaSuspeita) {
                System.out.printf("Transação suspeita às %s - Valor: R$%.2f - Motivo: Sequência muito rápida de transações\n", horario, valores[i]);
            }
        }
    }

    static String minutosParaHoraFormatada(int minutos) {
        int hora = minutos / 60;
        int minuto = minutos % 60;

        return String.format("%02d:%02d", hora, minuto);
    }
}