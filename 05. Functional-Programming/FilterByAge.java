import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //РЕШЕНИЕТО Е БЕЗ ФУНКЦИИ!!!

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> poeple = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            poeple.putIfAbsent(name, age);
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        if ("older".equals(condition)) {
            if ("name age".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() >= age) {
                        System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
                    }
                }
            } else if ("name".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() >= age) {
                        System.out.printf("%s%n", entry.getKey());
                    }
                }
            } else if ("age".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() >= age) {
                        System.out.printf("%d%n", entry.getValue());
                    }
                }
            }
        } else if ("younger".equals(condition)) {
            if ("name age".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() <= age) {
                        System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
                    }
                }

            } else if ("name".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() <= age) {
                        System.out.printf("%s%n", entry.getKey());
                    }
                }

            } else if ("age".equals(format)) {
                for (Map.Entry<String, Integer> entry : poeple.entrySet()) {
                    if (entry.getValue() <= age) {
                        System.out.printf("%d%n", entry.getValue());
                    }
                }

            }

        }
    }
}

