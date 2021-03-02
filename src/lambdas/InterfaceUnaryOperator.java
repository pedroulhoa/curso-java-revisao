package lambdas;

import java.util.function.UnaryOperator;

public class InterfaceUnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // composição usando andThen, forma sequencial:
        int result1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(result1);

        // composição usando compose, ele roda as operações do compose primeiro:
        int result2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        System.out.println(result2);

    }

}
