package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar " + "\nas palavras mágicas...");
            System.out.println("Quer sair?");
            texto = sc.nextLine();
        }  while (!texto.equalsIgnoreCase("por favor"));

        sc.close();

    }

}

