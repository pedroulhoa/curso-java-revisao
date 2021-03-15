package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Pesquisa p1 = new Pesquisa(7, "Pedro", true);
        Pesquisa p2 = new Pesquisa(4, "João", false);
        Pesquisa p3 = new Pesquisa(5, "Martins", false);
        Pesquisa p4 = new Pesquisa(9, "Ana", true);

        List<Pesquisa> pesquisas = Arrays.asList(p1, p2, p3, p4);

        Predicate<Pesquisa> filtraNotas = pesquisa -> pesquisa.nota >= 6;
        Predicate<Pesquisa> filtraRecomendacao = pesquisa -> pesquisa.recomendariaParaAmigos;

        pesquisas.stream()
                .filter(filtraNotas)
                .filter(filtraRecomendacao)
                .map(pesquisa -> pesquisa.nomeUsuario + " é um possível cliente recorrente!")
                .forEach(System.out::println);
    }

}
