package classe.produto;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        Produto.DESCONTO = 0.29;

        var precoFinal1 = p1.precoComDesconto();
        var precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }

}
