import atividade04.Conta;
import atividade04.Estoque;
import atividade04.Produto;
import atividade04.ProdutoComprado;

void main() {
    Scanner scanner = new Scanner(System.in);
    Estoque estoque = new Estoque();
    Produto detergenteAbc = new Produto("11111", "Detergente ABC", 1);
    estoque.addProduto(detergenteAbc);
    Produto sabaoOmo = new Produto("22222", "Sabão em pó OMO", 6.5);
    estoque.addProduto(sabaoOmo);
    Produto shampoo = new Produto("33333", "Shampoo Beleza Fácil", 12);
    estoque.addProduto(shampoo);
    Produto creme = new Produto("44444", "Creme dental Colgate", 3.5);
    estoque.addProduto(creme);
    Produto sabonete = new Produto("55555", "Sabonete Nívea", 1.8);
    estoque.addProduto(sabonete);
    Produto biscoito = new Produto("66666", "Biscoito Maizena", 2);
    estoque.addProduto(biscoito);
    Produto leite = new Produto("77777", "Leite desnatado Parmalat", 3);
    estoque.addProduto(leite);
    boolean continuarPagamento = false;

    System.out.println("---- Iniciar leitura de produtos ----");
    Conta conta = new Conta();

    do {

        System.out.println("Digite o codigo do produto: ");
        String cod = scanner.next();

        Produto p = estoque.findProduto(cod);

        System.out.println("Quantidade: ");
        int quant = scanner.nextInt();

        ProdutoComprado pc = new ProdutoComprado(p.getCodigo(), p.getDescricao(), p.getPreco(), quant);

        conta.addProdutos(pc, quant);

        System.out.println("Adicionar mais um produto: \n1-sim\n2-nao");
        int continua = scanner.nextInt();
        continuarPagamento = continua == 1;
    } while (continuarPagamento);

    System.out.println("---- Nota Fiscal ----");
    conta.imprimeConta();
}
