package generics;

public class CaixaMain {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.setCoisa("Guardou!");
        String coisaA = caixaA.getCoisa();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.setCoisa(2.7);
        Double coisaB = caixaB.getCoisa();
        System.out.println(coisaB);

    }

}
