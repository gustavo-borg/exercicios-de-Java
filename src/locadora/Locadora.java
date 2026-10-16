package locadora;

import java.time.Duration;
import java.time.LocalDateTime;

public class Locadora {
    private String modelo;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Double valorHora;
    private Double valorDia;

    public Locadora(String modelo, LocalDateTime inicio, LocalDateTime fim, double valorHora, double valorDia) {
        this.modelo = modelo;
        this.inicio = inicio;
        this.fim = fim;
        this.valorHora = valorHora;
        this.valorDia = valorDia;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Double getValorDia() {
        return valorDia;
    }

    private Duration duracao() {
        return Duration.between(getInicio(), getFim());
    }

    private long duracaoHora() {
        return duracao().toHours();
    }

    private long duracaoDia() {
        return duracao().toDays();
    }

    public double calcValor() {
        if (duracaoHora() < 12) {
            double preco = valorHora * duracaoHora();
            return preco;
        }
        else {
            double preco = valorDia * duracaoDia();
            return preco;
        }
    }

    public double calcTaxa() {
        if (calcValor() > 100.0) { return calcValor() * 0.15; }
        else { return calcValor() * 0.20; }
    }

    public double valorFinal() {
        return calcValor() + calcTaxa();
    }

    @Override
    public final String toString() {
        return "Valor base: R$" + calcValor() +
                "\nTaxa: R$" + calcTaxa() +
                "\nValor final: R$" + valorFinal();
    }
}
