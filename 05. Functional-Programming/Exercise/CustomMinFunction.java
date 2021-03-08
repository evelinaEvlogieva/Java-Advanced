import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(input).min().getAsInt();

        //Function<Integer[], Integer> smallestNumber =

        System.out.println(min);
    }
}
