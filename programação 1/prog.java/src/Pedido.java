import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigo;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (!produto.temEstoque(quantidade)) {
            throw new IllegalArgumentException("Produto sem estoque suficiente");
        }

        itens.add(new ItemPedido(produto, quantidade));
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
}
