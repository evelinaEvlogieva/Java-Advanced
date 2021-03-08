import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            first.add(Integer.parseInt(scanner.nextLine()));

        }

        for (int i = 0; i < m; i++) {
            second.add(Integer.parseInt(scanner.nextLine()));
        }

        first.retainAll(second);

        for (Integer num : first) {
            System.out.print(num + " ");
        }
    }
}
