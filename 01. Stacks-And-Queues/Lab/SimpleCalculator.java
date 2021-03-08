import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = input.length - 1; i >= 0 ; i--) {
            stack.push(input[i]);
        }

        int result = 0;

        while (stack.size() != 1){
            int firstNum = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            //2 - 2 + 5

            if ("+".equals(operation)){
                result = firstNum + secondNum;
                stack.push(result + "");
            } else if ("-".equals(operation)){
                result = firstNum - secondNum;
                stack.push(result + "");
            }

        }

        System.out.println(result);
    }
}
