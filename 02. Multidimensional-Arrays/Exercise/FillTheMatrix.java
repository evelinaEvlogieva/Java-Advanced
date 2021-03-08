import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] numbers = new int[size][size];

        if (pattern.equals("A")) {

            numbers = fillWithPatternA(size);

        } else {
            numbers = fillWithPatternB(size);

        }

        printMatrix(numbers);
    }


    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] fillWithPatternA(int size) {
        int number = 1;
        int[][] matrix = new int[size][size];
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = number++;
            }
        }
        return matrix;
    }

    private static int[][] fillWithPatternB(int size) {
        int number = 1;
        int[][] matrix = new int[size][size];
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = number++;
                }
            }

        }
        return matrix;
    }

}
