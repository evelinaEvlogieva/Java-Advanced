package Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> people = new LinkedHashMap<>();

        while ((!"End".equals(input))) {
            String[] data = input.split("\\s+");
            String name = data[0];
            people.putIfAbsent(name, new Person(name));
            Person person = people.get(name);

            String keyWord = data[1];
            switch (keyWord) {
                case "company":
                    String companyName = data[2];
                    String department= data[3];
                    double salary =  Double.parseDouble(data[4]);
                    person.setCompany(new Company(companyName,department, salary));
                    break;
                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType= data[3];
                    person.add(new Pokemon(pokemonName, pokemonType));
                    break;
                case "parents":
                    String parentName = data[2];
                    String parentBirthday= data[3];
                    person.add(new Parents(parentName, parentBirthday));
                    break;
                case "children":
                    String childName = data[2];
                    String childBirthday= data[3];
                    person.add(new Children(childName, childBirthday));
                    break;
                case "car":
                    String carModel = data[2];
                    String carSpeed= data[3];
                    person.setCar(new Car(carModel, carSpeed));
                    break;
            }


            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        if (people.containsKey(name)) {
            System.out.print(people.get(name));
        }

    }
}
