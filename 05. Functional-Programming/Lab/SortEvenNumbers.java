import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 ==0)
                .collect(Collectors.toList());


        List<String> newNumbers = numbers.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.toList());

        System.out.println(String.join( ", ", newNumbers));

        Collections.sort(numbers);

        newNumbers = numbers.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.toList());

        System.out.println(String.join( ", ", newNumbers));



    }
}
