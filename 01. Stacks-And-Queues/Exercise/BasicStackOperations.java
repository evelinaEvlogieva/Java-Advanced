import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        if (input[0] == numbers.length) {
            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                stack.push(numbers[i]);
            }

            for (int i = 0; i < input[1]; i++) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                if (stack.contains(input[2])) {
                    System.out.println("true");
                } else {
                    for (int i = 0; i < stack.size(); i++) {
                        int currentValue = stack.pop();
                        if (currentValue < minValue){
                            minValue = currentValue;
                        }
                    }

                    System.out.println(minValue);
                }


            }

        }

        System.out.println();

    }
}
