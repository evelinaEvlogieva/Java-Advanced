package SpeedRacing;

import SpeedRacing.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> mapOfCars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCost = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, fuelCost);
            mapOfCars.put(model, car);
        }

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String[] data = input.split("\\s+");
            String model = data[1];
            int kmAmount = Integer.parseInt(data[2]);

            if (mapOfCars.containsKey(model)){
                if (!mapOfCars.get(model).checkDrivingCapability(kmAmount)){
                    System.out.println("Insufficient fuel for the drive");
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : mapOfCars.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
