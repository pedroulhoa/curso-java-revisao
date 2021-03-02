package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class InterfaceSupplier {

    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Test1", "Test2", "Test3", "Test4");

        System.out.println(umaLista.get());

    }

}
