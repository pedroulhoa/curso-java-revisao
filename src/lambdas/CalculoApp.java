package lambdas;

import java.util.function.BinaryOperator;

public class CalculoApp {

    public static void main(String[] args) {

        // Utilizando interface funcional criada na mão:
        Calculo calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));

        // ----------------------------------------------------

        // Utilizando interface funcional já existente na API do Java:
        BinaryOperator<Double> calcExeploBinaryOperator = (x, y) -> {return x + y;};
        System.out.println(calcExeploBinaryOperator.apply(1.0, 3.0));

        calcExeploBinaryOperator = (x, y) -> x + y;
        System.out.println(calcExeploBinaryOperator.apply(2.0, 3.0));

    }

}
