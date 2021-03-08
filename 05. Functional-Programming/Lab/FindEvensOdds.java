import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ИМА ПРЕДИКАТИ, НО БЕЗ МЕТОД!!!

        String[] input = scanner.nextLine().split("\\s+");
        String evenOrOdd = scanner.nextLine();

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        Predicate<Integer> evenFilter = d -> d % 2 == 0;
        Predicate<Integer> oddFilter = d -> d % 2 != 0;

        List<Integer> numbers = new ArrayList<>();

        if ("even".equals(evenOrOdd)) {
            for (int i = num1; i <= num2 ; i++) {
                if (evenFilter.test(i)){
                    numbers.add(i);
                }
            }

        } else if ("odd".equals(evenOrOdd)) {
            for (int i = num1; i <= num2 ; i++) {
                if (oddFilter.test(i)){
                    numbers.add(i);
                }
            }
        }


        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

}
