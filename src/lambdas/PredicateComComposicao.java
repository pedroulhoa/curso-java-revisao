package lambdas;

import java.util.function.Predicate;

public class PredicateComComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        boolean test1 = isPar.and(isTresDigitos).negate().test(123);
        boolean test2 = isPar.or(isTresDigitos).test(123);

        System.out.println(test1);
        System.out.println(test2);

    }
}
