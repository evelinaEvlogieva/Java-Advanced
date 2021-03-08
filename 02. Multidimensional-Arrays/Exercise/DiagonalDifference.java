import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    primaryDiagonalSum += matrix[row][col];
                }
            }
        }

//        //калкулиране на първия диагонал с while:
//        int r = 0;
//        int c = 0;
//        while (r < matrix.length && c < matrix[r].length){
//            primaryDiagonalSum += matrix[r++][c++];
//        }

        int r = matrix.length - 1;
        int c = 0;
        while (r >= 0 && c < matrix[r].length){
            secondaryDiagonalSum += matrix[r--][c++];
        }


        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
