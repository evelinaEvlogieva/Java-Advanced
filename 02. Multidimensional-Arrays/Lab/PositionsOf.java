import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] array = new int[rows][cols];

        for (int row = 0; row < array.length; row++) {
            array[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

//        for (int row = 0; row < array.length; row++) {
//            String[] dataArray = scanner.nextLine().split("\\s+");
//            for (int col = 0; col < array[row].length; col++) {
//                array[row][col] = Integer.parseInt(dataArray[col]);
//            }
//        }

        int number = Integer.parseInt(scanner.nextLine());

        boolean isThere = false;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == number){
                    isThere = true;
                    System.out.printf("%d %d%n", row, col);
                }
            }
        }

        if (!isThere){
            System.out.println("not found");
        }
    }
}
