package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.setCoisa(2);
        Integer coisaA = caixaA.getCoisa();
        System.out.println(coisaA);

    }

}
