package Car;

import Car.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            if (input.length == 1) {
                Car car = new Car(input[0]);
                listOfCars.add(car);

            } else {
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                listOfCars.add(car);

            }


        }

        for (Car car : listOfCars) {
            car.getInfo();
        }


    }
}
