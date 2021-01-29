package classe.desafioComida;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    void imprimirPeso() {
        System.out.printf("O peso do(a) %s é %.2f \n", this.nome, this.peso);
    }
}
