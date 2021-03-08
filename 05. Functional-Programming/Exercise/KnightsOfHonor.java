import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> printWithSir = p -> System.out.printf("Sir %s%n", p);

        Arrays.stream(input).forEach(printWithSir);

    }
}
