package collections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneo {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // aceita vários tipos;
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size()); // ver tamanho;

        conjunto.add("Teste"); // não aceita elementos repetidos, ignorando o add;
        System.out.println(conjunto.size());

        conjunto.remove('x'); // remove do conjunto;

        // verifica se existe, retornando boolean
        conjunto.contains('x');
        conjunto.contains(1);

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); // união entre os dois conjuntos;

        conjunto.retainAll(nums); // retem apenas os elementos em comum que estão no conjunto que foi passado;

        System.out.println(conjunto);

        conjunto.clear(); // limpa o conjunto;
    }

}
