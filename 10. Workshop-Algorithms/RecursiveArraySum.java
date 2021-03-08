import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        System.out.println(sum(input, 0));
    }

    static int sum(int[] array, int index) {

        if (index == array.length - 1) {
            return array[index];
        }

        return array[index] + sum(array, index + 1);

    }
}
