import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] symbols = scanner.nextLine().toCharArray();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < symbols.length; i++) {
            map.putIfAbsent(symbols[i], 0);
            map.put(symbols[i], map.get(symbols[i]) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
