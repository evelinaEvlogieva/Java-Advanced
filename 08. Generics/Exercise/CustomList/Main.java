package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> list = new CustomList<>();

        while (!"END".equals(input)) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Add":
                    list.add(data[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(data[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(data[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(data[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    CustomList.printList(list);
                   // list.forEach(System.out::println);
                    break;
            }

            input = scanner.nextLine();


        }


    }

}
