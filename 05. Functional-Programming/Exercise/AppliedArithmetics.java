import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        Function<int[], int[]> add = nums -> Arrays.stream(nums).map(e -> e + 1).toArray();
        Function<int[], int[]> multiply = nums -> Arrays.stream(nums).map(e -> e * 2).toArray();
        Function<int[], int[]> subtract = nums -> Arrays.stream(nums).map(e -> e - 1).toArray();
        Consumer<int[]> print = nums -> Arrays.stream(nums).forEach(p -> System.out.print(p + " "));

        while (!"end".equals(input)) {
            if ("add".equals(input)) {
                numbers = add.apply(numbers);

            } else if ("multiply".equals(input)) {
                numbers = multiply.apply(numbers);

            } else if ("subtract".equals(input)) {
                numbers = subtract.apply(numbers);
            } else {
                print.accept(numbers);
                System.out.println();
            }

            input = scanner.nextLine();
        }
    }
}
