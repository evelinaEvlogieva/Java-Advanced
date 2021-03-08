import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> cars = new HashSet<>();

        while (!"END".equals(input)) {
            String[] dataInput = input.split(", ");
            String direction = dataInput[0];
            String carNumber = dataInput[1];

            if ("IN".equals(direction)) {
                cars.add(carNumber);
            } else if ("OUT".equals(direction)) {
                cars.remove(carNumber);

            }
            input = scanner.nextLine();
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }

    }
}
