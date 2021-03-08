import java.util.Comparator;

public class PersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
