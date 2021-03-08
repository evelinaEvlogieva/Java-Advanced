import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");

            map.putIfAbsent(name, new ArrayList<>());
            for (String grade : grades) {
                map.get(name).add(Double.parseDouble(grade));
            }
        }

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double sum = 0;
            for (Double grade : entry.getValue()) {
                sum += grade;
            }

            double avg = sum/ entry.getValue().size();

            System.out.printf("%s is graduated with %s%n", entry.getKey(), avg);
        }

    }
}
