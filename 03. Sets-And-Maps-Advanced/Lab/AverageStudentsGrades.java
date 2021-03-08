import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapOfGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            mapOfGrades.putIfAbsent(name, new ArrayList<>());
            mapOfGrades.get(name).add(grade);

        }

        //Ivancho -> 5.20 3.20 (avg: 4.20)
        for (Map.Entry<String, List<Double>> entry : mapOfGrades.entrySet()) {
            double sum = 0;

            for (Double grade : entry.getValue()) {
                sum += grade;
            }

            double avg = sum / entry.getValue().size();

           String grades = entry.getValue().stream()
                   .map(g -> String.format("%.2f", g))
                   .collect(Collectors.joining(" "));

            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(), grades, avg);

        }
    }
}
