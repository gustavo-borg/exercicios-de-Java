package Sistema_Bancario;

import java.time.LocalDateTime;

public class Transacao {
    private TipoTransacao tipoTransacao;
    private Double valor;
    private LocalDateTime data;
    private ContaBancaria contaDestino;

    public Transacao(TipoTransacao tipoTransacao, double valor, LocalDateTime data, ContaBancaria contaDestino) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.data = data;
        this.contaDestino = contaDestino;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public ContaBancaria getContaDestino() {
        return contaDestino;
    }

    @Override
    public String toString() {
        return "Tipo da transação: " + getTipoTransacao() + " | Valor: " + getValor() + " | Destino: " + getContaDestino() +" | Data e horario: " + getData();
    }
}
