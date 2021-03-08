import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("4")) {
                if (!stack.isEmpty()) {
                    sb.delete(0, sb.length()).append(stack.pop());
                }


            } else {
                String text = input[1];

                if (command.equals("1")) {
                    stack.push(sb.toString());
                    sb.append(text);

                } else if (command.equals("2")) {
                    int count = Integer.parseInt(text);
                    if (sb.length() >= count) {
                        stack.push(sb.toString());
                        sb.replace(sb.length() - count, sb.length() + 1, "");
                    }

                } else if (command.equals("3")) {

                    int index = Integer.parseInt(text) - 1;
                    if (index >= 0) {

                        System.out.println(sb.charAt(index));
                    }

                }
            }
        }
    }
}
