import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ALL_CAPITALS {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\User\\Desktop\\задачи - Advanced\\advanced\\Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\output.txt";

//        try (BufferedReader reader = new BufferedReader(new FileReader(new File(inputPath)));
//           PrintWriter writer = new PrintWriter(new FileWriter(outPath)))
//
//     Ако е в скоби не е нужно да се пише writer.close()!!!!


        try  {
            BufferedReader reader = new BufferedReader(new FileReader(new File(inputPath)));

            PrintWriter writer = new PrintWriter(new FileWriter(outPath));

            String line = reader.readLine();

            while (line != null) {
                writer.println(line.toUpperCase());

                line = reader.readLine();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
