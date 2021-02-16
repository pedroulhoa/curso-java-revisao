package oo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super(350);
    }

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

}
