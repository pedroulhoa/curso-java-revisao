package classe.data;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 05;
        d1.mes = 10;
        d1.ano = 1995;

        Data d2 = new Data();
        d2.dia = 13;
        d2.mes = 9;
        d2.ano = 1997;

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
        System.out.println();
        System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
    }

}
