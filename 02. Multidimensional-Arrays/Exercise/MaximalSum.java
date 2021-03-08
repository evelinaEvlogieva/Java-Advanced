import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int r = 0;
        int c = 0;

        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row + 1][col] + matrix[row - 1][col]
                        + matrix[row][col + 1] + matrix[row][col - 1] + matrix[row - 1][col - 1]
                        + matrix[row + 1][col + 1] + matrix[row + 1][col - 1] + matrix[row - 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    r = row - 1;
                    c = col - 1;
                }
            }

        }

        System.out.println("Sum = " + maxSum);

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }


    }
}
