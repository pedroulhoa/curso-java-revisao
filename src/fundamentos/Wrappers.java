package fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        Byte b = 100;
        System.out.println(b.byteValue());

        Short s = 1000;
        System.out.println(s.toString());

        Integer i = 10000;
        Integer iParse = Integer.parseInt("10000");
        System.out.println(i * 3);
        System.out.println(iParse);

        Long l = 100000L;
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.4585;
        System.out.println(d);

        Character c = '#';
        System.out.println(c + "...");

    }

}
