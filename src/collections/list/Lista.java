package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("UsuarioNome");
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessa índice da lista;

        lista.remove(1); // remove por índice;
        lista.remove(new Usuario("Manu")); // remove por objeto;

        lista.contains(u1); // verifica se existe esse usuário na lista;

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

    }

}
