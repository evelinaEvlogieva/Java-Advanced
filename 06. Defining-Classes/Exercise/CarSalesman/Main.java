package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> listOfEngines = new ArrayList<>();
        List<Car> listCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);

            if (engineData.length == 2) {
                Engine engine = new Engine(model, power);
                listOfEngines.add(engine);
            } else if (engineData.length == 3) {
                char firstSymbol = engineData[2].charAt(0);
                if (Character.isDigit(firstSymbol)) {
                    int displacement = Integer.parseInt(engineData[2]);
                    Engine engine = new Engine(model, power, displacement);
                    listOfEngines.add(engine);
                } else {
                    String efficiency = engineData[2];
                    Engine engine = new Engine(model, power, efficiency);
                    listOfEngines.add(engine);
                }

            } else {
                int displacement = Integer.parseInt(engineData[2]);
                String efficiency = engineData[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                listOfEngines.add(engine);
            }
        }

        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            String engine = carData[1];

            if (carData.length == 2) {
                Car car = new Car(model, engine);
                listCars.add(car);

            } else if (carData.length == 3) {
                char firstSymbol = carData[2].charAt(0);
                if (Character.isDigit(firstSymbol)) {
                    int weight = Integer.parseInt(carData[2]);
                    Car car = new Car(model, engine, weight);
                    listCars.add(car);
                } else {
                    String color = carData[2];
                    Car car = new Car(model, engine, color);
                    listCars.add(car);
                }

            } else {
                int weight = Integer.parseInt(carData[2]);
                String color = carData[3];
                Car car = new Car(model, engine, weight, color);
                listCars.add(car);
            }
        }

        for (Car car : listCars) {
            System.out.println(car.getModel() + ":");
            for (Engine engine : listOfEngines) {
                if (car.getEngine().equals(engine.getModel())) {
                    System.out.println(engine.getModel() + ":");
                    System.out.println("Power: " + engine.getPower());
                    if (engine.getDisplacement() == 0) {
                        System.out.println("Displacement: n/a");
                    } else {
                        System.out.println("Displacement: " + engine.getDisplacement());
                    }
                    System.out.println("Efficiency: " + engine.getEfficiency());
                }
            }

           if (car.getWeight() == 0){
               System.out.println("Weight: n/a");
           } else {
               System.out.println("Weight: " + car.getWeight());
           }

            System.out.println("Color: " + car.getColor());
        }

    }
}
