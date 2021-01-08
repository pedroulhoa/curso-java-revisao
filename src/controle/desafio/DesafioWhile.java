package controle.desafio;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double mediaAux = 0.0;
        Double mediaTurma = 0.0;
        int qtdAlunos = 0;

        while (mediaTurma != -1) {
            System.out.println("Digite a média do aluno: ");
            mediaTurma = sc.nextDouble();

            if (mediaTurma <= 10 && mediaTurma >= 0) {
                mediaAux += mediaTurma;
                qtdAlunos++;
            } else if (mediaTurma != -1) {
                System.out.println("Nota inválida!");
            }
        }

        Double mediaTotal = mediaAux / qtdAlunos;
        System.out.printf("A média da turma é: %.2f", mediaTotal);


        sc.close();

    }

}
