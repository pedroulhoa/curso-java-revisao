package lambdas;

import java.util.function.BinaryOperator;

public class InterfaceBinaryOperator {

    public static void main(String[] args) {

        // Definindo interface BinaryOperator para calcular media:
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        Double resultadoMedia = media.apply(9.8, 5.7);
        System.out.println(resultadoMedia);

    }

}
