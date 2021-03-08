import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) < min){
                min = list.get(i);
                minIndex = i;
            }

            if (list.get(i) == min){
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}
