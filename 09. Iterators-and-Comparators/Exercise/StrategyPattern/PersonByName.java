import java.util.Comparator;

public class PersonByName implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int result = first.getName().length() - second.getName().length();

        if (result == 0){
            char f = first.getName().toUpperCase().charAt(0);
            char s = second.getName().toUpperCase().charAt(0);
            result = f - s;
        }
        return result;
    }
}
