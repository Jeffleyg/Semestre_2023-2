public class App {
    public static void main(String[] args) throws Exception {
       // Cria alguns produtos
            Produto produto1 = new Produto("Caderno", 10, 10);
            Produto produto2 = new Produto("Lápis", 2, 20);
            Produto produto3 = new Produto("Borracha", 1, 30);

            // Cria um objeto Cliente
            Cliente cliente = new Cliente("Fulano", "fulano@email.com", "123.456.789-00");
    
            // Cria um pedido
            Pedido pedido = new Pedido(1, cliente);
    
            // Adiciona itens ao pedido
            pedido.adicionarItem(produto1, 2);
            pedido.adicionarItem(produto2, 1);
            pedido.adicionarItem(produto3, 3);
    
            // Obtém o valor total da compra
            double valorTotal = pedido.getValorTotal();
    
            // Imprime o valor total da compra
            System.out.println("O valor total da compra é R$" + valorTotal);
        }
}
