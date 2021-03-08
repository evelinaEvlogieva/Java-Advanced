import java.io.*;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) {


        String inPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (FileInputStream fis = new FileInputStream(inPath);
             FileOutputStream fos = new FileOutputStream(outPath)){

            int oneByte = fis.read();

            while (oneByte >= 0){
                if (oneByte == 32 || oneByte == 10){
                    fos.write(oneByte);
                } else {
                    String byteAsText = String.valueOf(oneByte);
                    for (int i = 0; i < byteAsText.length(); i++) {
                        int symbol = byteAsText.charAt(i);
                        fos.write(symbol);
                    }
                }

                oneByte = fis.read();

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
