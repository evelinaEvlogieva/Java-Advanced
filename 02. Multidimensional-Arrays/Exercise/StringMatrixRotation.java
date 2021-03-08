import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pattern p = Pattern.compile("\\((?<d>[\\d]+)\\)");
        String command = scanner.nextLine();
        Matcher m = p.matcher(command);
        int degree = 0;
        if(m.find()){
            degree = Integer.parseInt(m.group("d"));
        }
        degree = degree%360;
        List<String> input = new ArrayList<>();
        int maxlenght = -1;
        String data = scanner.nextLine();
        while (!data.equals("END")){
            input.add(data);
            if (data.length()>maxlenght){
                maxlenght=data.length();
            }
            data = scanner.nextLine();
        }
        char[][] matrix = new char[input.size()][maxlenght];
        for (int i = 0; i < input.size(); i++) {
            String s = input.get(i);
            while (s.length()<maxlenght){
                s+= " ";
            }
            matrix[i]=s.toCharArray();
        }
        if (degree==0){
            Rotate0(matrix,input.size(),maxlenght);
        }else if(degree==90){
            Rotate90(matrix,input.size(),maxlenght);
        }else if(degree==180){
            Rotate180(matrix,input.size(),maxlenght);
        }else if(degree==270){
            Rotate270(matrix,input.size(),maxlenght);
        }
    }

    public static void Rotate0(char[][] matrix,int row,int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void Rotate180(char[][] matrix,int row,int column){
        char[][] r180 = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                r180[i][j] = matrix[row-i-1][column-j-1];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(r180[i][j]);
            }
            System.out.println();
        }
    }
    public static void Rotate90(char[][] matrix,int row,int column){
        char[][] r90 = new char[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                r90[i][j] = matrix[row-j-1][i];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(r90[i][j]);
            }
            System.out.println();
        }
    }
    public static void Rotate270(char[][] matrix,int row,int column){
        char[][] r270 = new char[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                r270[i][j] = matrix[j][column-i-1];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(r270[i][j]);
            }
            System.out.println();
        }
    }
}
