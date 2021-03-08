import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {
            if ("cancel".equals(input)) {
                if (queue.size() == 0){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", queue.poll());
                }

            } else {
                queue.offer(input);
            }

            input = scanner.nextLine();

        }

        queue.forEach(e -> System.out.println(e));
    }
}
