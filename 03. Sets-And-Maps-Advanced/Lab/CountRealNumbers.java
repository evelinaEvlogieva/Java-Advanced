import java.util.*;
import java.util.function.LongUnaryOperator;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> mapOfNumbers = new LinkedHashMap<>();

        for (Double number : numbers) {
            mapOfNumbers.putIfAbsent(number, 0);
            mapOfNumbers.put(number, mapOfNumbers.get(number) + 1);
        }

        mapOfNumbers.entrySet().forEach(entry -> {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        });
    }
}
