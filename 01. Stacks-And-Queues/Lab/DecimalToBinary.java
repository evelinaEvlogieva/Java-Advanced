import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine());

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        if (decimalNum == 0){
            System.out.println(decimalNum);
        } else {
            while (decimalNum != 0){
                stack.push(decimalNum % 2);
                decimalNum /= 2;
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
