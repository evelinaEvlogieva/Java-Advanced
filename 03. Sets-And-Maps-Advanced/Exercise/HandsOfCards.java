import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> map = new LinkedHashMap<>();

        while (!"JOKER".equals(input)) {
            String[] data = input.split(": ");
            String name = data[0];
            String[] cards = data[1].split(", ");

            map.putIfAbsent(name, new LinkedHashSet<>());
            for (int i = 0; i < cards.length; i++) {
                map.get(name).add(cards[i]);
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> result = new LinkedHashMap<>();


        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            for (String card : entry.getValue()) {

                int sum = 0;
                int num1 = 0;
                int num2 = 0;

                char firstSymbol = card.charAt(0);

                if (Character.isDigit(firstSymbol)) {
                    if (firstSymbol == '1') {
                        num1 = 10;
                    } else {
                        num1 = Integer.parseInt(firstSymbol + "");

                    }

                } else {
                    if (firstSymbol == 'J') {
                        num1 = 11;
                    } else if (firstSymbol == 'Q') {
                        num1 = 12;
                    } else if (firstSymbol == 'K') {
                        num1 = 13;
                    } else if (firstSymbol == 'A') {
                        num1 = 14;
                    }
                }

                char lastSymbol = card.charAt(card.length() - 1);

                if (lastSymbol == 'S') {
                    num2 = 4;
                } else if (lastSymbol == 'H') {
                    num2 = 3;
                } else if (lastSymbol == 'D') {
                    num2 = 2;
                } else if (lastSymbol == 'C') {
                    num2 = 1;
                }

                sum = num1 * num2;
                result.putIfAbsent(entry.getKey(), 0);
                result.put(entry.getKey(), result.get(entry.getKey()) + sum);
            }
        }

        result.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}
