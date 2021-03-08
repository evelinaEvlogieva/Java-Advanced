import java.util.Arrays;
        import java.util.Scanner;
        import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> print = p -> System.out.println(p);

        Arrays.stream(input).forEach(print);


    }
}
