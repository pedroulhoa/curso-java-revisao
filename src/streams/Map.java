package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(name -> name.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = name -> name.toUpperCase();
        UnaryOperator<String> primeiraLetra = name -> name.charAt(0) + "";
        UnaryOperator<String> grito = name -> name + "!!!";

        System.out.println("Usando composição: ");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);

    }
}

