import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    
    public Pedido(){
        itens = new ArrayList<>();
    }
    
    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double getValorTotal(){
        double valorTotal = 0;
        for(ItemPedido item : itens){
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }


}
