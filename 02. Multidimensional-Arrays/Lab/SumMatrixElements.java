import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] array = new int[rows][cols];

        for (int row = 0; row < array.length; row++) {
            String[] inputData = scanner.nextLine().split(", ");
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = Integer.parseInt(inputData[col]);
            }
        }

        int sum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
