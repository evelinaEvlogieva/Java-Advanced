import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean areEqual = true;

        for (int i = 0; i < input.length; i++) {
            if (input[i].charAt(0) == '(' || input[i].charAt(0) == '{' || input[i].charAt(0) == '[') {
                stack.push(input[i].charAt(0));
            } else {
                if (stack.isEmpty()) {
                    areEqual = false;
                    break;
                } else {
                    char current = stack.pop();
                    if (current == '(' && input[i].charAt(0) != ')') {
                        areEqual = false;
                        break;
                    } else if (current == '[' && input[i].charAt(0) != ']') {
                        areEqual = false;
                        break;
                    } else if (current == '{' && input[i].charAt(0) != '}') {
                        areEqual = false;
                        break;
                    }
                }


            }
        }

        if (areEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
