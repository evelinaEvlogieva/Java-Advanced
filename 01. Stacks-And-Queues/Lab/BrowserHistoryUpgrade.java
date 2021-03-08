import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();


        while (!"Home".equals(input)) {
            if ("back".equals(input)) {
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());

                } else {
                    System.out.println("no previous URLs");
                }
            } else if ("forward".equals(input)) {
                if (queue.size() > 1){
                   queue.poll();
                    System.out.println(queue.peek());
                } else {
                    System.out.println("no next URLs");
                }

            } else {
                stack.push(input);
                queue.offer(input);
                System.out.println(input);
            }


            input = scanner.nextLine();

        }
    }
}
