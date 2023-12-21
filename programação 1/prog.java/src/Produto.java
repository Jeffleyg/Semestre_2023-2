public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Quantidade solicitada maior que o estoque");
        }

        this.estoque -= quantidade;
    }

    private boolean temEstoque(int quantidade) {
        return estoque >= quantidade;
    }
    
}
