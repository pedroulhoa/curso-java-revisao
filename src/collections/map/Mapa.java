package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        // Add elementos ao map;
        // Caso adicione uma chave duplicada ao map, ele substitui o valor;
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        usuarios.size();
        usuarios.isEmpty();

        System.out.println(usuarios.keySet()); // retorna chaves do map;
        System.out.println(usuarios.values()); // retorna valores do map;
        System.out.println(usuarios.entrySet()); // retorna os dois valores (key=value);

        System.out.println(usuarios.containsKey(20)); // verifica se um valor existe atraves da chave;
        System.out.println(usuarios.containsValue("Rebeca")); // verifica se um valor existe atraves do valor;

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Teste"));


        for (Integer chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
            System.out.println(usuario.getKey() + " ==> " + usuario.getValue());
        }
    }
}
