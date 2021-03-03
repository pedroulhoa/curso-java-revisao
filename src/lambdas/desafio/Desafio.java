package lambdas.desafio;

import lambdas.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto produto = new Produto("iPad", 3235.89, 0.50);

        Function<Produto, Double> calculaDesconto = p -> p.getPreco() * (1 - p.getDesconto());
        UnaryOperator<Double> calculaImposto = (preco) -> preco >= 2500 ? (preco * 1.085) : preco;
        UnaryOperator<Double> calculaFrete = (preco) -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondarValor = (preco) -> Double.parseDouble(String.format("%.2f", preco)
                .replace(",", "."));
        Function<Double, String> formatar = (preco) -> "R$".concat(String.valueOf(preco))
                .replace(".", ",");

        String valorCalculado = calculaDesconto
                .andThen(calculaImposto)
                .andThen(calculaFrete)
                .andThen(arredondarValor)
                .andThen(formatar)
                .apply(produto);

        System.out.println(valorCalculado);
    }

}
