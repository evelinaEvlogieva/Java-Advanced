import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (Scanner scanner = new Scanner(new FileReader(inPath));
             PrintWriter printWriter = new PrintWriter(outPath)) {

            while(scanner.hasNext()){
                scanner.next();
                if (scanner.hasNextInt()){
                    printWriter.println(scanner.nextInt());
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
