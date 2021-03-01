package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Tipos primitivos
        // Informações de funcionário

        // Tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 2_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        System.out.println(numeroDeVoos / 2);
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }

}
