import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = getPalindrome(row, col);
            }
        }

       printMatrix(matrix);
    }

    private static String getPalindrome(int row, int col) {
        char firstAndLastLetter = (char)(row + 97);
        char middleLetter = (char)(row + col + 97);

        String result = firstAndLastLetter + "" + middleLetter + "" +  firstAndLastLetter + "";

        return result;
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
