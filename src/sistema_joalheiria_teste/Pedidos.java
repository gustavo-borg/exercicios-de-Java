import java.time.LocalDate;

public class Pedidos {
    private  Cliente cliente;
    private Produto produto;
    private LocalDate data;

    public Pedidos(Cliente cliente, Produto produto, LocalDate data) {
        this.cliente = cliente;
        this.produto = produto;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() { return produto; }

    public LocalDate getData() {return data; }

    @Override
    public String toString() {
        return "Comprador: " + cliente.getNome() + " | WhatsApp: " + cliente.getWhatsApp() + " | Produto Comprado: " + produto.getNome() + " | Valor: " + produto.getValor() + " | Data da compra: " + data;
    }
}
