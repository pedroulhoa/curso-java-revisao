package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola pessoal!!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Henrique";
        var idade = 25;
        var salario = 3000.00;

        String frase1 = "\n\nNome: " + nome
                + "\nSobrenome : " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario
                + "\n\n";

        System.out.println(frase1);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);

        String frase2 = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario);
        System.out.println(frase2);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));

    }

}

