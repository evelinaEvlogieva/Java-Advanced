import java.util.ArrayList;
import java.util.List;

public class ListUtils <T>{

    public static <T extends Comparable<T>> T getMin (List<T> list){

        if (list.size() == 0){
            throw new IllegalArgumentException();
        }

        T element = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(element) < 0){
                element = list.get(i);
            }
        }

        return element;
    }

    public static <T extends Comparable<T>> T getMax (List<T> list){
        if (list.size() == 0){
            throw new IllegalArgumentException();
        }

        T element = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(element) > 0){
                element = list.get(i);
            }
        }

        return element;

    }
}
