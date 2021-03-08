import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {


        String inPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (FileInputStream fis = new FileInputStream(inPath);
             FileOutputStream fos = new FileOutputStream(outPath)) {

            int oneByte = fis.read();
            while (oneByte >= 0){
                if (oneByte != ',' && oneByte != '.' && oneByte != '!' && oneByte != '?'){
                    fos.write(oneByte);
                }

                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
