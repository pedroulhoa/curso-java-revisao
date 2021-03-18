package generics;

public class CaixaNumeroMain {

    public static void main(String[] args) {
        CaixaNumero<Double> caixaNumero = new CaixaNumero<>();
        caixaNumero.setCoisa(2.3);
        System.out.println(caixaNumero.getCoisa());

        CaixaNumero<Integer> caixaNumero2 = new CaixaNumero<>();
        caixaNumero2.setCoisa(33);
        System.out.println(caixaNumero2.getCoisa());
    }

}
