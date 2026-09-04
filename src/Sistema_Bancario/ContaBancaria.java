package Sistema_Bancario;

import java.time.LocalDateTime;

public class ContaBancaria {
    private Cliente cliente;
    private Integer id;
    private Double saldo;
    private TipoConta tipoConta;

    public ContaBancaria(Cliente cliente, int id, double saldo, TipoConta tipoConta) {
        this.cliente = cliente;
        this.id = id;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() { return cliente; }

    public Double getSaldo() {
        return saldo;
    }
    private void setSaldo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor digitado Invalido!");
        }
        this.saldo = valor;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Transacao sacar(double valor) {
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insufuciente!");
        }
        setSaldo(getSaldo() - valor);
        return new Transacao(TipoTransacao.SAQUE, valor, LocalDateTime.now(), this);
    }

    public Transacao depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return new Transacao(TipoTransacao.DEPOSITO, valor, LocalDateTime.now(), this);
    }

    public Transacao transferir(double valor, ContaBancaria contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        return new Transacao(TipoTransacao.TRANSFERENCIA, valor, LocalDateTime.now(), contaDestino);
    }

    @Override
    public String toString() {
        return  "Titular: " + cliente.getNome() + " | Id: " + getId() + " | Saldo: " + getSaldo() + " | Tipo da conta: " + getTipoConta() + "\n";
    }
}
