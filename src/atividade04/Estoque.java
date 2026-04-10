import java.util.HashMap;

public class Estoque {
    private HashMap<String, Produto> produtos;


    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void addProduto(Produto p) {
        produtos.put(p.getCodigo(), p);
    }

    public void removeProduto(Produto p) {
        produtos.remove(p.getCodigo(), p);
    }

    public Produto findProduto(String cod) {
        return produtos.get(cod);
    }
}
