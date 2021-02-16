package oo.heranca.desafio;

public class AppCarro {

    public static void main(String[] args) {

        Civic civic = new Civic(210);
        Ferrari ferrari = new Ferrari();

        System.out.println("Velocidade Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        ferrari.frear();

        System.out.println("Velocidade Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);


    }

}
