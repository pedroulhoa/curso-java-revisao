package arrays;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas que deseja cadastrar: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("Média das notas: %.2f", media);

        sc.close();
    }

}
