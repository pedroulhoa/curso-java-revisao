package exceptions;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        // Como é uma exceção NÃO checada, não gera erro ao não envolver um try...catch;
        // Mesmo assim o programa é parado, e não é executado o restante do código;
        geraErro1();

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Fim!");

    }

    // Exceção NÃO checada ou NÃO verificada;
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro. #1");
    }

    // Exceção checada ou verificada;
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro. #2");
    }

}
