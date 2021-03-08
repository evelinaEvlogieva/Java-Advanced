import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Long>> all = new LinkedHashMap<>();
        Map<String, Long> countries = new LinkedHashMap<>();

        while (!"report".equals(input)) {
            String[] data = input.split("[|]");
            String city = data[0];
            String country = data[1];
            long population = Long.parseLong(data[2]);

            all.putIfAbsent(country, new LinkedHashMap<>());
            all.get(country).putIfAbsent(city, population);

            countries.putIfAbsent(country, 0L);
            countries.put(country, countries.get(country) + population);

            input = scanner.nextLine();
        }

        countries.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().compareTo(f.getValue());
            return result;
        }).forEach(e -> {
            System.out.printf("%s (total population: %d)%n", e.getKey(), e.getValue());
            for (Map.Entry<String, Map<String, Long>> entry : all.entrySet()) {
                entry.getValue().entrySet().stream().sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    return result;
                }).forEach(p -> {
                    if (entry.getKey().equals(e.getKey())){
                        System.out.printf("=>%s: %d%n", p.getKey(), p.getValue());
                    }
                });
            }

        });
    }
}