package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add ->  adicionam elementos na fila;

        // Diferença é o comportamento que ocorre quando a fila está cheia;
        fila.add("Ana"); // retona falso em caso de fila cheia;
        fila.offer("Carlos"); // Lança uma execeção em caso de fila cheia;
        fila.add("Daniel");
        fila.offer("Guilherme");

        // Peek e Element -> obter próximo elemento da fila (sem remover);
        // Diferença é o comportamento que ocorre quando a fila está vazia;
        fila.peek(); // retorna false;
        fila.element(); // retorna uma exceção;

        // Poll e Remove -> obtem o próximo elemento da fila e remove;
        // Diferença é o comportamento que ocorre quando a fila está vazia;
        fila.poll(); // retorna false;
        fila.remove(); // lança uma execeção;

        // Métodos comuns com outras collections;
        fila.size();
        fila.clear();
        fila.isEmpty();
        fila.contains("Ana");
    }
}
