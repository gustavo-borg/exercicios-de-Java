import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente c1 = new Cliente("Gustavo", "(32) 98886-2467");
        Cliente c2 = new Cliente("Lavínia", "(32) 96767-7676");

        Produto p1 = new Produto("NoteBook",3500.0);
        Produto p2 = new Produto("Monitor Gamer",399.0);
        Produto p3 = new Produto("Iphone 15",5350.0);

        Pedidos pd1 = new Pedidos(c1, p2, LocalDate.now());
        Pedidos pd2 = new Pedidos(c1, p1, LocalDate.of(2026, 06, 03));
        Pedidos pd3 = new Pedidos(c2, p1, LocalDate.of(2026, 12, 02));
        Pedidos pd4 = new Pedidos(c2, p3, LocalDate.of(2025, 03, 06));
        Pedidos pd5 = new Pedidos(c2, p2, LocalDate.of(2026, 01, 05));

        List<Pedidos> pedidos = new ArrayList<>();
        pedidos.add(pd1);
        pedidos.add(pd2);
        pedidos.add(pd3);
        pedidos.add(pd4);
        pedidos.add(pd5);

        double[][] relatorio = new double[2][7];

        for (Pedidos pedido: pedidos) {
            int dia = pedido.getData().getDayOfWeek().getValue() - 1;
            relatorio[0][dia] += 1;
            relatorio[1][dia] += pedido.getProduto().getValor();
        }

        double maiorFaturamento = 0;
        int diaMaiorFaturamento = 0;
        for (int i = 0; i < relatorio[1].length; i++) {
            if (relatorio[1][i] > maiorFaturamento) {
                maiorFaturamento = relatorio[1][i];
                diaMaiorFaturamento = i;
            }
        }

        System.out.println("Dia com maior faturamento: " + DayOfWeek.of(diaMaiorFaturamento + 1));
        System.out.printf("Valor total: %.2f%n", maiorFaturamento);

        List<Pedidos> pedidosOrdenados = new ArrayList<>(pedidos);
        pedidosOrdenados.sort(Comparator.comparing(Pedidos::getData));

        System.out.println("\n ------ Pedidos ------");
        for (Pedidos pedido: pedidosOrdenados) {
            System.out.println(pedido);
        }
    }
}
