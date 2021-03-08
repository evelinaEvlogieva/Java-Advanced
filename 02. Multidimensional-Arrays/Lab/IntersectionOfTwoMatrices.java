import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];

        for (int row = 0; row < matrix1.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix1[row][col] = input[col].charAt(0);
            }
        }

        for (int row = 0; row < matrix2.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix2[row][col] = input[col].charAt(0);
            }
        }


        char[][] result = new char[rows][cols];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] == matrix2[row][col]) {
                    result[row][col] = matrix1[row][col];
                } else {
                    result[row][col] = '*';
                }
            }
        }
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

    }
}
