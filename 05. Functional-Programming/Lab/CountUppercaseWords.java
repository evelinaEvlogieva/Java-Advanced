import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Predicate<String> isUppercase = s -> Character.isUpperCase(s.charAt(0));

        List<String> words = new ArrayList<>();

        for (String word : input) {
            if (isUppercase.test(word)){
                words.add(word);
            }
        }

        System.out.println(words.size());
        for (String word : words) {
            System.out.println(word);
        }

    }
}
