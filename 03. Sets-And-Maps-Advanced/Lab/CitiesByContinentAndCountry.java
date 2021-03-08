import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country, new ArrayList<>());
            map.get(continent).get(country).add(city);

        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().forEach((country, cities) -> {
                System.out.printf("  %s -> %s%n", country, String.join(", ", cities));
            });
        }
    }
}
