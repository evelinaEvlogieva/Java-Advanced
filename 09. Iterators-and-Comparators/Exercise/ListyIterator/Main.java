package ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());

        ListyIterator iterator = new ListyIterator(list);

        String input = scanner.nextLine();

        while (!"END".equals(input)){
            switch (input){
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        System.out.println(iterator.print());
                    } catch (IllegalAccessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;



            }

            input = scanner.nextLine();
        }


    }
}
