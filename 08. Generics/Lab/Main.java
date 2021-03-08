import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(11);

        System.out.println(ListUtils.getMax(list));


    }


}
