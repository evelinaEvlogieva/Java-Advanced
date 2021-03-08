import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, LinkedHashMap<String, Double>> map = new TreeMap<>();

        while (!"Revision".equals(input)){
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : map.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            entry.getValue().forEach((product, price) -> {
                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            });
        }
    }
}
