import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerbianUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([A-Za-z A-Za-z ]+) (\\@)([A-Za-z A-Za-z 0-9]+) (\\d+) (\\d+)";

        String input = scanner.nextLine();

        Map<String, Map<String, Long>> concert = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("End")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String singerName = matcher.group(1);
                String venues = matcher.group(3);
                long priceTicket = Long.parseLong(matcher.group(4));
                long countTicket = Long.parseLong(matcher.group(5));
                long tickets = priceTicket * countTicket;

                concert.putIfAbsent(venues, new LinkedHashMap<>());
                concert.get(venues).putIfAbsent(singerName, (long) 0);
                concert.get(venues).put(singerName, concert.get(venues).get(singerName) + tickets);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Long>> entry : concert.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream()
                    .sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                    .forEach(e -> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
        }
    }
}
