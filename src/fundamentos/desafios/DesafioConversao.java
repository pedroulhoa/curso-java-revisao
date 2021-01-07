package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        // scanner
        // 3 strings
        // ultimos 3 salarios de funcionario
        // separar por virgula ou ponto
        // fazer media / 3

        Scanner sc = new Scanner(System.in);

        String salario1 = sc.nextLine();
        String salario2 = sc.nextLine();
        String salario3 = sc.nextLine();

        Double s1 = Double.parseDouble(salario1.replace(",", "."));
        Double s2 = Double.parseDouble(salario2.replace(",", "."));
        Double s3 = Double.parseDouble(salario3.replace(",", "."));

        System.out.println("Média salários: " + (s1+s2+s3) / 3);

        sc.close();
    }

}
