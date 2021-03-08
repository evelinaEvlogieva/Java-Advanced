import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        list.stream().sorted().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        list.stream().sorted().filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " "));
    }
}
