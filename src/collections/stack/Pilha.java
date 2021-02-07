package collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno Príncipe"); // retona falso em caso de pilha cheia;
        livros.push("Don quixote"); //lança uma exceção em caso de pilha cheia;
        livros.push("O Hobbit");

        // Peek e Element -> obter próximo elemento da pilha (sem remover);
        livros.peek(); // retorna false;
        livros.element(); // retorna uma exceção;

        // É possível usar for normalmente, os elementos são exibidos na ordem da pilha;
        for (String livro : livros) {
            System.out.println(livro);
        }

        // Poll e Pop -> obtem o próximo elemento da pilha e remove;
        // Diferença é o comportamento que ocorre quando a pilha está vazia;
        livros.poll(); // retorna null;
        livros.pop(); // lança uma execeção;

        // Métodos comuns com outras collections;
        livros.size();
        livros.clear();
        livros.isEmpty();
        livros.contains("teste");
    }
}
