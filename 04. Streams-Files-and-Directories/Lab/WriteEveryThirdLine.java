import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String inPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        int pos = 1;

        try (BufferedReader bfr = new BufferedReader(new FileReader(inPath));
             BufferedWriter bfw = new BufferedWriter(new PrintWriter(outPath))) {

            String line = "";

            while ((line = bfr.readLine()) != null){
                if (pos % 3 == 0){
                    bfw.write(line);
                    bfw.newLine();
                }

                pos++;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
