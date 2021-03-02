package lambdas;

import java.util.function.BiFunction;

public class InterfaceBiFunction {

    public static void main(String[] args) {

        // Definindo interface BiFunction para calcular media e retorna string:
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 5.1));

    }

}
