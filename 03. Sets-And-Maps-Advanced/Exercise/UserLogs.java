import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> map = new TreeMap<>();

//        map.putIfAbsent(symbols, 0);
//        map.put(symbols, map.get(symbols) + 1);

        while (!"end".equals(input)) {
            String[] data = input.split("\\s+");
            String id = data[0].substring(3);
            String user = data[2].substring(5);

            map.putIfAbsent(user, new LinkedHashMap<>());
            map.get(user).putIfAbsent(id, 0);
            map.get(user).put(id, map.get(user).get(id) + 1);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":");
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, Integer> value : entry.getValue().entrySet()) {
                list.add(String.format("%s => %d", value.getKey(), value.getValue()));
            }

            String output = String.join(", ", list);

            System.out.printf("%s.%n", output);

        }
    }
}
