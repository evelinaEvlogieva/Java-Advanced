import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {


        String path = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try(FileInputStream fis = new FileInputStream(path)){
            int oneByte = fis.read();

            while (oneByte >= 0){
                String result = Integer.toBinaryString(oneByte);
                System.out.print((result + " "));

                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
