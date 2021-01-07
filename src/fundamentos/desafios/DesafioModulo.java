package fundamentos.desafios;

import java.util.Scanner;

public class DesafioModulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        Double num1 = sc.nextDouble();

        System.out.println("Digite segundo numero: ");
        Double num2 = sc.nextDouble();

        System.out.println("Digite operador (+ - / * %): ");
        String operador = sc.next();

        Double result = "+".equals(operador) ? num1 + num2 : 0;
        result = "-".equals(operador) ? num1 - num2 : result;
        result = "*".equals(operador) ? num1 * num2 : result;
        result = "/".equals(operador) ? num1 / num2 : result;
        result = "%".equals(operador) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);

        sc.close();
    }
}
