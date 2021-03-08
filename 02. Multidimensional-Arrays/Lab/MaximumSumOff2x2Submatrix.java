import java.util.Scanner;

public class MaximumSumOff2x2Submatrix {
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

        int maxSum = Integer.MIN_VALUE;
        String firstLine = "";
        String secondLine = "";

        for (int row = 0; row < array.length - 1; row++) {
            for (int col = 0; col < array[row].length - 1; col++) {
                int sum = array[row][col] + array[row][col + 1] + array[row + 1][col] + array[row + 1][col + 1];
                if (sum > maxSum){
                    maxSum = sum;
                    firstLine = array[row][col] + "" + " " + array[row][col + 1]+"";
                    secondLine = array[row + 1][col] + "" + " " + array[row + 1][col + 1]+"";
                }
            }
        }

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(maxSum);

    }
}
