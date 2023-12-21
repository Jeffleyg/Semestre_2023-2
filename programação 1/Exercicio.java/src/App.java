// Jeffley garçon
// 2311100023


public class App {
    public static void main(String[] args) throws Exception {

    
        Produto produto1 = new Produto("Arroz", 18.99, 1876);
        Produto produto2 = new Produto("Abacaxi", 15.99, 98675);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(produto1, 3);
        pedido.adicionarItem(produto2, 2);
        
        double valorTotal = pedido.getValorTotal();

        System.out.println("\nO valor total do seu pedido: R$" + valorTotal);


    }
}
