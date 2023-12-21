public class ItemPedido {
    private Produto produto;
    private int quantidade;
    public double valorTotal;
    
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal(){
        return produto.getPreco()*quantidade;

    }
    
}
