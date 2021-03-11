package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Function<Integer, String> numToBinary = n -> Integer.toBinaryString(n);
        UnaryOperator<String> invertString = b -> new StringBuilder(b).reverse().toString();
        Function<String, Integer> stringToInteger = b -> Integer.parseInt(b, 2);

        List<Integer> numsConvert = nums.stream()
                .map(Integer::toBinaryString)
                .map(invertString)
                .map(stringToInteger)
                .collect(Collectors.toList());

        numsConvert.forEach(System.out::println);

    }

}
