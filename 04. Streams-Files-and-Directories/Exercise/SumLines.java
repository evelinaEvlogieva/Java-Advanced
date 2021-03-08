import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SumLines {
    public static void main(String[] args) {

        Path inPath = Paths.get("C:\\Users\\User\\Desktop\\задачи - Advanced\\advanced\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        File file = new File(String.valueOf(inPath));

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null){
                int sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;

                }
                System.out.println(sum);
                line = reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
