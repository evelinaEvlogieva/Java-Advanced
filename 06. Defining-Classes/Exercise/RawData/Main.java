package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];

            List<Double> pressures = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            for (int j = 5; j < data.length; j += 2) {
                pressures.add(Double.parseDouble(data[j]));
            }
            for (int j = 6; j < data.length; j += 2) {
                ages.add(Integer.parseInt(data[j]));

            }

            Car car = new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType),
                    new Tire(pressures, ages));

            listOfCars.add(car);

        }

        String type = scanner.nextLine();

        for (Car car : listOfCars) {
            if (type.equals(car.getCarCargoType())){
                if ("fragile".equals(car.getCarCargoType()) && car.checkPressure()){
                    System.out.println(car.getModel());

                } else if ("flamable".equals(car.getCarCargoType()) && car.getCarEnginePower() > 250){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
