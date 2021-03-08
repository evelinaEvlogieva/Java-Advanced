import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(factorialCalc(number));

    }

    private static long factorialCalc(int number) {
        if (number == 1){
            return number;
        }

        return number * factorialCalc(number - 1);

    }
}
