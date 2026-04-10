import java.util.HashMap;

public class Conta {
    private double valorTotal = 0;
    private HashMap<String, ProdutoComprado> produtos;

    public Conta() {
        this.produtos = new HashMap<>();
    }

    public Conta(double valorTotal, HashMap<String, ProdutoComprado> produtos) {
        this.valorTotal = valorTotal;
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public HashMap<String, ProdutoComprado> getProdutos() {
        return produtos;
    }

    public void setProdutos(HashMap<String, ProdutoComprado> produtos) {
        this.produtos = produtos;
    }

    public void addProdutos(ProdutoComprado p, int q) {
        produtos.put(p.getCodigo(), p);
        valorTotal += (p.getPreco() * q);
    }

    public void removeProduto(ProdutoComprado p) {
        produtos.remove(p.getCodigo(), p);
        valorTotal -= p.getPreco();
    }

    public void imprimeConta() {
        System.out.println("Quantidade | Descricao | Valor Unit | Total");
        produtos.forEach((cod, p) -> {
            System.out.println(p.getQuantidade() + " | " + p.getDescricao() + " | " + p.getPreco() + " | " + (p.getPreco()*p.getQuantidade()));
        });

        System.out.println("Valor Total: R$" + this.valorTotal);
    }
}
