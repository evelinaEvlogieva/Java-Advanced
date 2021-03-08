import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

       String inputLines = scanner.nextLine();

        while(!"END".equals(inputLines)){
            String[] data = inputLines.split("\\s+");
            String command = data[0];
            if (!"swap".equals(command) || data.length != 5){
                System.out.println("Invalid input!");
            } else {
                int row1 = Integer.parseInt(data[1]);
                int col1 = Integer.parseInt(data[2]);
                int row2 = Integer.parseInt(data[3]);
                int col2 = Integer.parseInt(data[4]);

                if ((row1 >=0 && row1 < matrix.length) && (row2 >=0 && row2 < matrix.length)
                    && (col1 >=0 && col1 < matrix[row1].length) && (col2 >=0 && col2 < matrix[row2].length)){
                    String oldValue = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = oldValue;

                    printMatrix(matrix);

                } else {
                    System.out.println("Invalid input!");
                }
            }

            inputLines = scanner.nextLine();

        }

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
