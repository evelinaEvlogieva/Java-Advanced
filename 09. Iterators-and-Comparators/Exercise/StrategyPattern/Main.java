import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> peopleByName = new TreeSet<>(new PersonByName());
        Set<Person> peopleByAge = new TreeSet<>(new PersonByAge());

        for (int i = 0; i < n; i++) {
            String[] data =scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);

            peopleByName.add(person);
            peopleByAge.add(person);

        }

        for (Person person : peopleByName) {
            System.out.println(person.toString());
        }

        for (Person person : peopleByAge) {
            System.out.println(person.toString());
        }
    }
}
