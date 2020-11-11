package desafios;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        int part1 = (int) Math.pow(6 * (3 + 2), 2);
        int resultPart1 = part1 / (3 * 2);

        int part2 = ((1 - 5) * (2 - 7) / 2);
        int resultPart2 = (int) Math.pow(part2, 2);

        int finalResult = (int) Math.pow((resultPart1 - resultPart2), 3) / (int) Math.pow(10, 3);

        System.out.println(finalResult);

    }

}
