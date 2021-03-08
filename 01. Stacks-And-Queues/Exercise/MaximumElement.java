import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("1")){
                int number = Integer.parseInt(input[1]);
                stack.push(number);
            } else if (input[0].equals("2")){
                stack.pop();
            } else if (input[0].equals("3")){
//                int max = stack.stream().max(Integer::compareTo).orElse(0);
//                System.out.println(max);
                System.out.println(Collections.max(stack));
            }
        }
    }
}
