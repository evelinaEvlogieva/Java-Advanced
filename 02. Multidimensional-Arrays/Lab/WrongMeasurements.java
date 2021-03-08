import java.util.ArrayList;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            matrix[row] = new int[input.length];
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int wrongValue = matrix[r][c];

        ArrayList<Integer> values = new ArrayList<>();

        ArrayList<int[]> indexes = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    int validValue = getValidValue(matrix, row, col, wrongValue);
                    values.add(validValue);
                    indexes.add(new int[]{row, col});
                }
            }
        }

        for (int i = 0; i < values.size(); i++) {
            matrix[indexes.get(i)[0]][indexes.get(i)[1]] = values.get(i);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static int getValidValue(int[][] matrix, int row, int col, int wrongValue) {

        int sum = 0;

        if (isInBounds(row + 1, col, matrix) && matrix[row + 1][col] != wrongValue) {
            sum += matrix[row + 1][col];
        }

        if (isInBounds(row - 1, col, matrix) && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }

        if (isInBounds(row, col + 1, matrix) && matrix[row][col + 1] != wrongValue) {
            sum += matrix[row][col + 1];
        }

        if (isInBounds(row, col - 1, matrix) && matrix[row][col - 1] != wrongValue) {
            sum += matrix[row][col - 1];
        }


        return sum;
    }

    private static boolean isInBounds(int r, int c, int matrix[][]) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
