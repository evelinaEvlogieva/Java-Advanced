import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols1 = scanner.nextLine().split("\\s+");
        int rows1 = Integer.parseInt(rowsAndCols1[0]);
        int cols1 = Integer.parseInt(rowsAndCols1[1]);
        int[][] matrix1 = new int[rows1][cols1];
        for (int row = 0; row < matrix1.length; row++) {
            String[] arrayData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix1[row][col] = Integer.parseInt(arrayData[col]);
            }
        }

        String[] rowsAndCols2 = scanner.nextLine().split("\\s+");
        int rows2 = Integer.parseInt(rowsAndCols2[0]);
        int cols2 = Integer.parseInt(rowsAndCols2[1]);
        int[][] matrix2 = new int[rows2][cols2];
        for (int row = 0; row < matrix2.length; row++) {
            String[] arrayData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix2[row].length; col++) {
                matrix2[row][col] = Integer.parseInt(arrayData[col]);
            }
        }


        if (rows1 == rows2 && cols1 == cols2){
            boolean isEqual = true;
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[row].length; col++) {
                    if (matrix1[row][col] == matrix2[row][col]){
                        isEqual = true;
                    } else {
                        isEqual = false;
                        break;
                    }
                }
            }

            if (isEqual){
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }

        } else {
            System.out.println("not equal");
        }
    }
}
