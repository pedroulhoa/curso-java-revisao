package classe.desafioComida;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", 57.00);
        Pessoa p2 = new Pessoa("João", 75.00);

        p1.imprimirPeso();
        p2.imprimirPeso();

        Comida c1 = new Comida("PF", 0.80);
        Comida c2 = new Comida("Churrasco", 1.0);

        p1.comer(c1);
        p1.comer(c2);
        p2.comer(c2);

        p1.imprimirPeso();
        p2.imprimirPeso();

    }

}
