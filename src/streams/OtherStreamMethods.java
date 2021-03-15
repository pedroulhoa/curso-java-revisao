package streams;

import java.util.Arrays;
import java.util.List;

public class OtherStreamMethods {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", 7.8);
        Aluno a2 = new Aluno("João", 5.8);
        Aluno a3 = new Aluno("Lucas", 9.8);
        Aluno a4 = new Aluno("Maria", 6.8);
        Aluno a5 = new Aluno("Pedro", 7.8);
        Aluno a6 = new Aluno("João", 5.8);
        Aluno a7 = new Aluno("Lucas", 9.8);
        Aluno a8 = new Aluno("Maria", 6.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream()
                .distinct().
                forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }

}
