import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> map = new HashMap<>();

        while(!"search".equals(input)){
            String[] data = input.split("-");
            String name = data[0];
            String number = data[1];

            map.put(name, number);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!"stop".equals(input)){
            if (map.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, map.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }
    }
}
