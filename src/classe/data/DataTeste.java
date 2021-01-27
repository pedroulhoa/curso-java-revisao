package classe.data;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data(05, 10, 1995);

        System.out.printf(d1.obterDataFormatada());
        System.out.println();
        System.out.printf(d2.obterDataFormatada());
    }

}
