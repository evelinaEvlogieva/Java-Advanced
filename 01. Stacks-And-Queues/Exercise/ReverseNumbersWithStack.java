import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> numbers = new ArrayDeque<>();


//        String[] input = scanner.nextLine().split("\\s+");

//        for (int i = 0; i < input.length; i++) {
//            numbers.push(input[i]);
//        }

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(numbers::push);

        while (!numbers.isEmpty()) {
            System.out.print((numbers.pop() + " "));
        }
    }
}
