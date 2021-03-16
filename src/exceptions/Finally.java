package exceptions;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(7 / sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("bloco finally");
            sc.close();
        }

        System.out.println("Fim do programa!");

    }

}
