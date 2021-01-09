package controle.desafio;

public class DesafioFor {

    public static void main(String[] args) {

        String controlador = "#";
        for (;controlador.length() < 5;) {
            System.out.println(controlador);
            controlador += "#";
        }

        for (String v = "#"; !v.equals("#####"); v += "#") {
            System.out.println(v);
        }

    }


}
