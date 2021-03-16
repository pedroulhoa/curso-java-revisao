package exceptions.personalizadaB;

import exceptions.Aluno;

public class App {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Pedro", 10);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");

    }

}
