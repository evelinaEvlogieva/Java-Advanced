import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        BiPredicate<String, Integer> isLessOrEqual = (s, i) -> s.length() <= i;

        for (int i = 0; i < names.length; i++) {
            if (isLessOrEqual.test(names[i], n)){
                System.out.println(names[i]);
            }
        }


    }
}
