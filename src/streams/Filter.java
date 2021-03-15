package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro", 7.8);
        Aluno a2 = new Aluno("João", 5.8);
        Aluno a3 = new Aluno("Lucas", 9.8);
        Aluno a4 = new Aluno("Maria", 6.8);
        Aluno a5 = new Aluno("Daniel", 7.1);
        Aluno a6 = new Aluno("Ana", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        List<Aluno> alunosAprovados = alunos.stream().filter(a -> a.nota >= 7).collect(Collectors.toList());

        alunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(a -> "Parabéns! " + a.name + "! Você foi aprovado!")
                .forEach(System.out::println);

        alunosAprovados.stream()
                .map(aluno -> "Aprovado: " + aluno.name + " Nota: " + aluno.nota)
                .forEach(System.out::println);
    }

}
