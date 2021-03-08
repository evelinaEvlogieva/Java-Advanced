import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        Path inPath = Paths.get("C:\\Users\\User\\Desktop\\задачи - Advanced\\advanced\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        File file = new File(String.valueOf(inPath));

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            long totalSum = 0;

            while (line != null){
                int sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }

                totalSum += sum;
                line = reader.readLine();
            }

            System.out.println(totalSum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
