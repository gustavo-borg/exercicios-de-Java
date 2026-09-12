package Sistema_Bancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;
    private List<Transacao> transacoes;

    public Banco() {
        this.contas = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public void addConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void sacar(ContaBancaria conta, double valor) {
        Transacao transacao = conta.sacar(valor);
        transacoes.add(transacao);
    }

    public void depositar(ContaBancaria conta, double valor) {
        Transacao transacao = conta.depositar(valor);
        transacoes.add(transacao);
    }

    public void transferir(ContaBancaria conta, double valor, ContaBancaria contaDestino) {
        Transacao transacao = conta.transferir(valor, contaDestino);
        transacoes.add(transacao);
    }

    @Override
    public String toString() {
        return "Contas: " + contas
                + "\nTransações: " + transacoes;
    }
}
