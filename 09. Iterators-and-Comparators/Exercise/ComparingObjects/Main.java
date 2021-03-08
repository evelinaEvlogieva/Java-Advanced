package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!"END".equals(input)) {
            String[] data = input.split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String town = data[2];
            Person person = new Person(name, age, town);
            people.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        Person toFind = people.get(index);

        int equalPeople = 0;

        for (Person person : people) {
            if (person.compareTo(toFind) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople == 1){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equalPeople, people.size() - equalPeople, people.size());
        }
    }
}
