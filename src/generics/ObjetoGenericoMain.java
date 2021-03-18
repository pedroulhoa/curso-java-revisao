package generics;

public class ObjetoGenericoMain {

    public static void main(String[] args) {
        ObjetoGenerico caixaA = new ObjetoGenerico();
        caixaA.setCoisa(2.3);
        Double coisaA = (Double) caixaA.getCoisa();
        System.out.println(coisaA);

        ObjetoGenerico caixaB = new ObjetoGenerico();
        caixaB.setCoisa("Oi!");
        String coisaB = (String) caixaB.getCoisa();
        System.out.println(coisaB);
    }

}
