
public class ProdutoComprado extends Produto {
    private int quantidade;

    public ProdutoComprado(String codigo, String descricao, double preco, int quantidade) {
        super(codigo, descricao, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
