package controle.desafio;

import java.util.Scanner;

public class DesafioIfSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.next();

        if (diaSemana.equalsIgnoreCase("segunda")) {
            System.out.println("1");
        } else if (diaSemana.equalsIgnoreCase("terça")) {
            System.out.println("2");
        } else if (diaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("3");
        } else if (diaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("4");
        } else if (diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("5");
        } else if (diaSemana.equalsIgnoreCase("sábado")) {
            System.out.println("6");
        } else if (diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("7");
        } else {
            System.out.println("Dia inválido!");
        }

        sc.close();

    }

}
