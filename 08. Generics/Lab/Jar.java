import java.util.ArrayList;
import java.util.List;

public class Jar<T> {

    private List<T> content;

    public Jar() {
        this.content = new ArrayList<>();
    }

    public void add(T element) {
        this.content.add(element);
    }

    public T remove() {
        return this.content.remove(this.content.size() - 1);

    }

}
