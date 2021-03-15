package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", 3.8);
        Aluno a2 = new Aluno("João", 3.8);
        Aluno a3 = new Aluno("Lucas", 3.8);
        Aluno a4 = new Aluno("Maria", 3.8);
        Aluno a5 = new Aluno("Daniel", 7.1);
        Aluno a6 = new Aluno("Ana", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate()));
    }
}
