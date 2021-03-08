import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        List<List<Integer>> matrix = generateMatrix(rows, cols);


        String lines = scanner.nextLine();

        while (!"Nuke it from orbit".equals(lines)) {
            String[] data = lines.split("\\s+");
            int row = Integer.parseInt(data[0]);
            int col = Integer.parseInt(data[1]);
            int radius = Integer.parseInt(data[2]);

            for (int r = row - radius; r <= row + radius ; r++) {
                if (isInBounds(matrix, r, col)){
                    matrix.get(r).set(col, 0);
                }
            }

            for (int c = col - radius; c <= col + radius ; c++) {
                if (isInBounds(matrix, row, c)){
                    matrix.get(row).set(c, 0);
                }
            }

            for (int r = 0; r < matrix.size(); r++) {
                matrix.set(r, matrix.get(r).stream().filter(element -> element != 0).collect(Collectors.toList()));

                if(matrix.get(r).size() == 0){
                    matrix.remove(r);
                    r--;
                }
            }

            lines = scanner.nextLine();
        }




        printMatrix(matrix);

    }

    private static boolean isInBounds(List<List<Integer>> matrix, int row, int col){
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (int r = 0; r < matrix.size(); r++) {
            for (int c = 0; c < matrix.get(r).size(); c++) {
                System.out.print(matrix.get(r).get(c) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generateMatrix(int rows, int cols) {
        List<List<Integer>> matrix = new ArrayList<>();
        int value = 1;

        for (int r = 0; r < rows; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c < cols; c++) {
                row.add(value);
                value++;
            }
            matrix.add(row);
        }
        return matrix;
    }


}
