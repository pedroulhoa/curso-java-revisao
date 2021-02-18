package lambdas;

import arrays.Foreach;

import java.util.Arrays;
import java.util.List;

public class ExemploForeachFuncional {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Formal tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> imprimirPersonalizado(nome));

        System.out.println("\nMethod Reference #2...");
        aprovados.forEach(ExemploForeachFuncional::imprimirPersonalizado);

    }

    static void imprimirPersonalizado(String nome) {
        System.out.println("Olá! Meu nome é " + nome);
    }

}
