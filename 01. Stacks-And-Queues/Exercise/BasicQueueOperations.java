import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        if (input[0] == numbers.length){
            for (int i = 0; i < numbers.length; i++) {
                queue.offer(numbers[i]);
            }

            for (int i = 0; i < input[1]; i++) {
                queue.pop();

            }

            if (queue.isEmpty()){
                System.out.println(0);
            } else {
                if (queue.contains(input[2])){
                    System.out.println("true");
                } else {
                    System.out.println(Collections.min(queue));
                }
            }
        }




    }
}
