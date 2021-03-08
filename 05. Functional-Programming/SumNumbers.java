import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Function <String, Integer> parsing = (s -> Integer.parseInt(s));

        int sum = 0;

        for (String num : input) {
            sum += parsing.apply(num);
        }

        System.out.printf("Count = %d%n", input.length);
        System.out.printf("Sum = %d", sum);
    }
}
