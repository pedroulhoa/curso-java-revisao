package classe.produto;

public class Produto {

    String nome;
    double preco;
    static double DESCONTO = 0.25;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return preco * (1 - DESCONTO);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - DESCONTO + descontoDoGerente);
    }

}
