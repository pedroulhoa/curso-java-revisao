package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomogeneo {

    public static void main(String[] args) {

        Set<String> lista1 = new HashSet<>(); // HashSet não é ordenado por ordem de inserção;
        Set<String> lista2 = new TreeSet<>(); // TreeSet é ordenado por ordem de inserção;
        lista2.add("Ana");
        lista2.add("Carlos");
        lista2.add("Luca");
        lista2.add("Pedro");

        for (String candidato : lista2) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (Integer n : nums) {
            System.out.println(n);
        }

    }

}
